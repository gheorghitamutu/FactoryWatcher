using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;

namespace FactoryWatcher.BusinessLogic
{
    public interface IBaseService<T, TDto>
        where T : BaseEntity
        where TDto : class
    {
        Task<ItemResponse<T>> Add(TDto dto);
        Task<Result<IEnumerable<T>>> GetAll();
        Task<ItemResponse<T>> GetById(string id);
        Task<Result<T>> Update(string id, TDto dto);
    }
}