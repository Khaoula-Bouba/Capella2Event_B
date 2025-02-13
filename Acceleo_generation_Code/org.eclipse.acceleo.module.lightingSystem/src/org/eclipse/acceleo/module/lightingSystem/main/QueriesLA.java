package org.eclipse.acceleo.module.lightingSystem.main;

import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.la.LogicalComponent;;

public class QueriesLA {

	public Set<LogicalComponent> allLogComponents = new HashSet<>();
    
    //{key : ComposantName, value : [list of functions(Strings]}
    public Map<String, List<String>> allFunctions = new HashMap<>();
	
	//{ key : inputId / OutputId, Value : exchangeName (engineOn) }
	public Map<String, String> inputValues = new HashMap<>();
	public Map<String, String> outputValues = new HashMap<>();
	
	//{ key : functionId, Value : [id(inputs/outputs)] }
	public Map<String, List<String>> functionInputs = new HashMap<>();
	public Map<String, List<String>> functionOutputs = new HashMap<>();
	
	//{ key : Var_VEHICLE, Value : [engineON, engineOFF] }
	public Map<String, Set<String>> variables = new HashMap<>();
	
	//{ key : Var_Degree, Value : NATURAL  / INTEGER }
	public Map<String, String> numericVariables = new HashMap<>();
	
	//{ key : CORNERING_LIGHTS, Value : [VAR_CORNERING_LIGHTS, VAR_CORNERING_LIGHTS2] }
	public Map<String, Set<String>> setVariables= new HashMap<>();
	
	public Map<String, String> initialisations = new HashMap<>();
	public Map<String, Set<String>> invariants = new HashMap<>();
	public Map<String, List<String>> invariantsMap = new HashMap<>();
	
	public Map<String, List<String>> functionsConstraints = new HashMap<>();
	
	public List<String> gatherFunctions = new ArrayList<>();
	
	public final List<String> funtionType = Arrays.asList("GATHER", "SPLIT", "DUPLICATE", "ROUTE", "SELECT");
	
	public Map<String, Set<String>> preConditions = new HashMap<>();
	
	public Map<String, List<Set<String>>> preConditionsGather = new HashMap<>();
	public Map<String, Set<String>> gatherValues = new HashMap<>();
	
	public final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
	
	// Fill functionInputs && functionOutputs maps
	public String getFunctionInputsAndOutputs(ComponentFunctionalAllocation function, Set<FunctionInputPort> inputs,
			Set<FunctionOutputPort> outputs) {

		String ownedFunctionId = function.getTargetElement().getId();
		List<AbstractConstraint> constrs = function.getTargetElement().getOwnedConstraints();
		
		List<String> inputsFunction = inputs.stream().map(FunctionInputPort::getId).collect(Collectors.toList());
		List<String> outputsFunction = outputs.stream().map(FunctionOutputPort::getId).collect(Collectors.toList());
		List<String> constraints = constrs.stream()
                                          .map(abstractConst -> abstractConst.getLabel())
                                          .collect(Collectors.toList());
		if(!constraints.isEmpty()) {
			functionsConstraints.put(ownedFunctionId, constraints);
		}
		
		functionInputs.put(ownedFunctionId, inputsFunction);
		functionOutputs.put(ownedFunctionId, outputsFunction);

		return StringUtil.EMPTY_STRING;
	}
    
	public String getInputOutputValues(Set<FunctionalExchange> exchanges) {
		for(FunctionalExchange exchange : exchanges) {
			String targetId = exchange.getTarget().getId();
			String sourceId = exchange.getSource().getId();		
			inputValues.put(targetId, exchange.getName());
			outputValues.put(sourceId, exchange.getName());
		}
		
		return StringUtil.EMPTY_STRING;
	}
		
	public Set<LogicalComponent> getAllLogicalComponents(Set<LogicalComponent> components) {
		for(LogicalComponent component : components) {
			//only if the logical component has functions in it
			if(!component.getOwnedFunctionalAllocation().isEmpty()) {
				allLogComponents.add(component);
			}
			getAllLogicalComponents(component.getOwnedLogicalComponents().stream().collect(Collectors.toSet()));
		}
		
		return allLogComponents;
	}
	
