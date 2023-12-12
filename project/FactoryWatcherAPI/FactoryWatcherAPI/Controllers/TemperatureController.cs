using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace FactoryWatcherAPI.Controllers
{
    [Authorize]
    [Route("api/v{version:apiVersion}/temperatures")]
    [ApiController]
    [ApiVersion("1.0")]
    public class TemperatureController : ControllerBase
    {
        private readonly IBaseService<Temperature, CreateTemperatureDto> _temperatureService;
        private readonly IBaseService<Temperature, CreateTemperatureDto> temperatureServiceWithLogging;

        public TemperatureController(IBaseService<Temperature, CreateTemperatureDto> temperatureService)
        {
            var logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BaseServiceDispatch<IBaseService<Temperature, CreateTemperatureDto>>>();
            _temperatureService = temperatureService;
            temperatureServiceWithLogging = BaseServiceDispatch<IBaseService<Temperature, CreateTemperatureDto>>.Create(_temperatureService, logger);
        }

        [HttpPost]
        public async Task<IActionResult> CreateItemAsync(CreateTemperatureDto item)
        {
            var result = await temperatureServiceWithLogging.Add(item);
            return Ok(result);
        }

        [HttpGet]
        public async Task<IActionResult> GetItemsAsync()
        {
            Result<IEnumerable<Temperature>> result = await temperatureServiceWithLogging.GetAll();
            return Ok(result.Entity);
        }

        [HttpGet("{id}")]
        public async Task<IActionResult> GetItemAsync(string id)
        {
            var item = await temperatureServiceWithLogging.GetById(id);
            return Ok(item);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> UpdateItemAsync(string id, CreateTemperatureDto item)
        {
            var result = await temperatureServiceWithLogging.Update(id, item);
            if (result.IsFailure)
            {
                return NotFound();
            }
            return NoContent();
        }

        //[HttpDelete("{id}")]
        //public async Task<IActionResult> DeleteItemAsync(string id)
        //{
        //    var result = await _temperatureService.Delete(id);
        //    return NoContent();
        //}
    }
}