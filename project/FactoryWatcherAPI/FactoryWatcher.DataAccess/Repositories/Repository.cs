using Azure;
using Microsoft.Azure.Cosmos;
using System.Net;

public class CosmosDbRepository<T> : IRepository<T>
{
    private readonly Container _container;
    private string _collectionName;

    public CosmosDbRepository(
        CosmosClient cosmosClient,
        string databaseName,
        string containerName,
        string collectionName)
    {
        _collectionName = collectionName;
        _container = cosmosClient.GetContainer(databaseName, containerName);
    }

    public async Task<ItemResponse<T>> GetByIdAndPartitionKey(string id, string partitionKey)
    {
        return await _container.ReadItemAsync<T>(id, new PartitionKey(partitionKey));
    }

    public async Task<ItemResponse<T>> Add(T item, string partitionKey)
    {
        return await _container.CreateItemAsync(item, new PartitionKey(partitionKey));
    }

    public async Task<ItemResponse<T>> Update(string id, T item, string partitionKey)
    {
        return await _container.ReplaceItemAsync(item, id, new PartitionKey(partitionKey));
    }

    public async Task<ItemResponse<T>> Delete(string id, string partitionKey)
    {
        return await _container.DeleteItemAsync<T>(id, new PartitionKey(partitionKey));
    }

    public async Task<IEnumerable<T>> GetAll()
    {
        var query = _container.GetItemQueryIterator<T>(new QueryDefinition($"SELECT * FROM {_collectionName}"));
        var results = new List<T>();

        while (query.HasMoreResults)
        {
            var response = await query.ReadNextAsync();
            results.AddRange(response.ToList());
        }

        return results;
    }
}
