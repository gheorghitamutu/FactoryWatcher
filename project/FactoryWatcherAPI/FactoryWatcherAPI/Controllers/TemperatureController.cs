using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Mvc;

namespace FactoryWatcherAPI.Controllers
{
    [Route("api/v{version:apiVersion}/temperatures")]
    [ApiController]
    [ApiVersion("1.0")]
    public class TemperatureController : ControllerBase
    {
        private readonly IBaseService<Temperature, CreateTemperatureDto> _temperatureService;

        public TemperatureController(IBaseService<Temperature, CreateTemperatureDto> temperatureService)
        {
            var logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BaseServiceDispatch<IBaseService<Temperature, CreateTemperatureDto>>>();
            _temperatureService = BaseServiceDispatch<IBaseService<Temperature, CreateTemperatureDto>>.Create(temperatureService, logger);
        }

        [HttpPost]
        public async Task<IActionResult> CreateItemAsync(CreateTemperatureDto item)
        {
            var result = await _temperatureService.Add(item);
            return Ok(result);
        }

        [HttpGet]
        public async Task<IActionResult> GetItemsAsync()
        {
            Result<IEnumerable<Temperature>> result = await _temperatureService.GetAll();
            return Ok(result.Entity);
        }

        [HttpGet("{id}")]
        public async Task<IActionResult> GetItemAsync(string id)
        {
            var item = await _temperatureService.GetById(id);
            return Ok(item);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> UpdateItemAsync(string id, CreateTemperatureDto item)
        {
            var result = await _temperatureService.Update(id, item);
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