	public String fillSetsPart(LogicalComponent component, Set<ComponentFunctionalAllocation> functions, LogicalComponent lastcomponent) {
		Set<String> exchangesValues = new HashSet<>();
		StringBuilder resultStr = new StringBuilder().append(component.getName()+" = {");
		Set<String> variablesNames = new HashSet<>();
		Set<String> set1 = new HashSet<>();
		fillInitialisations(component);
		
		for (ComponentFunctionalAllocation function : functions) {
			Set<String> functionInputsvalues = new HashSet<>();
			//set1 = new HashSet<>();
			String functionId = function.getTargetElement().getId();
			EClass classe = function.getTargetElement().eClass();
			EStructuralFeature featureKind = classe.getEStructuralFeature("kind");
			String functionKind = function.getTargetElement().eGet(featureKind).toString();
			
			//just functions with type "FUNCTION"
			if(!funtionType.contains(functionKind)) {
				List<String> inputs = functionInputs.get(functionId);
				for (String inputValue : inputs) {
					String value = inputValues.get(inputValue);
					functionInputsvalues.add(value);
					exchangesValues.add(value);
				}
				int sizeFunctionInputsvalues = functionInputsvalues.size();
				//functionInputsvalues.remove(functionInputsvalues.iterator().next());
				int i = 0;
				//function with different inputs
				if(sizeFunctionInputsvalues > 1) {
					functionInputsvalues.remove(functionInputsvalues.iterator().next());
					Iterator<String> itr = functionInputsvalues.iterator();
					while (itr.hasNext()) {
						String secondValue = itr.next();
						i++;
						Set<String> set2 = new HashSet<>();
						set2.add(secondValue);
						set1.add(secondValue);
						variables.put("Var_" + component.getName() + i, set2);
						variablesNames.add("Var_" + component.getName() + i);
					}
				}
			}else if("GATHER".equals(functionKind)) {
				gatherFunctions.add(functionId);
			} 
		}
		
		boolean isNumeric = getNumVariableType(component.getName(), exchangesValues);
		
		if(Pattern.matches("\\d+", initialisations.get(component.getName()))) {
			isNumeric = true;
		}
		
		exchangesValues.add(initialisations.get(component.getName()));
		exchangesValues.forEach(value -> resultStr.append(value+", "));
		resultStr.setLength(resultStr.length() - 2);
		resultStr.append("};");
		exchangesValues.removeAll(set1);
		variables.put("Var_"+component.getName(), exchangesValues);
		variablesNames.add("Var_"+component.getName());
		if(component.getName().equals(lastcomponent.getName())){
			resultStr.deleteCharAt(resultStr.length() - 1);
		}
		resultStr.append("\n");
		//setVariables.put(component.getName(), variablesNames);
		if(isNumeric){
			variablesNames.add("Var_"+component.getName());
			List<String> valToDelete = new ArrayList<>();
			for(String exchgVal : exchangesValues) {
				if(!Pattern.matches("\\d+", exchgVal)) {
					Set<String> set = new HashSet<>();
					Set<String> set2 = new HashSet<>();
					set.add("Var_"+exchgVal);
					set2.add(exchgVal);
					initialisations.put(exchgVal, "0");
					variables.put("Var_"+exchgVal, set2);
					numericVariables.put(exchgVal, "INTEGER");
					setVariables.put(exchgVal, set);
					valToDelete.add(exchgVal);
				}
			}
			numericVariables.put(component.getName(), "INTEGER");
			variables.get("Var_"+component.getName()).removeAll(valToDelete);
		}
		setVariables.put(component.getName(), variablesNames);
		
		if(isNumeric) {
			return StringUtil.EMPTY_STRING;
		}else {
			return resultStr.toString();
		}
	}
	
