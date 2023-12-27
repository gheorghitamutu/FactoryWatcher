using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace FactoryWatcherAPI.Controllers
{
    //[Authorize]
    [Route("api/v{version:apiVersion}/sensors")]
    [ApiController]
    [ApiVersion("1.0")]
    public class SensorDataController : ControllerBase
    {
        private readonly IBaseService<SensorData, CreateSensorDataDto> _SensorDataService;
        private readonly IBaseService<SensorData, CreateSensorDataDto> SensorDataServiceWithLogging;

        public SensorDataController(IBaseService<SensorData, CreateSensorDataDto> SensorDataService)
        {
            var logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BaseServiceDispatch<IBaseService<SensorData, CreateSensorDataDto>>>();
            _SensorDataService = SensorDataService;
            SensorDataServiceWithLogging = BaseServiceDispatch<IBaseService<SensorData, CreateSensorDataDto>>.Create(_SensorDataService, logger);
        }

        [HttpPost]
        public async Task<IActionResult> CreateItemAsync(CreateSensorDataDto item)
        {
            var result = await SensorDataServiceWithLogging.Add(item);
            return Ok(result);
        }

        [HttpGet]
        public async Task<IActionResult> GetItemsAsync()
        {
            Result<IEnumerable<SensorData>> result = await SensorDataServiceWithLogging.GetAll();
            return Ok(result.Entity);
        }

        [HttpGet("{id}")]
        public async Task<IActionResult> GetItemAsync(string id)
        {
            var item = await SensorDataServiceWithLogging.GetById(id);
            return Ok(item);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> UpdateItemAsync(string id, CreateSensorDataDto item)
        {
            var result = await SensorDataServiceWithLogging.Update(id, item);
            if (result.IsFailure)
            {
                return NotFound();
            }
            return NoContent();
        }

        //[HttpDelete("{id}")]
        //public async Task<IActionResult> DeleteItemAsync(string id)
        //{
        //    var result = await _SensorDataService.Delete(id);
        //    return NoContent();
        //}
    }
}