package org.eclipse.acceleo.module.lightingSystem.main;

import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.interaction.TimeLapse;
import org.polarsys.capella.core.data.oa.ActivityAllocation;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.Role;

public class Queries {
	//-------------- OAB ----------------------------------------
	//{ key : inputId / OutputId, Value : exchangeName (engineOn) }
    public Map<String, Set<String>> inputValues = new HashMap<>();
	
	//list of sets names
	public List<String> listNames = new ArrayList<>(); 
	
	//{ key : setName, Value : [constraint1, constraint2, ...] }
	public Map<String, List<AbstractConstraint>> constraints = new HashMap<>();
	public Map<String, Set<String>> initialisations = new HashMap<>();
	
	public Map<String, Set<String>> functions = new HashMap<>();
	
	//{key : setName, Value : []}
	public Map<String, Set<String>> variables = new HashMap<>();
	
	public Map<String, Set<String>> guardList = new HashMap<>(); 
	
	public Map<String, List<String>> functionConstraint = new HashMap<>();
	
	public Map<String, String> invariantsMap = new HashMap<>();
	
	//{ key : Var_Degree, Value : NATURAL  / INTEGER }
    public Map<String, String> numericVariables = new HashMap<>();
	public final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
	
	public StringBuilder resultInv1 = new StringBuilder();
	public StringBuilder resultInv2 = new StringBuilder();
	
	//----------------------------------------------------------------------
	
	public Set<String> getSetsNames() {
		Set<String> setNames = new HashSet<>();
		setNames.addAll(listNames);
		return setNames;
	}
	
	public Set<Entity> getAllEntities(Set<Entity> allEntities, Set<FunctionalExchange> exchanges, Boolean isScenarioDiagram) {
		Set<Entity> listeResultEntities = new HashSet<>();
		listeResultEntities = SortEntities(listeResultEntities, allEntities, isScenarioDiagram, null);
		getSetsInputs(exchanges);
		
		return listeResultEntities;
	}
	public Set<Role> getAllRoles(Set<Role> allRoles) {
		Set<Role> listeResultRoles = new HashSet<>();
		Set<String> functions2 = new HashSet<>();
		
		for(Role role : allRoles) {
			List<ActivityAllocation> activities = role.getOwnedActivityAllocations();
			if(!activities.isEmpty()) {
				listeResultRoles.add(role);
				listNames.add(role.getName());
				List<AbstractConstraint> constraintInvariant = role.getOwnedConstraints();
				constraints.put(role.getName(), constraintInvariant);
				functions2 = activities.stream()
			              .map(activityAlloc -> activityAlloc.getTargetElement().getId())
			              .collect(Collectors.toSet());
	            functions.put(role.getName(), functions2);
			}
		}
		return listeResultRoles;
	}
	
	public Set<Entity> SortEntities(Set<Entity> liste, Set<Entity> allEntities, Boolean isScenarioDiagram, String roleInstanceId){
		Set<String> functions2 = new HashSet<>();
		
		for(Entity entity : allEntities) {
			//only if the operational entity/actor has functions
			EList<ComponentFunctionalAllocation> activities = entity.getOwnedFunctionalAllocation();			
			if(activities != null && !activities.isEmpty()) {
				liste.add(entity);
				listNames.add(entity.getName());
				List<AbstractConstraint> constraintInvariant = entity.getOwnedConstraints();
				constraints.put(entity.getName(), constraintInvariant);
				functions2 = activities.stream()
						              .map(funcAlloc -> funcAlloc.getTargetElement().getId())
						              .collect(Collectors.toSet());
				functions.put(entity.getName(), functions2);
			}
			
			Set<Entity> liste1 = new HashSet<>();
			liste1.addAll(entity.getOwnedEntities());
			SortEntities(liste, liste1, isScenarioDiagram, roleInstanceId);
		}
		
		return liste;
	}
	
