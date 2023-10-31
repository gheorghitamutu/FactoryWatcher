# Design patterns and modelling

- [Design patterns and modelling](#design-patterns-and-modelling)
  - [Design Patterns](#design-patterns)
    - [Design Patterns in IIoT](#design-patterns-in-iiot)
    - [Design Patterns by the Gang of Four (GoF)](#design-patterns-by-the-gang-of-four-gof)
    - [Comparison](#comparison)
  - [Design Patterns in IIoT](#design-patterns-in-iiot-1)
  - [Exploring the architecture](#exploring-the-architecture)
  - [Bibliography](#bibliography)

## Design Patterns
Design patterns for the Industrial Internet of Things (IIoT) and design patterns defined by the Gang of Four (GoF) represent two distinct groups of design concepts that target different domains and purposes.

### Design Patterns in IIoT
IIoT design patterns  are special patterns specifically tailored to the challenges of system development in the field of  Industrial Internet of Things. These patterns are focused on addressing the complexities associated with large-scale industrial environments, sensor data processing, edge computing, real-time data analysis, security, and communication protocols. These revolve around connected devices, data management, and the special requirements of industrial ecosystems.

Key areas addressed by IIoT design patterns include:
> Data Processing and Communication: Dealing with real-time data from numerous devices, sensors, and systems, and ensuring efficient communication and processing.
> Edge Computing and Device Interactions: Strategies for handling data processing at the edge, device interactions, and optimizing communication to reduce latency.
> Security and Device Management: Patterns for securing communication, managing devices, and implementing access control measures to safeguard critical infrastructure.

### Design Patterns by the Gang of Four (GoF)
The GoF design patterns, introduced in the book "Design Patterns: Elements of Reusable Object-Oriented Software," comprise a set of general-purpose design patterns for object-oriented software development. These patterns are more abstract and applicable to a wide range of software development domains and languages, focusing on design problems within software systems.

The GoF patterns are classified into three categories:
> Creational Patterns: Addressing object creation mechanisms.
> Structural Patterns: Concerned with the composition of classes or objects.
> Behavioral Patterns: Focusing on object collaboration and responsibility.

These patterns, such as Singleton, Factory Method, Adapter, Observer, Strategy, and others, are designed to solve common software design issues, including object instantiation, composition, interaction between objects, and encapsulating behavior.

### Comparison
The key difference lies in their scope and focus:
> Scope: IIoT patterns are specific to the industrial domain, dealing with challenges unique to interconnected devices, sensor networks, edge computing, and industrial data processing. GoF patterns, on the other hand, are more general and abstract, applicable across various software domains.
> Focus: IIoT patterns target problems related to data flow, real-time processing, security, and device interaction in the industrial setting. GoF patterns focus on object-oriented design concepts and solutions for software structure, behavior, and creation.

While they serve different purposes, there might be instances where both sets of patterns could be applied in building complex IIoT systems that involve intricate software architectures for handling industrial data and interactions among devices.

## Design Patterns in IIoT
Industrial Internet of Things (IIoT) design patterns refer to reusable solutions to common problems and challenges encountered when developing IIoT systems. These patterns help create scalable, robust, and efficient architectures for managing and processing data in industrial environments.

Several design patterns are commonly employed in IIoT:
1. Pub-Sub (Publisher/Subscriber)
   - Utilized for communication between various devices, sensors, and applications. Devices publish data to specific topics, and other devices or applications subscribe to these topics to receive the data they are interested in. This pattern enables a loosely coupled architecture and facilitates scalability. This pattern involves a messaging system where sensors or devices publish data to a broker. Other devices or applications can subscribe to the broker to receive the data they need.
2. Edge Computing
   - In IIoT, Edge Computing involves processing data closer to the source (at the edge) rather than relying solely on centralized cloud systems. This pattern helps in reducing latency, enabling real-time processing, and reducing the amount of data that needs to be sent to the cloud, which can be critical in industrial settings with limited bandwidth or where real-time responses are necessary.
3. Device Shadowing
   - A pattern commonly used in IIoT for maintaining a virtual representation (shadow) of a physical device. This shadow maintains the current state of the device and can be used for synchronization, enabling more efficient communication, and enabling quick access to device information without directly interacting with the physical device.
4. Security Patterns
   - Security is a critical concern in IIoT. Patterns like Role-based Access Control (RBAC), encryption, secure bootstrapping, and secure communication protocols (such as TLS) are crucial for securing communications, data, and devices in an IIoT ecosystem.
5. Batching and Buffering
   - Implementing systems that can handle intermittent connectivity and varying data rates is essential. Batching and buffering patterns enable the collection of data from sensors or devices and then transmitting it in optimized batches, reducing network traffic and improving efficiency.
6. Data Normalization and Transformation
   - IIoT systems often deal with data from disparate sources, in different formats. This pattern involves standardizing and transforming data into a common format for processing and analysis, facilitating interoperability among different devices and systems.
7. Predictive Maintenance
   - By analyzing historical data and real-time sensor data, predictive maintenance patterns help in predicting when equipment might fail, allowing for maintenance before an actual breakdown, thereby reducing downtime and costs.
8. Digital Twin
   - Creating digital representations of physical assets or processes helps in simulation, monitoring, and analysis. Digital twins enable better understanding and optimization of physical systems, aiding in predictive analysis and decision-making.
9. Time Series Data Storage
   - Specialized databases or storage systems designed for handling time-series data efficiently are crucial in IIoT. These patterns enable storing, querying, and analyzing data collected over time, such as sensor readings and operational data.
10. Dynamic Scaling
   - This pattern involves the ability of the IIoT system to dynamically scale resources based on demand. It ensures that the system can handle fluctuating workloads, such as increased data volume during peak times.
11. Sensor Aggregation Pattern
   - This pattern involves aggregating data from multiple sensors to gain a broader understanding of a system or environment. It addresses the challenge of handling data from numerous sensors scattered across various locations and provides a unified view of the collected data.


These design patterns in IIoT aim to address various challenges encountered in industrial environments, ranging from data management, security, and communication to predictive analytics and system scalability. Combining these patterns can lead to robust, efficient, and scalable IIoT solutions.

## Exploring the architecture
These are several IoT architecture types that we took into account:
1. Centralized Architecture
   1. The centralized architecture pattern involves a central hub or gateway that serves as the focal point for data collection and control. IoT devices communicate with the central hub, which then processes and analyzes the data. This pattern offers simplicity and ease of management, making it suitable for applications with a limited number of devices and straightforward data flows.
2. Decentralized Architecture
   1. In a decentralized architecture, intelligence is distributed across the network. IoT devices communicate directly with each other or through intermediate gateways, reducing reliance on a central hub. This pattern provides scalability, resilience, and lower latency, making it ideal for applications that require high device density, real-time responsiveness, and fault tolerance.
3. Edge Computing Architecture
   1. Edge computing architecture brings processing capabilities closer to IoT devices at the network edge. By performing data processing and analytics at or near the source, this pattern minimizes latency, reduces bandwidth usage, and enhances data privacy. Edge computing is well-suited for applications that require real-time decision-making, low-latency responses, and reduced reliance on cloud connectivity.
4. Hybrid Architecture
   1. The hybrid architecture pattern combines elements of both centralized and decentralized approaches. It leverages the benefits of centralized control for management and analytics while distributing processing and decision-making closer to the edge. This pattern strikes a balance between scalability, resilience, and real-time responsiveness, making it suitable for diverse IoT use cases with varying requirements.
5. Event-Driven Architecture
   1. Event-driven architecture focuses on capturing and processing events triggered by IoT devices. It leverages messaging systems or event-driven frameworks to handle data ingestion, event routing, and subsequent actions. This pattern enables real-time event processing, asynchronous communication, and flexible integration with various systems. Event-driven architecture is well-suited for applications that require event correlation, complex workflows, and event-driven actions.

While exploring the system's scope we reached the agreement that a combination of **Centralized** with **Event-Driven** architectures would suite our case. We also took into account [IoT Design Patterns: Computational Constructs to Design, Build and Engineer Edge Applications](https://conferences.computer.org/iotDI/prev/2016/papers/9948a277.pdf).

## Bibliography
https://dev.to/zhukmax/bridging-the-gap-understanding-adapter-and-composite-patterns-in-rust-50ab (Bridging the Gap: Understanding Adapter and Composite Patterns in Rust)\
https://dev.to/martinp/roll-your-own-auth-with-rust-and-protobuf-24ke (Roll your own auth with Rust and Protobuf)\
https://docs.aws.amazon.com/pdfs/whitepapers/latest/industrial-iot-architecture-patterns/industrial-iot-architecture-patterns.pdf#industrial-iot-architecture-patterns (Industrial IoT Architecture Patterns)\
https://hillside.net/plop/2016/papers/writinggroup/17.2.pdf (Pattern language for IoT applications)\
https://d-nb.info/1232177768/34 (An Overview of Design Patterns for Self-Adaptive Systems in the Context of the Internet of Things)
https://www.iaas.uni-stuttgart.de/publications/INPROC-2016-46-Internet-of-Things-Patterns.pdf (Internet of Things Patterns)\
https://www.sciencedirect.com/science/article/abs/pii/S0167739X23002017 (Internet of Things design patterns modeling proven correct by construction: Application to aged care solution)\
https://par.nsf.gov/servlets/purl/10066528 (Design Patterns for the Industrial Internet of Things)\
https://learn.microsoft.com/en-us/azure/architecture/guide/iiot-patterns/iiot-patterns-overview (Industrial IoT patterns)\
https://machinekoder.com/machinetalk-explained-part-5-code-generation (Machinetalk explained Part 5: Code Generation)\
https://www.linkedin.com/pulse/streamline-microservices-development-protobuf-based-code-ansel-castro (Streamline microservices development with a protobuf-based code generator)\
https://medium.com/@kamil.skalski/using-google-protocol-buffers-as-data-definition-language-for-entity-framework-core-storage-a130e5bfc71f (Using Google Protocol Buffers as data definition language for Entity Framework Core storage)\
https://medium.com/@costastselios/iot-patterns-managed-iot-data-services-350c17df2d8b (IoT Patterns — Managed IoT Data Services)\
https://www.linkedin.com/pulse/exploring-iot-architecture-patterns-building-future-himanshu-shah (Exploring IoT Architecture Patterns: Building the Future of Connectivity!)\
https://nmsl.cs.nthu.edu.tw/wp-content/uploads/2011/10/images_groupmeeting_1116-PH.pdf (IoT Design Patterns: Computational Constructs to Design, Build and Engineer Edge Applications)\
https://link.springer.com/chapter/10.1007/978-3-031-09593-1_3 (Modeling IoT Design Patterns Proven Correct by Construction)\
https://community.arm.com/arm-community-blogs/b/internet-of-things-blog/posts/design-patterns-for-an-internet-of-things (Design Patterns for the Internet of Things)\
https://www.linkedin.com/pulse/10-trending-design-patterns-iot-solutions-vishal-bhardwaj (10 Trending Design Patterns in IoT Solutions and Architectures)