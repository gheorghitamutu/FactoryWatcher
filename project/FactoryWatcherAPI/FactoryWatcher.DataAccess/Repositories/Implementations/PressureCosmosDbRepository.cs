using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

namespace FactoryWatcher.DataAccess.Repositories.Implementations
{
    public class PressureCosmosDbRepository : CosmosDbRepository<Pressure>
    {
        public PressureCosmosDbRepository(CosmosClient cosmosClient, IOptions<CosmosDbSettings> cosmosDbSettings) : base(cosmosClient, cosmosDbSettings, "Pressures")
        {
        }
    }
}
