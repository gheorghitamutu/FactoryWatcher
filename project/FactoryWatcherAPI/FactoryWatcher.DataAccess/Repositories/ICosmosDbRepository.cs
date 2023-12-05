using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;

public interface ICosmosDbRepository<T> where T : BaseEntity
{
    Task<ItemResponse<T>> Add(T item);
    Task<IEnumerable<T>> GetAll();
    Task<ItemResponse<T>> GetByIdAndPartitionKey(string id);
    Task<ItemResponse<T>> Update(string id, T item);
}