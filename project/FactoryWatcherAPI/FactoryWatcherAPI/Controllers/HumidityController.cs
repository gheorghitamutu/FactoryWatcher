using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace FactoryWatcherAPI.Controllers
{
    [Authorize]
    [Route("api/v{version:apiVersion}/humidities")]
    [ApiController]
    [ApiVersion("1.0")]
    public class HumidityController : ControllerBase
    {
        private readonly IBaseService<Humidity, CreateHumidityDto> _humidityService;
        private readonly IBaseService<Humidity, CreateHumidityDto> HumidityServiceWithLogging;

        public HumidityController(IBaseService<Humidity, CreateHumidityDto> HumidityService)
        {
            var logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BaseServiceDispatch<IBaseService<Humidity, CreateHumidityDto>>>();
            _humidityService = HumidityService;
            HumidityServiceWithLogging = BaseServiceDispatch<IBaseService<Humidity, CreateHumidityDto>>.Create(_humidityService, logger);
        }

        [HttpPost]
        public async Task<IActionResult> CreateItemAsync(CreateHumidityDto item)
        {
            var result = await HumidityServiceWithLogging.Add(item);
            return Ok(result);
        }

        [HttpGet]
        public async Task<IActionResult> GetItemsAsync()
        {
            Result<IEnumerable<Humidity>> result = await HumidityServiceWithLogging.GetAll();
            return Ok(result.Entity);
        }

        [HttpGet("{id}")]
        public async Task<IActionResult> GetItemAsync(string id)
        {
            var item = await HumidityServiceWithLogging.GetById(id);
            return Ok(item);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> UpdateItemAsync(string id, CreateHumidityDto item)
        {
            var result = await HumidityServiceWithLogging.Update(id, item);
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