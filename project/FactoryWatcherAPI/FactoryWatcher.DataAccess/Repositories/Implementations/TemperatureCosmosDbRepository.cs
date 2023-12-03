using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

namespace FactoryWatcher.DataAccess.Repositories.Implementations
{
    public class TemperatureCosmosDbRepository : CosmosDbRepository<Temperature>
    {
        public TemperatureCosmosDbRepository(CosmosClient cosmosClient, IOptions<CosmosDbSettings> cosmosDbSettings) : base(cosmosClient, cosmosDbSettings)
        {
        }
    }
}
