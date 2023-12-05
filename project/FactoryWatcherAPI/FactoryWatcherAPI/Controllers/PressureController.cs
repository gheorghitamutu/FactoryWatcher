using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Mvc;

namespace FactoryWatcherAPI.Controllers
{
    [Route("api/v{version:apiVersion}/pressures")]
    [ApiController]
    [ApiVersion("1.0")]
    public class PressureController : ControllerBase
    {
        private readonly IBaseService<Pressure, CreatePressureDto> _pressureService;

        public PressureController(IBaseService<Pressure, CreatePressureDto> PressureService)
        {
            //var logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BaseService<Pressure, CreatePressureDto>>();
            _pressureService = PressureService;
            //var PressureServiceWithLogging = BaseServiceDispatch<Pressure>.Create(_pressureService, logger);
        }

        [HttpPost]
        public async Task<IActionResult> CreateItemAsync(CreatePressureDto item)
        {
            var result = await _pressureService.Add(item);
            return Ok(result);
        }

        [HttpGet]
        public async Task<IActionResult> GetItemsAsync()
        {
            Result<IEnumerable<Pressure>> result = await _pressureService.GetAll();
            return Ok(result.Entity);
        }

        [HttpGet("{id}")]
        public async Task<IActionResult> GetItemAsync(string id)
        {
            var item = await _pressureService.GetById(id);
            return Ok(item);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> UpdateItemAsync(string id, CreatePressureDto item)
        {
            var result = await _pressureService.Update(id, item);
            if (result.IsFailure)
            {
                return NotFound();
            }
            return NoContent();
        }

        //[HttpDelete("{id}")]
        //public async Task<IActionResult> DeleteItemAsync(string id)
        //{
        //    var result = await _pressureService.Delete(id);
        //    return NoContent();
        //}
    }
}