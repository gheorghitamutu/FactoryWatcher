using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace FactoryWatcherAPI.Controllers
{
    [Authorize]
    [Route("api/v{version:apiVersion}/pressures")]
    [ApiController]
    [ApiVersion("1.0")]
    public class PressureController : ControllerBase
    {
        private readonly IBaseService<Pressure, CreatePressureDto> _pressureService;
        private readonly IBaseService<Pressure, CreatePressureDto> PressureServiceWithLogging;

        public PressureController(IBaseService<Pressure, CreatePressureDto> PressureService)
        {
            var logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BaseServiceDispatch<IBaseService<Pressure, CreatePressureDto>>>();
            _pressureService = PressureService;
            PressureServiceWithLogging = BaseServiceDispatch<IBaseService<Pressure, CreatePressureDto>>.Create(_pressureService, logger);
        }

        [HttpPost]
        public async Task<IActionResult> CreateItemAsync(CreatePressureDto item)
        {
            var result = await PressureServiceWithLogging.Add(item);
            return Ok(result);
        }

        [HttpGet]
        public async Task<IActionResult> GetItemsAsync()
        {
            Result<IEnumerable<Pressure>> result = await PressureServiceWithLogging.GetAll();
            return Ok(result.Entity);
        }

        [HttpGet("{id}")]
        public async Task<IActionResult> GetItemAsync(string id)
        {
            var item = await PressureServiceWithLogging.GetById(id);
            return Ok(item);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> UpdateItemAsync(string id, CreatePressureDto item)
        {
            var result = await PressureServiceWithLogging.Update(id, item);
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