using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{
    public class Humidity: BaseEntity
    {
        public Humidity()
        {
            Id = Guid.NewGuid();
        }

        [JsonProperty("value")]
        public double Value { get; private set; }
    }
}