	public String getVariables() {
		StringBuilder variableStr = new StringBuilder();
		Set<String> variablesSet = variables.keySet();
		String lastElement = variablesSet.stream().reduce((prev, next) -> next).orElse(null);
		variablesSet.forEach(variable -> {
			                        variableStr.append(variable+", ");
			                        if(variable.equals(lastElement)){
			                			variableStr.deleteCharAt(variableStr.length() - 2);
			                        }
			                        variableStr.append("\n    ");
			                 });
		
		return variableStr.toString();
	}
	
	public String getInvariants(String firstSepa, String secondSepa) {
		StringBuilder invariantsStr = new StringBuilder();
		invariantsStr =  fillSecondThirdPart(invariantsStr, firstSepa, secondSepa, true);
		String lastElement = invariants.keySet().stream().reduce((prev, next) -> next).orElse(null);
		return getPropertiesPredicates(invariantsStr, lastElement);
	}
	
	public String getPropertiesPredicates(StringBuilder str1, String lastkey) {
		
		List<String> carachtersToKeep = Arrays.asList("(", ")", "&", "or", ">", "<", ">=", "<=");
		invariants.entrySet().forEach(entry -> {
			Set<String> invariantExp = entry.getValue();
			invariantExp.stream().forEach(invarExp -> {
				if(invarExp.contains(">>")) {
					String[] invariantExpression = invarExp.split(" >> ");
					
					if(!invariantsMap.containsKey(invariantExpression[0])) {
						invariantsMap.put(invariantExpression[0], new ArrayList<>());
					}
					invariantsMap.get(invariantExpression[0]).add(invariantExpression[1]);
					str1.append("(");
					String[] invariantElements = invarExp.split(" ");
					String key = StringUtil.EMPTY_STRING;
					for (String invariant : invariantElements) {
						if (carachtersToKeep.contains(invariant)) {
							str1.append(" "+invariant+" ");
						}else if(">>".equals(invariant)) {
							str1.append(" => ");
						} else {
							String[] invarArr = {invariant};
							String operand = "=";
				
							if(invarArr[0].substring(0, 4).equals("not(")) {
								operand =  "/=";
								invarArr[0] = invarArr[0].substring(4);
								invarArr[0] = invarArr[0].substring(0, invarArr[0].length() - 1);
							}
							
							key = variables.entrySet().stream().filter(entry1 -> entry1.getValue().contains(invarArr[0]))
									.map(Map.Entry::getKey).findFirst().orElse(StringUtil.EMPTY_STRING);
							
							if(numericVariables.containsKey(invarArr[0])) {
								str1.append(key);
							}else {
								str1.append(key + " "+operand+" " + invarArr[0]);
							}
							
						}
					}
					str1.append(") &");
				}else {
					str1.append("    "+entry.getKey()+" : "+invarExp+" &");
				}
				
				if(invariants.size() > 1 && entry.getKey().equals(lastkey)) {
					str1.deleteCharAt(str1.length() - 1);
				}
				str1.append("\n    ");
			});
		});
		
		if(invariants.size() == 1) {
			int lastIndex = str1.lastIndexOf("&\n    ");
			str1.replace(lastIndex, lastIndex + str1.length(), "");
			str1.append("\n");
		}
		return str1.toString();
	}
	
	public String getInitialisations(String firstSepa, String secondSepa) {
		StringBuilder initialisationStr = new StringBuilder();
		numericVariables.entrySet().stream().forEach(var -> {
			if(initialisations.get(var.getKey()) == null || initialisations.get(var.getKey()).isEmpty()) {
				initialisations.put(var.getKey(), "0");
			}
		});
		return fillSecondThirdPart(initialisationStr, firstSepa, secondSepa, false).toString();
	}
	
