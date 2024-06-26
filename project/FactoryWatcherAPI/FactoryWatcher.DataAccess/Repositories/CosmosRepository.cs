﻿using FactoryWatcher.DataAccess;
using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

public class CosmosDbRepository<T> : ICosmosDbRepository<T> where T : BaseEntity
{
    private readonly Container _container;

    private readonly CosmosClient _cosmosClient;


    public CosmosDbRepository(CosmosClient cosmosClient, IOptions<CosmosDbSettings> cosmosDbSettings, String containerId)
    {
        _cosmosClient = cosmosClient;

        // Get or create the container based on configuration
        var database = _cosmosClient.GetDatabase(cosmosDbSettings.Value.DatabaseId);
        database.CreateContainerIfNotExistsAsync(containerId, "/id").Wait();
        _container = database.GetContainer(containerId);
    }

    public async Task<ItemResponse<T>> GetByIdAndPartitionKey(string id)
    {
        return await _container.ReadItemAsync<T>(id, new PartitionKey(id));
    }

    public async Task<ItemResponse<T>> Add(T item)
    {
        return await _container.CreateItemAsync(item, new PartitionKey(item.Id.ToString()));
    }

    public async Task<ItemResponse<T>> Update(string id, T item)
    {
        return await _container.ReplaceItemAsync(item, id, new PartitionKey(item.Id.ToString()));
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