	public String getSetsInputs(Set<FunctionalExchange> exchanges) {
	
		for(FunctionalExchange exchange : exchanges) {
			Set<String> result = new HashSet<>();
			String valueWithoutSpaces = exchange.getName().replaceAll("\\s+","");
			result.add(valueWithoutSpaces);
            String id = exchange.getTarget().getId();
			if(inputValues.containsKey(id)) {
				inputValues.get(id).addAll(result);
	        } else {
	        	inputValues.put(id, result);
	        }
		}
		return StringUtil.EMPTY_STRING;
	}
	
	public String fillSets(Set<ComponentFunctionalAllocation> functions, Set<Role> roles, String setName, Entity setEntity) {
		StringBuilder resultStr = new StringBuilder().append(setName+" = {");
		Set<String> inputs = new HashSet<>();
		Set<String> setElements = new HashSet<>();
		String lastElement =  listNames.get(listNames.size()-1);
		
		/** Append the initial value to the set **/
	    List<AbstractConstraint> entityConstraints = setEntity.getOwnedConstraints();
		List<String> initvalue = entityConstraints.stream()
                .filter(constraint -> constraint.getLabel().startsWith("="))
                .map(constraint -> constraint.getLabel().replaceAll("=", ""))
                .collect(Collectors.toList());
		
		if(!initvalue.isEmpty()) {
			setElements.add(initvalue.get(0));
		}
		
		for (ComponentFunctionalAllocation function : functions) {
			String functionId = function.getTargetElement().getId();
			inputs = inputValues.get(functionId);
			if(inputs != null) {
				setElements.addAll(inputs);
			}
		}
		
		boolean isNumeric = getNumVariableType(setName, inputs);
		
		if(isNumeric) {
			return StringUtil.EMPTY_STRING;
		}
			
		setElements.forEach(item -> resultStr.append((item+",")));
		variables.put(setName, setElements);
		
		if(roles.isEmpty()) {
			return checkRoles(roles, resultStr, false, lastElement, setName);
		}else {
			return checkRoles(roles, resultStr, true, lastElement, setName);
		}
	}
	
	public String fillSetRoles(Set<ActivityAllocation> activities, String setRoleName, Role role) {
		StringBuilder resultStr = new StringBuilder().append(setRoleName+" = {");
		Set<String> inputs;
		Set<String> setRolesElements = new HashSet<>();
		String lastElement =  listNames.get(listNames.size()-1);
		
		/** Append the initial value to the set **/
	    List<AbstractConstraint> roleConstraints = role.getOwnedConstraints();
		List<String> initvalue = roleConstraints.stream()
                .filter(constraint -> constraint.getLabel().startsWith("="))
                .map(constraint -> constraint.getLabel().replaceAll("=", ""))
                .collect(Collectors.toList());
		
		if(!initvalue.isEmpty()) {
			setRolesElements.add(initvalue.get(0));
		}
		
		for (ActivityAllocation activity : activities) {
			String activityId = activity.getTargetElement().getId();
			if(inputValues.get(activityId) != null) {
				inputs = inputValues.get(activityId);
			}else {
				inputs = new HashSet<>();
			}
			setRolesElements.addAll(inputs);
		}
		setRolesElements.forEach(item -> resultStr.append((item+",")));
		variables.put(setRoleName, setRolesElements);
		
		return checkRoles(null, resultStr, false, lastElement, setRoleName);
	}
	
	public String checkRoles(Set<Role> roles, StringBuilder resultStr, boolean checkRoles, String lastElement, String setName) {
		
		if(resultStr.charAt(resultStr.length()-1) == '{') {
			return StringUtil.EMPTY_STRING;
		} else {
			resultStr.deleteCharAt(resultStr.length() - 1);
			resultStr = lastElement.equals(setName) ? resultStr.append("}") : resultStr.append("};");
		}
		
		if(checkRoles && lastElement.equals(setName)) {
			resultStr = roles.isEmpty() ? resultStr.deleteCharAt(resultStr.length() - 1) : resultStr;
		}
		
		return resultStr.toString();
	}
	
