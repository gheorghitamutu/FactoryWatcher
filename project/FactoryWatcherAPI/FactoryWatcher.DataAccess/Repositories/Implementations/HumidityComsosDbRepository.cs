using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

namespace FactoryWatcher.DataAccess.Repositories.Implementations
{
    public class HumidityCosmosDbRepository : CosmosDbRepository<Humidity>
    {
        public HumidityCosmosDbRepository(CosmosClient cosmosClient, IOptions<CosmosDbSettings> cosmosDbSettings) : base(cosmosClient, cosmosDbSettings, "Humidities")
        {
        }
    }
}
