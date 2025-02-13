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

### **Mine Pump System Overview**
Below are diagrams illustrating the mine pump system and Capella models:

<p align="center">
  <img src="path/to/mine_pump_system.png" alt="Mine Pump System Diagram" width="400">
</p>

*(Figure 1: Overview of the Mine Pump System)*

<p align="center">
  <img src="path/to/capella_models.png" alt="Capella Model Overview" width="400">
</p>

*(Figure 2: Overview of the Capella Model Abstraction Levels)*

## Installation & Usage
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/capella-to-eventb.git
