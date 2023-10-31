# Design patterns and modelling

- [Design patterns and modelling](#design-patterns-and-modelling)
  - [Design Patterns](#design-patterns)
    - [Design Patterns in IIoT](#design-patterns-in-iiot)
    - [Design Patterns by the Gang of Four (GoF)](#design-patterns-by-the-gang-of-four-gof)
    - [Comparison](#comparison)
  - [Bibliography](#bibliography)

## Design Patterns
Industrial Internet of Things (IIoT) design patterns refer to reusable solutions to common problems and challenges encountered when developing IIoT systems. These patterns help create scalable, robust, and efficient architectures for managing and processing data in industrial environments.

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


## Bibliography
https://dev.to/zhukmax/bridging-the-gap-understanding-adapter-and-composite-patterns-in-rust-50ab (Bridging the Gap: Understanding Adapter and Composite Patterns in Rust)
https://dev.to/martinp/roll-your-own-auth-with-rust-and-protobuf-24ke (Roll your own auth with Rust and Protobuf)
https://docs.aws.amazon.com/pdfs/whitepapers/latest/industrial-iot-architecture-patterns/industrial-iot-architecture-patterns.pdf#industrial-iot-architecture-patterns (Industrial IoT
Architecture Patterns)
https://hillside.net/plop/2016/papers/writinggroup/17.2.pdf (Pattern language for IoT applications)
https://d-nb.info/1232177768/34 (An Overview of Design Patterns for Self-Adaptive
Systems in the Context of the Internet of Things)
https://www.iaas.uni-stuttgart.de/publications/INPROC-2016-46-Internet-of-Things-Patterns.pdf (https://www.iaas.uni-stuttgart.de/publications/INPROC-2016-46-Internet-of-Things-Patterns.pdf)
https://www.sciencedirect.com/science/article/abs/pii/S0167739X23002017 (Internet of Things design patterns modeling proven correct by construction: Application to aged care solution)
https://par.nsf.gov/servlets/purl/10066528 (Design Patterns for the Industrial Internet of Things)
https://learn.microsoft.com/en-us/azure/architecture/guide/iiot-patterns/iiot-patterns-overview (Industrial IoT patterns)
https://machinekoder.com/machinetalk-explained-part-5-code-generation (Machinetalk explained Part 5: Code Generation)
https://www.linkedin.com/pulse/streamline-microservices-development-protobuf-based-code-ansel-castro (Streamline microservices development with a protobuf-based code generator)
https://medium.com/@kamil.skalski/using-google-protocol-buffers-as-data-definition-language-for-entity-framework-core-storage-a130e5bfc71f (Using Google Protocol Buffers as data definition language for Entity Framework Core storage)
https://medium.com/@costastselios/iot-patterns-managed-iot-data-services-350c17df2d8b (IoT Patterns — Managed IoT Data Services)
