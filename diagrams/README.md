# Overview
An overview of the types of diagrams included in this project, the assigments of each person involved and the bibliography (articles, websites, resources) we used in order to develop these.

- [Overview](#overview)
- [Bibliography](#bibliography)
- [Diagrams type](#diagrams-type)

# Diagrams types
We're depicting here various diagrams for our project that focus on product design, architecture or user interaction along with sustenability or feedback loops.

Industrial Internet of Things (IIoT) projects involve multiple types of diagrams to illustrate different aspects of the project:
- System Architecture Diagram: an overview of the entire IIoT system, including sensors, devices, communication protocols, cloud platforms, and data analytics components.
- Network Topology Diagram: inteconnection between devices and sensors in the IIoT system, including wired and wireless connections.
- Sensor Deployment Diagram: tthe placement of sensors and actuators in the industrial environment; it helps in understanding how data is collected from different points.
- Data Flow Diagram: illustrates how data flows through the IIoT system, from sensors to cloud-based applications, including data preprocessing and storage.
- Message Sequence Diagram: the flow of messages and interactions between various components of the IIoT system, including how devices communicate and share data.
- Cloud Architecture Diagram: cloud infrastructure and services used to process and store data; it includes components like databases, storage, and analytics tools.
- Edge Computing Diagram: the edge computing infrastructure, where data is processed at or near the data source before being sent to the cloud; it includes edge devices and gateways.
- Data Storage Diagram: how data is stored in databases or other storage systems, emphasizing data structures and organization.
- Data Analytics Flowchart: data analytics pipeline, showing how raw data is transformed and analyzed to generate insights or trigger actions.
- Security Architecture Diagram: the security measures and protocols in place to protect the IIoT system from cyber threats, including firewalls, encryption, and access controls.
- User Interface (UI) Mockups: UI mockups depict how users interact with the system through dashboards and control interfaces.
- Compliance and Regulation Diagram: how the IIoT system complies with industry-specific regulations and standards, ensuring it meets legal requirements.
- Maintenance and Monitoring Diagram: how the IIoT system is monitored for performance, and how maintenance tasks are scheduled and executed.
- Failure Mode and Effects Analysis (FMEA) Diagram: A systematic approach to identifying and mitigating potential failure modes and their effects in the IIoT system.
- Energy and Resource Usage Diagram: the power and resource consumption of various components in the IIoT system, sustainability focused.

The [C4 model](https://c4model.com), or Context, Containers, Components, and Code model, is a set of abstractions for visualizing and describing the architecture of software systems. While it is primarily used for software architecture, it can be adapted and extended for the architecture of an IIoT (Industrial Internet of Things) project. If we are using the C4 approach we have:
- System Context Diagram (Level 1): the outermost layer represents the entire IIoT system within its broader context. This might include external systems, stakeholders, and the surrounding environment that interacts with or influences the IIoT system. A System Context diagram is a good starting point for diagramming and documenting a software system, allowing you to step back and see the big picture.
- Container Diagram (Level 2): once you understand how your system fits in to the overall IT environment, a really useful next step is to zoom-in to the system boundary with a Container diagram.
    - Containers: In the context of an IIoT project, containers might represent high-level system components or subsystems that handle specific functions. This could include Edge devices, Cloud platforms, and Communication Middleware.
    - Interfaces: Show how these containers interact with each other and external entities.
- Component Diagram (Level 3): next you can zoom in and decompose each container further to identify the major structural building blocks and their interactions.
    - Components: Within the containers, you can represent individual software components or modules responsible for specific tasks or services. For an IIoT project, this could include data processing components, analytics modules, data storage components, etc.
    - Dependencies: Illustrate the relationships and dependencies between these components.
- Code Diagram (Level 4): Finally, you can zoom in to each component to show how it is implemented as code; using UML class diagrams, entity relationship diagrams or similar. In traditional software architecture, this level delves into the code structure of each component. In an IIoT project, this might involve diving deeper into the specifics of each software component that handles IIoT data processing, such as data ingestion and transformation algorithms.

As C4 model diagrams we also have:
- System Landscape diagram: the C4 model provides a static view of a single software system but, in the real-world, software systems never live in isolation. For this reason, and particularly if you are responsible for a collection/portfolio of software systems, it's often useful to understand how all of these software systems fit together within a given enterprise, organisation, department, etc. Essentially this is a map of the software systems within the chosen scope, with a C4 drill-down for each software system of interest.
- Dynamic diagram: a dynamic diagram can be useful when you want to show how elements in the static model collaborate at runtime to implement a user story, use case, feature, etc. This dynamic diagram is based upon a UML communication diagram (previously known as a "UML collaboration diagram"). It is similar to a UML sequence diagram although it allows a free-form arrangement of diagram elements with numbered interactions to indicate ordering.
- Deployment diagram: a deployment diagram allows you to illustrate how instances of software systems and/or containers in the static model are deployed on to the infrastructure within a given deployment environment (e.g. production, staging, development, etc). It's based upon a UML deployment diagram.

C4 and UML
Although the example diagrams above are created using a "boxes and lines" notation, the core diagrams can be illustrated using UML with the appropriate use of packages, components and stereotypes. The resulting UML diagrams do tend to lack the same degree of descriptive text though, because adding such text isn't possible (or easy) with some UML tools.

Our focus should also be on the users of the product:
- User Personas: Create user personas that represent different categories of users or actors. Describe their characteristics, needs, and goals. These personas can help in designing user interfaces and functionalities tailored to specific user groups.
- User Role Matrix: Develop a matrix that outlines the different user roles in the IIoT system and their associated permissions and responsibilities. This is particularly important for access control and security planning.
- Use Case Diagrams: Use case diagrams can show how different actors interact with the system to achieve specific goals or tasks. Actors are represented as stick figures, and their interactions with the system are depicted as use cases.
- User Flow Diagrams: Create diagrams that illustrate the step-by-step user interactions within the system. These diagrams can help in designing user interfaces and understanding the user journey.
- Dashboard Wireframes: If the IIoT system includes user dashboards, you can create wireframes or mockups that depict how users interact with the system through these interfaces.
- User Access and Authentication Diagram: Show how different users or actors authenticate and access the system, including login processes and authentication methods.
- Alert and Notification Flowcharts: Outline how the system communicates with users or actors in the event of alarms, alerts, or notifications, including the channels and timing of these communications.
- User Training and Support Materials: While not diagrams, providing training materials and support documentation for users and actors is essential. This might include user manuals, video tutorials, and knowledge bases.
- User Feedback and Improvement Loop: Define how users can provide feedback on the system, report issues, and suggest improvements. Create a process flow or feedback loop to incorporate user feedback into system enhancements.
- Maintenance and Operator Roles: If your IIoT system involves maintenance personnel or operators, create diagrams or documents that detail their roles and responsibilities in system upkeep and management.

# Azure Diagrams Types
Azure architecture diagrams are visual representations that illustrate the structure, components, and relationships of a solution or application deployed on Microsoft Azure. These diagrams provide a clear and concise overview of the various Azure resources and services used in a specific architecture. 

Azure architecture diagrams typically consist of the following components:
> Azure Services: Representations of the Azure services used in the architecture, like virtual machines, databases (Azure SQL Database, Cosmos DB, etc.), networking components (Virtual Network, Load Balancers), containers (Azure Kubernetes Service), and more.

> Resource Relationships: Arrows or lines connecting different Azure resources to indicate how they interact with each other. This represents the flow of data or communication between components. When discussing complex solutions with team members, clients, or other stakeholders, a well-constructed Azure cloud architecture diagram ensures everyone is on the same page, reducing misunderstandings and improving communication.

> Networking: Diagrams often include details about the virtual networks, subnets, security groups, and other networking aspects to illustrate how the different resources are connected and secured

More on these at https://www.serverless360.com/blog/azure-architecture-diagrams.

* Azure actually can map your services and their connections inside your project but you need configure your services first. So you can actually compare the final diagram (autogenerated by Azure) with your design diagram that you made at the start of the project.

# Diagrams chosen by us
We first started with C4 diagrams as the way to go while respecting, as much as possible, the indications offered at https://c4model.com. 

We made the 1st level of the C4 (System Context - Gheorghiță Mutu) diagram trying to offer a high level overview on our project without technical details.

Then we stepped into details with the 2nd level of the C4 diagram (Container Diagram - Smoc George-Marian). This allowed us to separate the project into components and emphasize their relationships. We present a resilient system that effectively processes data from IoT nodes and converts it into insightful information in our C4 container diagram. This system's primary focus is on how real-time events can seamlessly transfer into a database structure that is optimized for query performance.

The level 3 (Component Diagram - Gherghe Tudor-Alexandru) diagram allowed us to decompose each container further to identify the major structural building blocks and their interactions and level 4 (Code Diagram - Gherghe Tudor-Alexandru) diagram zoomed in to each component to show how it is implemented as code (using UML class diagrams, entity relationship diagrams or similar). Level 4 diagrams will also be autogenerated from IDE once we start the development. 

Leaving C4 diagrams aside, we focused on UML diagrams representing use cases (Smoc George-Marian). We've used a clever technique in our use case diagram, utilizing extends includes and actor inheritance to accurately depict the relationships and interactions inside our system. These sophisticated methods improve the precision and richness of our system representation. The "Admin" actor's inheritance from "Factory Personnel" is an example of a notable application of actor inheritance. We also tried to represent as an UML diagram (Gheorghiță Mutu) the possible classes involved in one or more components of this project but we quickly realised that OOP patterns might not be a good fit for out project. Our project mainly consists in data processing pipelines from different sources with different outputs that need to be correlated, aggregated, stored and/or queried in many different ways, generating more data along the way (alerts, indications, predictions). We switched the last diagram to an Azure architecture diagram (Gheorghiță Mutu) that tries to emphasize various Azure services involved in our project. Even so, the Azure diagram contains only a subset of all the services this project will use in its implementation. 

# Bibliography
https://github.com/ByteByteGoHq/system-design-101 (System Design 101)\
https://bringitonni.co.uk/technology/what-are-the-4-components-of-internet-of-things-iot-bring-it-on (WHAT ARE THE 4 COMPONENTS OF INTERNET OF THINGS (IOT)?)\
https://dgtlinfra.com/internet-of-things-iot-architecture (Internet of Things (IoT) Architecture: Layers Explained)\
https://www.celona.io/network-architecture/iot-architecture (IoT Architecture: Complete Explanation with Examples)\
https://thescipub.com/pdf/ajeassp.2021.81.93.pdf (Modelling IoT Systems with UML: A Case Study for Monitoring and Predicting Power Consumption)\
https://www.hindawi.com/journals/jece/2017/9324035 (Internet of Things: Architectures, Protocols, and Applications)\
https://inria.hal.science/hal-03484052/file/main.pdf (Business Process Models for Analysis of Industrial IoT Applications)\
https://www.geeksforgeeks.org/types-of-distributed-system (Types of Distributed System)\
https://www.sciencedirect.com/science/article/abs/pii/S1574119223000767 (IoT systems with multi-tier, distributed intelligence: From architecture to prototype)\
https://www.iiconsortium.org/pdf/IIoT-Distributed-Computing-in-the-Edge.pdf (The Industrial Internet of Things  Distributed Computing in the Edge)\
https://www.mdpi.com/1424-8220/18/6/1676 (Collaborative Working Architecture for IoT-Based Applications)\
https://www.avsystem.com/blog/iot/what-is-iot-architecture (What is IoT architecture?)\
https://www.altexsoft.com/blog/iot-architecture-layers-components (IoT Architecture: the Pathway from Physical Signals to Business Decisions)\
https://dgtlinfra.com/internet-of-things-iot-architecture (Internet of Things (IoT) Architecture: Layers Explained)
https://citeseerx.ist.psu.edu/document?repid=rep1&type=pdf&doi=d3626bf1ca937dba0a452a1c31a751d79fc38953 (Using Aspects in Architectural Description)
https://www.researchgate.net/publication/221116951_Aspect_Diagrams_for_UML_Activity_Models (Aspect Diagrams for UML Activity Models)