	public void fillInitialisations(LogicalComponent component) {
		List<AbstractConstraint> constraintInvariant = component.getOwnedConstraints();
		//initialisations
		Set<String> constrs1 = constraintInvariant.stream()
                                                   .filter(constraint -> constraint.getLabel().startsWith("="))
                                                   .map(constraint -> constraint.getLabel().substring(2))
                                                   .collect(Collectors.toSet());
		//invariants
		Set<String> constrs2 = constraintInvariant.stream()
                                                  .filter(constraint -> constraint.getLabel().startsWith(":"))
                                                  .map(constraint -> constraint.getLabel().substring(2))
                                                  .collect(Collectors.toSet());
		if(!constrs2.isEmpty()) {
			invariants.put(component.getName(), constrs2);
		}
	
		if(!constrs1.isEmpty()) {
			initialisations.put(component.getName(), constrs1.iterator().next());
		}
		
	}
	
	public StringBuilder fillSecondThirdPart(StringBuilder str, String firstSepa, String secondSepa, boolean isInvariant) {
		int offset = isInvariant ? 1 : 2;
	    Set<String> allVariables = new HashSet<>();
	    //List<Interac>
		setVariables.values().forEach(set -> allVariables.addAll(set));
		String lastElement = allVariables.stream().reduce((prev, next) -> next).orElse(null);
		allVariables.forEach(variable -> {
			String variableSet = setVariables.entrySet().stream()
					.filter(entry -> entry.getValue().contains(variable)).map(Map.Entry::getKey).findFirst()
					.orElse("");
			String rightSide = StringUtil.EMPTY_STRING;
			if(isInvariant) {
				rightSide = numericVariables.containsKey(variableSet) ? numericVariables.get(variableSet): variableSet;
			}else {
				rightSide = initialisations.entrySet().stream()
						.filter(entry -> entry.getKey().contains(variableSet)).map(Map.Entry::getValue).findFirst()
						.orElse("");
			}
			
			str.append(variable+" "+firstSepa+" " + rightSide+" "+secondSepa);
			if(variable.equals(lastElement)) {
				str.setLength(str.length() - offset);
				if(isInvariant && !invariants.isEmpty()) {
					str.append("&");
				}
			}
			str.append("\n    ");
		});
		
		return str;
	}
	
	public String getEvents(LogicalComponent component, String functionId, String functionName, String type, Set<FunctionalExchange> exchanges) {
		
		StringBuilder strEvent = new StringBuilder();
		StringBuilder strEventAction = new StringBuilder();
		List<String> sysFunctionInputs = functionInputs.get(functionId);
		List<String> functionConstraints = functionsConstraints.get(functionId);
		
		String functName = functionName.contains(" ") ? functionName.replaceAll(" ", "_") : functionName;
		
		if (!funtionType.contains(type) && sysFunctionInputs != null && !sysFunctionInputs.isEmpty()) {
			strEvent.append("      "+functName+" =\n      ANY\n        param\n      WHERE\n        "
					+ "param : ");
			String paramTypage = numericVariables.containsKey(component.getName()) ? numericVariables.get(component.getName()): component.getName();
			strEvent.append(paramTypage);
			Set<String> valuesInputs = sysFunctionInputs.stream().map(val -> inputValues.get(val)).collect(Collectors.toSet());
			valuesInputs.stream().forEach(valInput -> {
				       strEvent.append(" & param /= ");
				       strEvent.append(variables.entrySet().stream().filter(entry -> entry.getValue().contains(valInput))
						                               .map(Map.Entry::getKey).findFirst().orElse(StringUtil.EMPTY_STRING));
			});
			strEvent.append("\n       ");
			
			//if the function contains a constraint that defines the precondition
			if (functionConstraints != null && !functionConstraints.isEmpty()) {
				checkMethodsConstraints(functionConstraints, strEvent);
			}else {
				findPreviousFunction(exchanges, sysFunctionInputs, false);
				strEvent.append(constructGuards());
			}
			
			if("Moving_Label_Down".equals(functionName)) {
				System.out.println("===");
			}
			
			strEvent.append("\n      THEN").append("\n\t    ");
			String lastElement = valuesInputs.stream().reduce((prev, next) -> next).orElse(null);
			
			fillEventActionPart(strEventAction, valuesInputs.stream().collect(Collectors.toCollection(ArrayList::new)));
			
			boolean containsNumValues = valuesInputs.stream().anyMatch(numericVariables.keySet()::contains);
			
			if(containsNumValues) {
				valuesInputs.stream().forEach(valInput -> {
				       strEvent.append("Var_"+component.getName()+" := "+"Var_"+valInput+";");
				       if(lastElement.equals(valInput))
				    	   strEvent.deleteCharAt(strEvent.length() - 1);
			    });	
			}else {
				valuesInputs.stream().forEach(valInput -> {
				       String varKey = variables.entrySet().stream().filter(entry -> entry.getValue().contains(valInput))
						                               .map(Map.Entry::getKey).findFirst().orElse(StringUtil.EMPTY_STRING);
				       strEvent.append(varKey+" := "+valInput+";");
				       if(lastElement.equals(valInput))
				    	   strEvent.deleteCharAt(strEvent.length() - 1);
			    });
			}
			
			strEvent.append(strEventAction);
			strEvent.append("\n        ");
			strEvent.delete(strEvent.length() - 2, strEvent.length());
			strEvent.append("END;\n");
		}
		gatherValues.clear();
		preConditionsGather.clear();
		preConditions.clear();
		return strEvent.toString();
	}
	