	public String getNumbersInitialisations() {
		StringBuilder numbersInitialisations = new StringBuilder();
		numericVariables.entrySet().stream().forEach(var -> {
			if(initialisations.get(var.getKey()) == null || initialisations.get(var.getKey()).isEmpty()) {
				Set<String> SetNumInit = new HashSet<>();
				SetNumInit.add("0");
				initialisations.put(var.getKey(), SetNumInit);
			}
			numbersInitialisations.append(var.getKey()+" : "+initialisations.get(var.getKey()));
		});
		
		return numbersInitialisations.toString();
	}
	
	public String getInvariants(String setName, String lastSetName, String firstSetName, String firstSeparator, 
			                    String startCaracter, String secondSeparator, Boolean isInvariant, Boolean isScenarioDiagram){
		
		List<AbstractConstraint> contraintsInv = constraints.get(setName);
		StringBuilder result = new StringBuilder();
	
		if(isInvariant) {
			result = lastSetName.equals(setName) ? result.append("Var_"+setName+" : "+setName) 
                    : result.append("Var_"+setName+" : "+setName+" ").append(firstSeparator).append("\n");
			resultInv1.append("  "+result);
			result.setLength(0);
		}
		
		List<String> constrs1 = contraintsInv.stream()
		                                     .filter(constraint -> constraint.getLabel().startsWith(startCaracter))
		                                     .map(constraint -> constraint.getLabel())
		                                     .collect(Collectors.toList());
		
		Set<String> constrs2 = constrs1.stream()
		                          .map(constr -> constr.substring(1))
		                          .collect(Collectors.toSet());
		
		if(!isInvariant) {
			initialisations.put(setName, constrs2);
		}
		
		if(!constrs2.isEmpty()) {
			for (String  constraint : constrs2) {
				if(constraint.contains(">>") && isInvariant) {
					String[] invariantExpression = constraint.split(" >> ");
					invariantsMap.put(invariantExpression[0], invariantExpression[1]);
					resultInv2.append("  (");
					String[] invariantElements = constraint.split(" ");
					List<String> liste = Arrays.asList(Arrays.copyOfRange(invariantElements, 1, invariantElements.length));
					String key = StringUtil.EMPTY_STRING;
					for (String invariant : liste) {
						if ("(".equals(invariant) || ")".equals(invariant) || "&".equals(invariant)) {
							resultInv2.append(" "+invariant+" ");
						}else if(">>".equals(invariant)) {
							resultInv2.append(" => ");
						} else {
							String[] invarArr = {invariant};
							String operand = "=";
							if(invarArr[0].substring(0, 4).equals("not(")) {
								operand =  "/=";
								invarArr[0] = invarArr[0].substring(4);
								invarArr[0] = invarArr[0].substring(0, invarArr[0].length() - 1);
							}
							
							key = variables.entrySet().stream().filter(entry -> entry.getValue().contains(invarArr[0]))
									.map(Map.Entry::getKey).findFirst().orElse("");
							
							resultInv2.append("Var_"+key + " "+operand+" " + invarArr[0]);
						}
					}
					resultInv2 = constrs2.size() > 1 ? resultInv2.append(") &") : resultInv2.append(")");
					resultInv2 = !lastSetName.equals(setName) ? resultInv2.append(" &\n") : resultInv2.append("");
				}else {
					if(firstSeparator.equals("||")) {
						firstSeparator = setName.equals(firstSetName) ? "" : firstSeparator;
					}
					result.append("   "+firstSeparator+" Var_"+setName);
					
					result = constraint.contains(">") || constraint.contains("<") ?
						result.append(constraint).append("\n") : result.append(" "+secondSeparator+" ").append(constraint.substring(1));
				}
			}
		}
        
		return result.toString();
	}
	
