using System;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Azure.Devices.Client;
using Microsoft.Extensions.Logging;
using Google.Protobuf;
using Equipment;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Azure.WebJobs;
using Google.Protobuf.WellKnownTypes;

namespace iot_device_01
{
    public class GenerateDeviceResponse
    {
        public static Equipment.Equipment GetEquipmentResponse()
        {
            return new Equipment.Equipment
            {
                Id = 1,
                EquipmentId = 1,
                Status = Equipment.EquipmentStatus.Ok,
                Message = "Test message",
                Timestamp = Timestamp.FromDateTime(DateTime.UtcNow),
            };
        }

        private static async Task SendDeviceToCloudMessagesAsync(DeviceClient iotDevice, Equipment.Equipment equipment)
        {
            // Create JSON message
            var message = new Message(Encoding.UTF8.GetBytes(equipment.ToString()))
            {
                // Add a custom application property to the message.
                // An IoT hub can filter on these properties without access to the message body.
                // message.Properties.Add("temperatureAlert", (currentTemperature > 30) ? "true" : "false");
                ContentType = "application/json",
                ContentEncoding = "utf-8"
            };

            // Send the telemetry message
            await iotDevice.SendEventAsync(message).ConfigureAwait(false);
            Console.WriteLine("{0} > Sending message: {1}", DateTime.Now, equipment.ToString());

            await Task.Delay(TimeSpan.FromSeconds(1)).ConfigureAwait(false);
        }

        [Function("GenerateDeviceResponse")]
        public static async Task Run([TimerTrigger("0 */5 * * * *")] TimerInfo myTimer, ILogger log)
        {
            log.LogInformation($"C# Timer trigger function executed at: {DateTime.Now}");
            Console.WriteLine($"C# Timer trigger function executed at: {DateTime.Now}");

            // do not use connection string in production!!!
            DeviceClient iotDevice =
                DeviceClient.CreateFromConnectionString(
                    "HostName=iiot-main-hub.azure-devices.net;SharedAccessKeyName=iothubowner;SharedAccessKey=oRetTItYwDyD8kGsb4Zn8MO+8ZA0+uE0XAIoTC3z3bA=");
            
            var status = GetEquipmentResponse();

            await SendDeviceToCloudMessagesAsync(iotDevice, status);
            log.LogInformation($"Data sent to IoT Event Hub: {status} at: {DateTime.Now}");

            if (myTimer.ScheduleStatus is not null)
            {
                log.LogInformation($"Next timer schedule at: {myTimer.ScheduleStatus.Next}");
            }
        }
    }
}
