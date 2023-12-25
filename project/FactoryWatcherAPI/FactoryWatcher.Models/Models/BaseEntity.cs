using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{
    public abstract class BaseEntity
    {
        [JsonProperty("id")]
        public Guid Id { get; protected set; }
    }
}