	public String fillInvariants() {
		
		if (resultInv2.toString().endsWith(" &\n")) {
			resultInv2.delete(resultInv2.length() - " &\n".length(), resultInv2.length());
			//resultInv2.deleteCharAt(resultInv2.length() - 1);
		}
		
		if(!resultInv2.toString().isEmpty()) {
			return resultInv1.append(" &\n").append(resultInv2).toString();
		}else {
			return resultInv1.toString();
		}
	}
	
	public String constructEvents(Set<FunctionalExchange> exchanges, String activityId, String setName,
			                      Boolean isScenarioDiagram, Set<TimeLapse> timeLapses) {
	    
		List<String> guards = new ArrayList<>(); 
		StringBuilder strGuard = new StringBuilder();
		StringBuilder strAction = new StringBuilder();
		String key = StringUtil.EMPTY_STRING;
		
		for(FunctionalExchange exchange : exchanges) {
			String targetId = exchange.getTarget().getId();
			List<AbstractConstraint> constrs = exchange.getTarget().getOwnedConstraints();
			List<String> constraints = constrs.stream()
                                              .map(abstractConst -> abstractConst.getLabel())
                                              .collect(Collectors.toList());
			functionConstraint.put(targetId, constraints);
		    
			if(targetId.equals(activityId)) {
				if(inputValues.get(exchange.getSource().getId()) != null) {
					guards.addAll(inputValues.get(exchange.getSource().getId()));
				}	
			}
		}
		
		if(guards.isEmpty()) {
			key = fillGuardList(functions, key, activityId);
			fillGuards(strGuard, true, key, functionConstraint.get(activityId), activityId);
		} else {
			for (String guard : guards) {
				key = fillGuardList(variables, key, guard);
			}
		}
		
		if(!guards.isEmpty())
			fillGuards(strGuard, false, null, functionConstraint.get(activityId), activityId);
		
		
		if(inputValues.get(activityId) != null) {
			strGuard.append("\n").append("      ").append("THEN\n");
			strGuard.append("        Var_"+setName+" := "+inputValues.get(activityId).iterator().next());
		}else {
			strGuard.append("");
		}
		
		strGuard.append(fillEventActionPart(strAction, inputValues.get(activityId).stream().collect(Collectors.toList())));
		
		guardList.clear();
		functionConstraint.clear();
		return strGuard.toString();
	}
	
	public String fillEventActionPart(StringBuilder strAction, List<String> actions) {
		for(String action : actions) {
			String actionsToAdd = invariantsMap.entrySet().stream()
			                                              .filter(entry -> Arrays.asList(entry.getKey().split(" ")).contains(action))
			                                              .map(Map.Entry::getValue).findFirst().orElse("");
			boolean takeOpposite = false;
			String[] invariantElements = actionsToAdd.split(" ");
			List<String> liste = Arrays.asList(invariantElements);
			String key = StringUtil.EMPTY_STRING;
			strAction = actionsToAdd.isEmpty() ? strAction.append("") : strAction.append(";\n");
			
			for (String invariant : liste) {
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
				
				key = variables.entrySet().stream().filter(entry -> entry.getValue().contains(invarArr[0]))
						.map(Map.Entry::getKey).findFirst().orElse("");
				
				if(!key.isEmpty()) {
					if(takeOpposite) {
						initialisationSet = initialisations.get(key).iterator().next();
						if(invarArr[0].equals(initialisationSet)) {
							String AssignedValue = variables.get(key).stream()
                                                             .filter(value -> !value.equals(invarArr[0]))
                                                             .findFirst().orElse("");
							strAction.append("        Var_"+key + " := " + AssignedValue);
							actualAction = AssignedValue;
						}else {
							strAction.append("        Var_"+key + " := " + initialisationSet);
							actualAction = initialisationSet;
						}
					}else {
						strAction.append("        Var_"+key + " := " + invarArr[0]);
						actualAction = invarArr[0];
					}
					
					strAction = invariant.equals(lastAction) ? strAction.append("") : strAction.append(";\n");
					newListe.add(actualAction);
					fillEventActionPart(strAction, newListe);
				}	
			}
		}
		return strAction.toString();
	}
	
