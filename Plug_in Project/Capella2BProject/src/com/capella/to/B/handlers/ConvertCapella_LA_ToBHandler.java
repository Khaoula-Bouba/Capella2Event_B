package com.capella.to.B.handlers;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import org.eclipse.acceleo.module.lightingSystem.main.GenerateLA;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.util.StringInputStream;
import org.xtext.example.eventBDSL.EventBDSLStandaloneSetup;
import org.xtext.example.mydsl.myLADsl.LogicalArchitecture;
import org.xtext.example.newlamydsl.MyLADslStandaloneSetup;
import org.xtext.example.newlamydsl.validation.MyLADslValidator;

import com.google.inject.Injector;

public class ConvertCapella_LA_ToBHandler  extends AbstractHandler{
	
	@Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// Get the current selection
		IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);

		// Check if the selection is not empty and contains an IProject
		if (selection != null && !selection.isEmpty()) {
		    Object selectedElement = selection.getFirstElement();
		    if (selectedElement instanceof IProject) {
		        IProject project = (IProject) selectedElement;
		        String projectLocation = project.getLocation().toString();
		        
		        try {
					// Iterate over all files in the project's workspace
					project.accept(resource -> {
						if (resource instanceof IFile) {
							IFile file = (IFile) resource;
							if (file.getName().endsWith(".capella")) {
								
								//Check the syntax of the Capella model
								List<String> errorsList = checkCapellaLAModelSyntax(file);
						        if(!errorsList.isEmpty()) {
						        	StringListPanel (errorsList);
						        }else {
						        	//launch Acceleo transformation
									String[] args = {file.getFullPath().toString(), projectLocation};
									launchAcceleoTransformation(args);
									
									//Check the syntax of the generated Event-B model
									checkEventBModelSyntax(file);
						        }	
							}
						}
						return true; // Continue visiting resources
					});
		        } catch (CoreException e) {
		            // Handle any exceptions
		            e.printStackTrace();
		        }
		    }
		}
		
        return null;
    }
	
	public static void launchAcceleoTransformation(String[] args) {
		try {
		URI modelURI = URI.createFileURI(args[0]);
        File folder = new File(args[1]);
        
        List<String> arguments = new ArrayList<String>();
        
        GenerateLA generator = new GenerateLA(modelURI, folder, arguments);
	
        for (int i = 2; i < args.length; i++) {
            generator.addPropertiesFile(args[i]);
        }
        
        generator.doGenerate(new BasicMonitor());
        
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> checkCapellaLAModelSyntax(IFile file) {
		String filePath = file.getLocationURI().getPath();
		List<String> errors = new ArrayList<>();
		
		MyLADslValidator myDSLValidator = new MyLADslValidator();
		
		Injector injector = new MyLADslStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			StringBuilder contentBuilder = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				contentBuilder.append(line).append("\n");
			}
			String content = contentBuilder.toString();
			
			IParser parser = injector.getInstance(IParser.class);
			// Parse the content using the Xtext parser
			IParseResult parseResult = null;
			try {
			    String LAContent = extractXmlContent(content, 3);
				parseResult = parser.parse(new InputStreamReader(new StringInputStream(LAContent)));
				EObject objroot = parseResult.getRootASTElement();
				
				myDSLValidator.checkLASyntax((LogicalArchitecture) objroot, errors);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			System.err.println("File does not exist!!");
		} catch (IOException e1) {
			System.err.println("IO issues !!");
		}
		
		return errors;
	}
	
	public static void StringListPanel (List<String> stringList) {
		JFrame frame = new JFrame();
		frame.setTitle("String List Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JList with the stringList data
        JList<String> list = new JList<>(stringList.toArray(new String[0]));

        // Add the JList to a JScrollPane for scrollability
        JScrollPane scrollPane = new JScrollPane(list);

        // Set up the layout
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);  // Center the frame
        frame.setVisible(true);
    }
	
	public static String extractXmlContent(String xml, int occurrence) {
        String patternString = "<ownedArchitectures.*?>([\\s\\S]*?)</ownedArchitectures>";
        Pattern pattern = Pattern.compile(patternString, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(xml);

        int count = 0;
        while (matcher.find()) {
            if (++count == occurrence) {
                return matcher.group(0); // Return content of the matched group
            }
        }

        // Tag not found
        return null;
    }
	
	public static void checkEventBModelSyntax(IFile file) {
		// Step 1: Create an instance of the Injector for your Xtext language
		Injector injector = new EventBDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		List<String> errorsEventB = new ArrayList<>();
		String filePath = file.getLocationURI().getPath();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			StringBuilder contentBuilder = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				contentBuilder.append(line).append("\n");
			}
			String content = contentBuilder.toString();
			
			IParser parser = injector.getInstance(IParser.class);
			// Parse the content using the Xtext parser
			IParseResult parseResult = null;
			try {
				parseResult = parser.parse(new InputStreamReader(new StringInputStream(content)));
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Step 2: Check for any syntax errors in the file
			// Check if parsing was successful
			if (parseResult != null && parseResult.hasSyntaxErrors()) {
				// Parsing errors occurred
				for (INode errorNode : parseResult.getSyntaxErrors()) {
					String errorMessage = errorNode.getSyntaxErrorMessage().getMessage();
					errorsEventB.add(errorMessage);
					StringListPanel(errorsEventB);
				}
			} else {
				errorsEventB.add("Generation of Event-B model is completed");
			}
		} catch (FileNotFoundException e1) {
			System.err.println("File does not exist!!");
		} catch (IOException e1) {
			System.err.println("IO issues !!");
		}
	}
	
	@Override
    public boolean isEnabled() {
        // Enable or disable your action based on certain conditions or application state
        return true; // Enable the action
    }

}
