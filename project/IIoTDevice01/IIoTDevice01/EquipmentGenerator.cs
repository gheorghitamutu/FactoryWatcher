using Microsoft.Azure.Devices.Client;
using Equipment;
using Google.Protobuf.WellKnownTypes;
using Google.Protobuf;
using System.Text;

namespace IIoTDevice01
{
    public class EquipmentGenerator
    {
        public static Equipment.Equipment GenerateEquipmentResponse()
        {
            return new Equipment.Equipment
            {
                Id = 1,
                EquipmentId = 1,
                Status = EquipmentStatus.Ok,
                Message = "Test message",
                Timestamp = Timestamp.FromDateTime(DateTime.UtcNow),

            };
        }

        public static async Task SendEquipment(DeviceClient iotDevice, Equipment.Equipment equipment)
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
    }
}
