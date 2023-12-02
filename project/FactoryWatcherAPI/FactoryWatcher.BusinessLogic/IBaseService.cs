using FactoryWatcher.Models.Helpers;
using Microsoft.Azure.Cosmos;

namespace FactoryWatcher.BusinessLogic
{
    public interface IBaseService<T, TDto>
        where T : class
        where TDto : class
    {
        Task<ItemResponse<T>> Add(TDto dto);
        Task<Result<IEnumerable<T>>> GetAll();
        Task<ItemResponse<T>> GetById(string id);
        Task<Result<T>> Update(string id, TDto dto);
    }
}