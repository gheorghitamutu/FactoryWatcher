using Microsoft.Azure.Cosmos;

public interface IRepository<T>
{
    Task<ItemResponse<T>> Add(T item, string partitionKey);
    Task<ItemResponse<T>> Delete(string id, string partitionKey);
    Task<IEnumerable<T>> GetAll();
    Task<ItemResponse<T>> GetByIdAndPartitionKey(string id, string partitionKey);
    Task<ItemResponse<T>> Update(string id, T item, string partitionKey);
}