	public void findPreviousFunction(Set<FunctionalExchange> exchanges, List<String> inputs, boolean isGatherFunction) {
		for(String input : inputs) {
			for(FunctionalExchange exchange : exchanges) {
				if(input.equals(exchange.getTarget().getId())) {
					String source = exchange.getSource().getId();
					for (Map.Entry<String, List<String>> entry : functionOutputs.entrySet()) {
						if(entry.getValue().contains(source)) {
							String idPreviousFunction = entry.getKey();
							if(gatherFunctions.contains(idPreviousFunction)){
								isGatherFunction = true;
							}
							List<String> inputsPreviousFunction = functionInputs.get(idPreviousFunction);
							if(!inputsPreviousFunction.isEmpty()) {
								getResult(inputsPreviousFunction, exchanges, isGatherFunction, idPreviousFunction);
							}
						}
					}
					break;
			    }
			}
			
			if (isGatherFunction == false) {
				List<Set<String>> listOfLists = new ArrayList<>();
				gatherValues.values().stream().forEach(innerList -> listOfLists.add(innerList));
				preConditionsGather.put(input, listOfLists);
			}
		}
	}
	
	public boolean getResult(List<String> inputsPreviousFunction, Set<FunctionalExchange> exchanges, boolean isGatherFunction
			                                          , String currentFunctionId) {
		List<String> foundInputs = new ArrayList<>();
		List<String> unfoundInputs = new ArrayList<>();
		boolean s = false;
	    Set<String> values = preConditions.values().stream().flatMap(Collection::stream).collect(Collectors.toSet());
		unfoundInputs.addAll(inputsPreviousFunction);
		
		for(String inputId : inputsPreviousFunction) {
			Set<String> exchangesValues = new HashSet<>();
			String exchangeValue = inputValues.get(inputId);
			exchangesValues.add(exchangeValue);
			for (Map.Entry<String, Set<String>> entry : variables.entrySet()) {
				if (entry.getValue().contains(exchangeValue)) {
					String key = entry.getKey();
					if (!values.contains(exchangeValue)) { 
						if (isGatherFunction) {
							s = gatherValues.containsKey(currentFunctionId) ? gatherValues.get(currentFunctionId).add(exchangeValue)
									: gatherValues.put(currentFunctionId, exchangesValues) != null;
						} else {
							s = preConditions.containsKey(key) ? preConditions.get(key).add(exchangeValue)
									: preConditions.put(key, exchangesValues) != null;
						}
					}
					foundInputs.add(inputId);
					break;
				}
			}
		}
		
		unfoundInputs.removeAll(foundInputs);
		if(!unfoundInputs.isEmpty()) {
			findPreviousFunction(exchanges, unfoundInputs, isGatherFunction);
		}
		return s;
	}
	
