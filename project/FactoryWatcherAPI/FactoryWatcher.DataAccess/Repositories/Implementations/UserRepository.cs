using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

namespace FactoryWatcher.DataAccess.Repositories.Implementations
{
    public class UserRepository : CosmosDbRepository<FactoryWatcher.Models.Models.User>
    {
        public UserRepository(CosmosClient cosmosClient, IOptions<CosmosDbSettings> cosmosDbSettings) : base(cosmosClient, cosmosDbSettings, "Users")
        {
        }
    }
}
