using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Mvc;

namespace FactoryWatcherAPI.Controllers
{
    [Route("api/v{version:apiVersion}/humidities")]
    [ApiController]
    [ApiVersion("1.0")]
    public class HumidityController : ControllerBase
    {
        private readonly IBaseService<Humidity, CreateHumidityDto> _humidityService;

        public HumidityController(IBaseService<Humidity, CreateHumidityDto> HumidityService)
        {
            var logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BaseService<Humidity, CreateHumidityDto>>();
            _humidityService = HumidityService;
            //var HumidityServiceWithLogging = BaseServiceDispatch<Humidity>.Create(_humidityService, logger);
        }

        [HttpPost]
        public async Task<IActionResult> CreateItemAsync(CreateHumidityDto item)
        {
            var result = await _humidityService.Add(item);
            return Ok(result);
        }

        [HttpGet]
        public async Task<IActionResult> GetItemsAsync()
        {
            Result<IEnumerable<Humidity>> result = await _humidityService.GetAll();
            return Ok(result.Entity);
        }

        [HttpGet("{id}")]
        public async Task<IActionResult> GetItemAsync(string id)
        {
            var item = await _humidityService.GetById(id);
            return Ok(item);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> UpdateItemAsync(string id, CreateHumidityDto item)
        {
            var result = await _humidityService.Update(id, item);
            if (result.IsFailure)
            {
                return NotFound();
            }
            return NoContent();
        }

        //[HttpDelete("{id}")]
        //public async Task<IActionResult> DeleteItemAsync(string id)
        //{
        //    var result = await _humidityService.Delete(id);
        //    return NoContent();
        //}
    }
}