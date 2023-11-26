using FactoryWatcher.Models.Helpers;

namespace FactoryWatcher.BusinessLogic
{
    public interface IBaseService<T, TDto> where T : class where TDto : class
    {
        Task<Result<T>> Add(TDto dto, string partitionKet);
        Task<Result<T>> Delete(string id, string partitionKey);
        Task<Result<IEnumerable<T>>> GetAll();
        Task<Result<T>> GetById(string id, string partitionKey);
        Task<Result<T>> Update(string id, TDto dto, string partitionKey);
    }
}