using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

namespace FactoryWatcher.DataAccess.Repositories.Implementations
{
    public class SensorDataRepository : CosmosDbRepository<SensorData>
    {
        public SensorDataRepository(CosmosClient cosmosClient, IOptions<CosmosDbSettings> cosmosDbSettings) : base(cosmosClient, cosmosDbSettings, "SensorData")
        {
        }
    }
}
