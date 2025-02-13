# Overview
This project provides a plugin for automating the transformation of Capella models into Event-B models, enabling formal verification of system designs. By leveraging Capella's model-driven engineering capabilities and Event-B's rigorous formalism, this approach bridges the gap between high-level system modeling and formal verification.

## Features
- **Model Transformation:** Automatic generation of Event-B models from Capella's Operational Analysis, System Analysis, and Logical Architecture models.
- **Transformation with Acceleo (M2M)**:  
  - The **model-to-model (M2M) transformation** is implemented using **Acceleo**, an Eclipse-based implementation of the **MOF Model-to-Text (M2T) transformation language**.
  - The transformation extracts relevant elements from Capella models and maps them to corresponding Event-B constructs.
  - Acceleo templates define transformation rules, ensuring that static and dynamic aspects are correctly translated into Event-B.

- **Seamless Integration:** A right-click menu in the Capella interface allows users to perform the transformation with three options:
  - Convert Operational Analysis to Event-B
  - Convert System Analysis to Event-B
  - Convert Logical Architecture to Event-B

- **Static and Dynamic Parts Definition:** Comprehensive mapping of Capella elements to Event-B constructs, covering both static and dynamic aspects.
- **Syntax Checking DSL:** A dedicated DSL built using XText and Xtend to validate Capella model syntax before transformation.

## Capella Models
Capella is a **model-based systems engineering (MBSE) tool** that supports different abstraction levels of system modeling. This plugin specifically works with three key **Capella models**:

### **1. Operational Analysis**
- Defines the **high-level operational needs** of the system.
- Describes **Operational Entities, Actors, Roles, and Activities**.
- Represents how **stakeholders interact** with the system.

### **2. System Analysis**
- Translates **operational needs** into a **functional system architecture**.
- Defines **System Actors, System Functions, and their interactions**.
- Establishes traceability between the **Operational and System Analysis levels**.

### **3. Logical Architecture**
- Represents the **logical structure** of the system.
- Defines **Logical Components, Logical Actors, and Logical Functions**.
- Ensures consistency with the system-level architecture.

These models **progressively refine the system design** from abstract operational needs to a structured logical representation, enabling automated **formal verification through Event-B**.

## Validation: Mine Pump Use Case
This plugin has been validated using the **Mine Pump Use Case**, comparing its effectiveness with previous formal verification approaches. The mine pump system ensures stable water levels in deep mining wells by regulating pump operations. The safety requirements addressed include:

1. **Req1:** The water level should not exceed *High* when the pump can function.
2. **Req2:** The water level should not be pumped under *Low* level.
3. **Req3:** If the methane sensor exceeds *MS_L1* (Methane Sensor Level 1), an alarm should be triggered to evacuate the deep well.
4. **Req4:** If the methane sensor exceeds *MS_L2* (Methane Sensor Level 2), the pump shall be off.
5. **Req5:** The system should react to a methane alarm as quickly as possible and within *200 ms* at most.
<p align="center">
  <img src="https://github.com/Khaoula-Bouba/Capella2Event_B/blob/46d443441cd06b12b251427b3fc6be12dbc1ec08/minepump_usecase.PNG" alt="Mine Pump System Diagram" width="300">
</p>

*(Figure 1: Overview of the Mine Pump System)*


## Importing and Using the Custom DSLs and Plugin  

To use the **Capella2Event-B plugin** and **DSL for syntax validation**, follow these steps:

### **1. Import the Projects into Eclipse**  
Ensure you have **Eclipse with Capella and Xtext installed**, then:

1. Open **Eclipse** and go to **File** → **Import**.
2. Select **Existing Projects into Workspace** under **General** and click **Next**.
3. Choose **Select root directory** and browse to the location of the cloned repository.
4. Ensure all projects (Operational_Analysis_DSL, System_Analysis_DSL, Logical_Architecture_DSL, Acceleo_generation_Code and Plug_in Project)  are checked and click **Finish**.

### **2. Set Up the DSL Environment**  

1. Open the DSL projects in Eclipse.
2. Right-click on the project and select **Run As** → **MWE2 Workflow** to generate the language infrastructure.

### **3. Launch the Capella-to-Event-B Plugin**  
To start using the transformation plugin:

1. Open the plugin project in Eclipse.
2. Right-click on the project and select **Run As** → **Eclipse Application**.
3. A new Eclipse instance will launch with the plugin installed.

### **4. Using the Plugin for Model Transformation**  
Once the plugin is running inside Eclipse:

1. Open or create a **Capella project** containing **Operational Analysis, System Analysis, or Logical Architecture models**.
   <p align="center">
    <img src="https://github.com/Khaoula-Bouba/Capella2Event_B/blob/46d443441cd06b12b251427b3fc6be12dbc1ec08/OA_Model.PNG" alt="OA model" width="350">
   </p>
  
   *(Figure 2: Mine pump Operational Analysis model with Capella)*
  
   <p align="center">
     <img src="https://github.com/Khaoula-Bouba/Capella2Event_B/blob/46d443441cd06b12b251427b3fc6be12dbc1ec08/SA_Model.PNG" alt="Capella Model Overview" width="600">
   </p>
  
   *(Figure 3: Mine pump System Analysis model with Capella)*
  
   <p align="center">
     <img src="https://github.com/Khaoula-Bouba/Capella2Event_B/blob/46d443441cd06b12b251427b3fc6be12dbc1ec08/LA_Model.PNG" alt="Capella Model Overview" width="700">
   </p>
  
   *(Figure 4: Mine pump Logical Architecture model with Capella)*
   
3. Right-click on a Capella model in the **Project Explorer**.
4. Navigate to **Capella-to-EventB Transformation** and choose one of the options:
   - Convert **Operational Analysis** to Event-B
   - Convert **System Analysis** to Event-B
   - Convert **Logical Architecture** to Event-B
     <p align="center">
       <img src="https://github.com/Khaoula-Bouba/Capella2Event_B/blob/420bf33280980dc0339582955c6aa87797cc011c/Capella2B_actions.png" alt="Capella Model Overview" width="700">
     </p>
  
   *(Figure 4: Plug-in transformation actions)*
    
5. The corresponding **Event-B model** will be automatically generated and added to your workspace.

## Installation & Usage
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/capella-to-eventb.git