	public StringBuilder constructGuards() {
		StringBuilder str = new StringBuilder();
		preConditions.entrySet().stream().forEach(condition -> condition.getValue().stream().forEach(value -> {
			Set<String> values = condition.getValue();
			String firstElement = values.stream().reduce((prev, next) -> prev).orElse(null);
			String lastElement = values.stream().reduce((prev, next) -> next).orElse(null);
			StringBuilder strTemp = (values.size() > 1 && firstElement.equals(value)) ? str.append(" & (") : str.append("");
			if(values.size() > 1) {
				str.append(" "+condition.getKey() + " = " + value);
				strTemp = firstElement.equals(value) ? str.append(" or") : str.append("");
			}else {
				str.append(" & "+condition.getKey() + " = " + value);
			}
			strTemp = (values.size() > 1 && lastElement.equals(value)) ? str.append(" ) ") : str.append("");
		}));
		return str;
	}
	
	public boolean getNumVariableType(String setName, Set<String> strNums) {
		String[] resultTemp = {StringUtil.EMPTY_STRING};
		DecimalFormatSymbols currentLocaleSymbols = DecimalFormatSymbols.getInstance();
		char localeMinusSign = currentLocaleSymbols.getMinusSign();
		boolean[] isNumeric = {false};
		strNums.stream().forEach(num -> {
			if(pattern.matcher(num).matches()) {
				resultTemp[0] = "NATURAL";
				if(num.charAt( 0 ) == localeMinusSign) {
					resultTemp[0] = "INTEGER";
				}
				isNumeric[0] = true;
			}
		});
		if(isNumeric[0]) {
			numericVariables.put(setName, resultTemp[0]);
			return true;
		}
		return false;
	}
	
	public void checkMethodsConstraints(List<String> functionConstraints, StringBuilder strEvent) {
		StringBuilder sb = new StringBuilder();
		List<String> liste = new ArrayList<>();

		for (String constraint : functionConstraints) {
			String[] constraintElement = constraint.split(" ");
			liste = Arrays.asList(constraintElement);
			sb = liste.contains("or") ? sb.append(" & (") : sb.append(" & ");
			sb = functionConstraints.size() > 1 ? sb.append("(") : sb.append("");

			for (String element : liste) {
				if ("(".equals(element) || ")".equals(element) || "&".equals(element) || "or".equals(element)) {
					sb.append(" " + element + " ");
				} else {
					String key = variables.entrySet().stream().filter(entry -> entry.getValue().contains(element))
							.map(Map.Entry::getKey).findFirst().orElse("");
					sb.append(key + " = " + element);
				}
			}
			sb = liste.contains("or") ? sb.append(")") : sb.append("");
			sb = functionConstraints.size() > 1 ? sb.append(") & ") : sb.append("");
		}
		String[] tab2 = sb.toString().split(" ");
		strEvent = "&".equals(tab2[tab2.length - 1]) ? strEvent.append(sb.toString().substring(0, sb.length() - 3))
				: strEvent.append(sb);
	}
	
