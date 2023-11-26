using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Mvc;

namespace FactoryWatcherAPI.Controllers
{
    [Route("api/v{version:apiVersion}/courses")]
    [ApiController]
    [ApiVersion("1.0")]
    public class TemperatureController : ControllerBase
    {
        private readonly IBaseService<Temperature, CreateTemperatureDto> _temperatureService;
        private readonly string partitionKey = "test";

        public TemperatureController(IBaseService<Temperature, CreateTemperatureDto> temperatureService)
        {
            _temperatureService = temperatureService;
        }

        [HttpPost]
        public async Task<IActionResult> CreateItemAsync(CreateTemperatureDto item)
        {
            var result = await _temperatureService.Add(item, partitionKey);
            if (result.IsFailure)
            {
                return BadRequest();
            }
            return Created(result.Entity.Id);
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
            var item = await _temperatureService.GetById(id, partitionKey);
            if (item.IsFailure)
            {
                return NotFound();
            }
            return Ok(item.Entity);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> UpdateItemAsync(string id, CreateTemperatureDto item)
        {
            var result = await _temperatureService.Update(id, item, partitionKey);
            if (result.IsFailure)
            {
                return NotFound();
            }
            return NoContent();
        }

        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteItemAsync(string id)
        {
            var result = await _temperatureService.Delete(id, partitionKey);
            return NoContent();
        }
    }
}