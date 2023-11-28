- [Stages](#stages)
  - [Install tools](#install-tools)
  - [Create Solution \& Project](#create-solution--project)
  - [Get the actual template for the function](#get-the-actual-template-for-the-function)
- [Bibliography](#bibliography)

# Stages
## Install tools

```
The following steps use Homebrew to install the Core Tools on macOS.

Install Homebrew, if it's not already installed.

Install the Core Tools package:
brew tap azure/functions
brew install azure-functions-core-tools@4
# if upgrading on a machine that has 2.x or 3.x installed:
brew link --overwrite azure-functions-core-tools@4
```

## Create Solution & Project

```
Create solution:

dotnet new sln -o iot_device_01 

Create Azure Function Project:

func init FunctionDeviceSimulator --worker-runtime dotnet-isolated --target-framework net6.0  
```

## Get the actual template for the function

First check what templates you have available:
```
func templates list

C# Templates:
  Azure Blob Storage trigger
  Azure Cosmos DB trigger
  Durable Functions activity
  Durable Functions entity (class)
  Durable Functions entity (function)
  Durable Functions Entity HTTP starter
  Durable Functions HTTP starter
  Durable Functions orchestrator
  Azure Event Grid trigger
  Azure Event Hub trigger
  HTTP trigger
  IoT Hub (Event Hub)
  Kafka output
  Kafka trigger
  Azure Queue Storage trigger
  RabbitMQ trigger
  SendGrid
  Azure Service Bus Queue trigger
  Azure Service Bus Topic trigger
  SignalR negotiate HTTP trigger
  SQL Input Binding
  SQL Output Binding
  Timer trigger

Custom Templates:
  Azure Blob Storage trigger
  Azure Event Grid trigger
  Azure Event Hub trigger
  HTTP trigger
  IoT Hub (Event Hub)
  Kafka trigger
  Azure Queue Storage trigger
  RabbitMQ trigger
  SendGrid
  Azure Service Bus Queue trigger
  Azure Service Bus Topic trigger
  SignalR negotiate HTTP trigger
  Timer trigger

JavaScript Templates:
  Azure Blob Storage trigger
  Azure Cosmos DB trigger
  Durable Functions activity
  Durable Functions entity
  Durable Functions Entity HTTP starter
  Durable Functions HTTP starter
  Durable Functions orchestrator
  Azure Event Grid trigger
  Azure Event Hub trigger
  HTTP trigger
  IoT Hub (Event Hub)
  Kafka output
  Kafka trigger
  Azure Queue Storage trigger
  RabbitMQ trigger
  SendGrid
  Azure Service Bus Queue trigger
  Azure Service Bus Topic trigger
  SignalR negotiate HTTP trigger
  SQL Input Binding
  SQL Output Binding
  Timer trigger
  Azure Blob Storage trigger
  Azure Cosmos DB trigger
  Durable Functions entity
  Durable Functions orchestrator
  Azure Event Grid trigger
  Azure Event Hub trigger
  HTTP trigger
  Azure Queue Storage trigger
  Azure Service Bus Queue trigger
  Azure Service Bus Topic trigger
  Timer trigger
  Dapr Publish Output Binding
  Dapr Service Invocation Trigger
  Dapr Topic Trigger

PowerShell Templates:
  Azure Blob Storage trigger
  Azure Cosmos DB trigger
  Durable Functions activity
  Durable Functions HTTP starter
  Durable Functions orchestrator
  Azure Event Grid trigger
  Azure Event Hub trigger
  HTTP trigger
  IoT Hub (Event Hub)
  Kafka output
  Kafka trigger
  Azure Queue Storage trigger
  RabbitMQ trigger
  SendGrid
  Azure Service Bus Queue trigger
  Azure Service Bus Topic trigger
  SignalR negotiate HTTP trigger
  SQL Input Binding
  SQL Output Binding
  Timer trigger

Python Templates:
  Azure Blob Storage trigger
  Azure Cosmos DB trigger
  Durable Functions activity
  Durable Functions entity
  Durable Functions HTTP starter
  Durable Functions orchestrator
  Azure Event Grid trigger
  Azure Event Hub trigger
  HTTP trigger
  Kafka output
  Kafka trigger
  Azure Queue Storage trigger
  RabbitMQ trigger
  Azure Service Bus Queue trigger
  Azure Service Bus Topic trigger
  SQL Input Binding
  SQL Output Binding
  Timer trigger

TypeScript Templates:
  Azure Blob Storage trigger
  Durable Functions activity
  Durable Functions entity
  Durable Functions Entity HTTP starter
  Durable Functions HTTP starter
  Durable Functions orchestrator
  Azure Event Grid trigger
  Azure Event Hub trigger
  HTTP trigger
  IoT Hub (Event Hub)
  Kafka output
  Kafka trigger
  Azure Queue Storage trigger
  RabbitMQ trigger
  SendGrid
  Azure Service Bus Queue trigger
  Azure Service Bus Topic trigger
  SignalR negotiate HTTP trigger
  SQL Input Binding
  Timer trigger
  Azure Blob Storage trigger
  Azure Cosmos DB trigger
  Durable Functions entity
  Durable Functions orchestrator
  Azure Event Grid trigger
  Azure Event Hub trigger
  HTTP trigger
  Azure Queue Storage trigger
  Azure Service Bus Queue trigger
  Azure Service Bus Topic trigger
  Timer trigger
```

Pick the one you need: 
```
func new --name GenerateDeviceResponse --template "Timer trigger" --force
```

Missing .NET dependencies:
```
[2023-11-28T15:45:15.804Z] You must install or update .NET to run this application.
[2023-11-28T15:45:15.805Z] App: /Users/gheorghitamutu/Repositories/FactoryWatcher/iot_device_01/bin/output/iot_device_01.dll
[2023-11-28T15:45:15.805Z] Language Worker Process exited. Pid=44189.
[2023-11-28T15:45:15.805Z] dotnet exited with code 150 (0x96). https://aka.ms/dotnet/app-launch-failed.
[2023-11-28T15:45:15.805Z] Architecture: arm64
[2023-11-28T15:45:15.805Z] Framework: 'Microsoft.NETCore.App', version '6.0.0' (arm64)
[2023-11-28T15:45:15.805Z] .NET location: /opt/homebrew/Cellar/dotnet/7.0.100/libexec/
[2023-11-28T15:45:15.805Z] The following frameworks were found:
[2023-11-28T15:45:15.805Z]   7.0.0 at [/opt/homebrew/Cellar/dotnet/7.0.100/libexec/shared/Microsoft.NETCore.App]
[2023-11-28T15:45:15.805Z] Learn about framework resolution:
[2023-11-28T15:45:15.805Z] https://aka.ms/dotnet/app-launch-failed
[2023-11-28T15:45:15.805Z] To install missing framework, download:
[2023-11-28T15:45:15.805Z] https://aka.ms/dotnet-core-applaunch?framework=Microsoft.NETCore.App&framework_version=6.0.0&arch=arm64&rid=osx.14-arm64
```

Run the function locally:
```
func start
```

# Bibliography
https://learn.microsoft.com/en-us/azure/azure-functions/functions-core-tools-reference?tabs=v2#func-templates-list\
https://learn.microsoft.com/en-us/azure/azure-functions/create-first-function-cli-csharp?tabs=macos%2Cazure-cli