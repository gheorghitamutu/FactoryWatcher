using FactoryWatcher.Models.Helpers;
using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{

    public class CreateSensorDataDto
    {
        
        [JsonProperty("sensor_id")]
        public Guid SensorId { get; set; }

        [JsonProperty("timestamp")]
        public DateTime Timestamp { get; set; }


        [JsonProperty("extra_info")]
        public String ExtraInfo { get; set; }


        [JsonProperty("status")]
        public Status Status { get; set; }

        [JsonProperty("humidity")]
        public float Humidity { get; set; }


        [JsonProperty("temperature")]
        public float Temperature { get; set; }


        [JsonProperty("pressure")]
        public float Pressure { get; set; }
    }
}