	public String fillEventActionPart(StringBuilder strAction, List<String> actions) {
		for(String action : actions) {
			Set<String> newActions = new HashSet<>();
			Map<String, List<String>> map = new HashMap<>();
			for (Map.Entry<String, List<String>> entry : invariantsMap.entrySet()) {
				boolean containAction = Arrays.asList(entry.getKey().split(" ")).contains(action);
				if (containAction) {
					if (!map.containsKey(entry.getKey())) {
						map.put(entry.getKey(), new ArrayList<>());
					}
					map.get(entry.getKey()).addAll(entry.getValue());

				}
			}
			
			Set<String> actionsToAdd = new HashSet<>();
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				List<String> guards = Arrays.asList(entry.getKey().split(" "));
				for (String valeurStr : entry.getValue()) {
					if (guards.size() > 1) {
						//actionsToAdd = checkVariables(guards) ? valeurStr : actionsToAdd;
						/*
						List<String> actionsToAdd2 = invariantsMap.entrySet().stream()
                                .filter(entry1 -> Arrays.asList(entry1.getKey().split(" ")).contains(action))
                                .map(Map.Entry::getValue).findFirst().orElse(new ArrayList<>());*/
						List<String> actionsToAdd2 = invariantsMap.entrySet().stream()
                                .filter(entry1 -> Arrays.asList(entry1.getKey().split(" ")).contains(action))
                                .map(Map.Entry::getValue).findFirst().orElse(new ArrayList<>());
						
						if(newActions.isEmpty()) {
							newActions.addAll(actionsToAdd2);
						}else {
							newActions.addAll(actionsToAdd2);
							actionsToAdd2.removeAll(newActions);
						}
						actionsToAdd.addAll(actionsToAdd2);
						//actionsToAdd = actionsToAdd2.get(0);
					} else {
						
						if(!newActions.contains(valeurStr)) {
							newActions.add(valeurStr);
							actionsToAdd.add(valeurStr);
						}
						
					}
					
					for(String actionToAdd : actionsToAdd) {
					
						boolean takeOpposite = false;
						String[] invariantElements = actionToAdd.split(" ");
						List<String> liste = Arrays.asList(invariantElements);
						String key = StringUtil.EMPTY_STRING;
						strAction = actionsToAdd.isEmpty() ? strAction.append("") : strAction.append(";\n");
						
						for (String invariant : liste) {
							if(!numericVariables.keySet().contains(invariant)) {
							String actualAction = StringUtil.EMPTY_STRING;
							String initialisationSet = StringUtil.EMPTY_STRING;
							List<String> newListe = new ArrayList<>();
							String lastAction = liste.get(liste.size()-1);
							
							String[] invarArr = {invariant};
							if(invarArr[0].contains("not(") && invarArr[0].substring(0, 4).equals("not(")) {
								invarArr[0] = invarArr[0].substring(4);
								invarArr[0] = invarArr[0].substring(0, invarArr[0].length() - 1);
								takeOpposite = true;
							}
							
							key = variables.entrySet().stream().filter(entry1 -> entry1.getValue().contains(invarArr[0]))
									.map(Map.Entry::getKey).findFirst().orElse("");
							
							if(!key.isEmpty()) {
								if(takeOpposite) {
									String key1 = key.substring(4);
									initialisationSet = initialisations.get(key1);
									if(invarArr[0].equals(initialisationSet)) {
										String AssignedValue = variables.get(key).stream()
			                                                             .filter(value -> !value.equals(invarArr[0]))
			                                                             .findFirst().orElse("");
										strAction.append("        "+key + " := " + AssignedValue);
										actualAction = AssignedValue;
								    }else {
										strAction.append("        "+key + " := " + initialisationSet);
										actualAction = initialisationSet;
								    }
								}else {
									strAction.append("        "+key + " := " + invarArr[0]);
									actualAction = invarArr[0];
								}
								
								strAction = invariant.equals(lastAction) ? strAction.append("") : strAction.append(";\n");
								newListe.add(actualAction);
								fillEventActionPart(strAction, newListe);
							}	
						}
					}
					}
					actionsToAdd.clear();
				}
			}
			
			
		}
		return strAction.toString();
	}
	
	
	public boolean checkVariables(List<String> guards) {
		boolean check = true;
		for(String guard : guards) {
			String[] guardValue = {guard};
			if(guardValue[0].contains("not(") && guardValue[0].substring(0, 4).equals("not(")) {
				guardValue[0] = guardValue[0].substring(4);
				guard = guardValue[0];
				guardValue[0] = guardValue[0].substring(0, guard.length() - 1);
			}
			
			String key = variables.entrySet().stream().filter(entry -> entry.getValue().contains(guardValue[0]))
					                                  .map(Map.Entry::getKey).findFirst().orElse("");
			String initialisationValue = initialisations.get(key);
			if(!guardValue[0].equals(initialisationValue)) {
				check = false;
				break;
		    }
		}
		
		return check;
	}
}
