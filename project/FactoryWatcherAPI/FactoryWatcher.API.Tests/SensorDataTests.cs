using AutoMapper;
using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Models;
using FluentAssertions;
using LabsAndCoursesManagement.BusinessLogic.Mappers;
using Microsoft.Azure.Cosmos;
using Moq;

namespace FactoryWatcher.API.Tests
{
    public class SensorsTests
    {
        private IMapper _mapper;
        public SensorsTests()
        {
            // Configure AutoMapper mappings
            AutoMapperBuilder autoMapperBuilder = new();
            _mapper = autoMapperBuilder.Build();
        }

        [Fact]
        public async void When_AddNewEntry_Then_ShouldReturnCreated()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<SensorData>>();

            var dto = CreateSUT();

            var responseMock = new Mock<ItemResponse<SensorData>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.Created
            );

            mockCosmosDbRepository.Setup(x => x.Add(It.IsAny<SensorData>())).Returns(Task.FromResult(responseMock.Object));
            var service = new BaseService<SensorData, CreateSensorDataDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.Add(dto);
            // Assert
            serviceResponse.StatusCode.Should().Be(System.Net.HttpStatusCode.Created);
        }

        [Fact]
        public async void When_AddWrongEntry_Then_ShouldReturnBadRequest()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<SensorData>>();
            var dto = CreateSUT();


            var responseMock = new Mock<ItemResponse<SensorData>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.BadRequest
            );

            mockCosmosDbRepository.Setup(x => x.Add(It.IsAny<SensorData>())).Returns(Task.FromResult(responseMock.Object));
            var service = new BaseService<SensorData, CreateSensorDataDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.Add(dto);
            // Assert
            serviceResponse.StatusCode.Should().Be(System.Net.HttpStatusCode.BadRequest);
        }

        [Fact]
        public async void When_GetAll_Then_ShouldReturnAllItems()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<SensorData>>();

            var dto = CreateSUT();
            var SensorData = _mapper.Map<CreateSensorDataDto, SensorData>(dto);

            var responseMock = new Mock<ItemResponse<SensorData>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.Created
            );

            mockCosmosDbRepository.Setup(x => x.GetAll()).Returns(Task.FromResult((IEnumerable<SensorData>) new List<SensorData> { SensorData }));
            var service = new BaseService<SensorData, CreateSensorDataDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.GetAll();
            // Assert
            serviceResponse.Entity.Count().Should().Be(1);    
        }

        [Fact]
        public async void When_GetById_Then_ShouldReturnSpecificItem()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<SensorData>>();

            var dto = CreateSUT();
            var SensorData = _mapper.Map<CreateSensorDataDto, SensorData>(dto);

            var responseMock = new Mock<ItemResponse<SensorData>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.OK
            );
            responseMock.Setup(x => x.Resource).Returns(
              SensorData
           );

            mockCosmosDbRepository.Setup(x => x.GetByIdAndPartitionKey(It.IsAny<string>())).Returns(Task.FromResult(responseMock.Object));
            var service = new BaseService<SensorData, CreateSensorDataDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.GetById(SensorData.Id.ToString());
            // Assert
            serviceResponse.StatusCode.Should().Be(System.Net.HttpStatusCode.OK);
            serviceResponse.Resource.SensorId.Should().Be(dto.SensorId);
            serviceResponse.Resource.Timestamp.Should().Be(dto.Timestamp);
        }

        [Fact]
        public async void When_GetByInexistentId_Then_ShouldReturnNotFound()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<SensorData>>();

            var responseMock = new Mock<ItemResponse<SensorData>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.NotFound
            );

            mockCosmosDbRepository.Setup(x => x.GetByIdAndPartitionKey(It.IsAny<string>())).Returns(Task.FromResult(responseMock.Object));
            var service = new BaseService<SensorData, CreateSensorDataDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.GetById("inexistent");
            // Assert
            serviceResponse.StatusCode.Should().Be(System.Net.HttpStatusCode.NotFound);
        }

        private static CreateSensorDataDto CreateSUT()
        {
            return new CreateSensorDataDto
            {
                SensorId = Guid.NewGuid(),
                Timestamp = DateTime.Now,
            };
        }
    }
}