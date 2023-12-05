using FactoryWatcher.Models.Helpers;
using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{

    public abstract class DtoBaseEntity
    {
        
        [JsonProperty("sensor_id")]
        public Guid SensorId { get; set; }

        [JsonProperty("timestamp")]
        public DateTime Timestamp { get; set; }


        [JsonProperty("extra_info")]
        public String ExtraInfo { get; set; }


        [JsonProperty("status")]
        public Status Status { get; set; }

        public override string ToString()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }
    }
}




