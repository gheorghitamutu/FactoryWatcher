using FactoryWatcher.DataAccess;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

public class CosmosDbRepository<T> : ICosmosDbRepository<T> where T : class
{
    private readonly Container _container;

    private readonly CosmosClient _cosmosClient;

    private readonly String _partitionKey = "partitionKey";

    private readonly String _collectionName = "myCollection";

    public CosmosDbRepository(CosmosClient cosmosClient, IOptions<CosmosDbSettings> cosmosDbSettings)
    {
        _cosmosClient = cosmosClient;

        // Get or create the container based on configuration
        var database = _cosmosClient.GetDatabase(cosmosDbSettings.Value.DatabaseId);
        _container = database.GetContainer(cosmosDbSettings.Value.ContainerId);
    }

    public async Task<ItemResponse<T>> GetByIdAndPartitionKey(string id)
    {
        return await _container.ReadItemAsync<T>(id, new PartitionKey(_partitionKey));
    }

    public async Task<ItemResponse<T>> Add(T item)
    {
        return await _container.CreateItemAsync(item, new PartitionKey(_partitionKey));
    }

    public async Task<ItemResponse<T>> Update(string id, T item)
    {
        return await _container.ReplaceItemAsync(item, id, new PartitionKey(_partitionKey));
    }


    public async Task<IEnumerable<T>> GetAll()
    {
        var query = new QueryDefinition($"SELECT * FROM {_container.Id}");

        var iterator = _container.GetItemQueryIterator<T>(query);

        var results = new List<T>();

        while (iterator.HasMoreResults)
        {
            var response = await iterator.ReadNextAsync();
            results.AddRange(response.Resource);
        }

        return results;
    }
}