	public String hasInputs(Set<FunctionalExchange> exchanges, String activityId) {
		String found = "NO";
		for (FunctionalExchange exchange : exchanges) {
			if(exchange.getTarget().getId().equals(activityId)) {
				found = "YES";
				break;
			}
		}
		return found;
	}
	
	public String fillGuardList(Map<String, Set<String>> map , String key, String str) {
		key = map.entrySet().stream().filter(entry -> entry.getValue().contains(str))
				.map(Map.Entry::getKey).findFirst().orElse("");
		
		if(guardList.containsKey(key)) {
			guardList.get(key).add(str);
        } else {
        	Set<String> liste = new HashSet<>();
        	liste.add(str);
        	guardList.put(key, liste);
        }
		return key;
	}
	
	public void fillGuards(StringBuilder strGuard, boolean emptyGuards, String key, List<String> functionConstraints, String activityId) {
		StringBuilder sb = new StringBuilder();
        List<String> liste = new ArrayList<>();
        
        if(functionConstraints != null) {
        	if (!functionConstraints.isEmpty()) {
    			for (String constraint : functionConstraints) {
    				String[] constraintElement = constraint.split(" ");
    				liste = Arrays.asList(constraintElement);
    				sb = liste.contains("or") ? sb.append(" & (") : sb.append(" & ");
    				sb = functionConstraints.size() > 1 ? sb.append("(") : sb.append("");
    				
    				for (String element : liste) {
    					if ("(".equals(element) || ")".equals(element) || "&".equals(element) || "or".equals(element)) {
    						sb.append(" "+element+" ");
    					} else {
    						key = variables.entrySet().stream().filter(entry -> entry.getValue().contains(element))
    								.map(Map.Entry::getKey).findFirst().orElse("");
    						sb.append("Var_"+key + " = " + element);
    					}
    				}
    				sb = liste.contains("or") ? sb.append(")") : sb.append("");
    				sb = functionConstraints.size() > 1 ? sb.append(") & ") : sb.append("");
    			}
    			String[] tab2 = sb.toString().split(" ");
    			strGuard = "&".equals(tab2[tab2.length-1]) ? 
    				        strGuard.append(sb.toString().substring(0, sb.length() - 3)) : strGuard.append(sb);
    		
    		} else {
    			if (!emptyGuards) {
    				for (Map.Entry<String, Set<String>> entry : guardList.entrySet()) {
    					sb.append(" & (");
    					if (entry.getValue().size() > 1) {
    						for (String value : entry.getValue()) {
    							sb.append("Var_" + entry.getKey() + " = " + value + " or ");
    						}
    					} else {
    						sb.deleteCharAt(sb.length() - 1);
    						sb.append("Var_" + entry.getKey() + " = " + entry.getValue().iterator().next());
    					}

    					String[] tab = sb.toString().split(" ");
    					String str = "or".equals(tab[tab.length - 1]) ? sb.toString().substring(0, sb.length() - 4)
    							: sb.toString();
    					strGuard.append(str);

    					strGuard = entry.getValue().size() > 1 ? strGuard.append(")") : strGuard.append("");
    					sb.setLength(0);
    				}
    			} else {
    				strGuard.append(" & Var_" + key + " = " + initialisations.get(key).iterator().next());
    			}
    		}
        }
	}
	
	public boolean getNumVariableType(String setName, Set<String> strNums) {
		String[] resultTemp = {StringUtil.EMPTY_STRING};
		DecimalFormatSymbols currentLocaleSymbols = DecimalFormatSymbols.getInstance();
		char localeMinusSign = currentLocaleSymbols.getMinusSign();
		boolean[] isNumeric = {false};
		
		if(strNums != null) {
			strNums = strNums.stream()
	                .map(s -> s.replaceAll("=\\<|>|<|>=", ""))
	                .filter(number -> number != null)
	                .collect(Collectors.toSet());
			
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
		}
		
		return false;
	}
}

