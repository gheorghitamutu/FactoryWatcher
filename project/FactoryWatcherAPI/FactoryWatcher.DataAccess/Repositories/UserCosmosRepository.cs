using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

namespace FactoryWatcher.DataAccess.Repositories
{
    public class UserCosmosRepository : IUserCosmosRepository
    {
        private readonly string containerId = "Users";
        private readonly Container _container;

        private readonly CosmosClient _cosmosClient;


        public UserCosmosRepository(CosmosClient cosmosClient, IOptions<CosmosDbSettings> cosmosDbSettings)
        {
            _cosmosClient = cosmosClient;

            // Get or create the container based on configuration
            var database = _cosmosClient.GetDatabase(cosmosDbSettings.Value.DatabaseId);
            _container = database.GetContainer(containerId);
        }

        public async Task<ItemResponse<UserModel>> GetByIdAndPartitionKey(string id)
        {
            return await _container.ReadItemAsync<UserModel>(id, new PartitionKey(id));
        }

        public async Task<ItemResponse<UserModel>> Add(UserModel item)
        {
            return await _container.CreateItemAsync(item, new PartitionKey(item.Id.ToString()));
        }

        public async Task<ItemResponse<UserModel>> Update(string id, UserModel item)
        {
            return await _container.ReplaceItemAsync(item, id, new PartitionKey(item.Id.ToString()));
        }


        public async Task<IEnumerable<UserModel>> GetAll()
        {
            var query = new QueryDefinition($"SELECT * FROM {_container.Id}");

            var iterator = _container.GetItemQueryIterator<UserModel>(query);

            var results = new List<UserModel>();

            while (iterator.HasMoreResults)
            {
                var response = await iterator.ReadNextAsync();
                results.AddRange(response.Resource);
            }

            return results;
        }
    }
}
