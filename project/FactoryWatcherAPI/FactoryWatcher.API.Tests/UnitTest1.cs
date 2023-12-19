using AutoMapper;
using Bogus;
using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Helpers;
using FactoryWatcher.Models.Models;
using FluentAssertions;
using LabsAndCoursesManagement.BusinessLogic.Mappers;
using Microsoft.Azure.Cosmos;
using Moq;

namespace FactoryWatcher.API.Tests
{
    public class UnitTest1
    {
        private IMapper _mapper;
        public UnitTest1()
        {
            // Configure AutoMapper mappings
            AutoMapperBuilder autoMapperBuilder = new();
            _mapper = autoMapperBuilder.Build();
        }

        [Fact]
        public async void When_AddNewEntry_Then_ShouldReturnCreated()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<Humidity>>();

            var dto = new CreateHumidityDto
            {
                SensorId = Guid.NewGuid(),
                Timestamp = DateTime.Now,
            };

            var responseMock = new Mock<ItemResponse<Humidity>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.Created
            );

            mockCosmosDbRepository.Setup(x => x.Add(It.IsAny<Humidity>())).Returns(Task.FromResult(responseMock.Object));
            var service = new BaseService<Humidity, CreateHumidityDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.Add(dto);
            // Assert
            serviceResponse.StatusCode.Should().Be(System.Net.HttpStatusCode.Created);
        }

        [Fact]
        public async void When_AddWrongEntry_Then_ShouldReturnBadRequest()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<Humidity>>();
            var dto = CreateSUT();


            var responseMock = new Mock<ItemResponse<Humidity>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.BadRequest
            );

            mockCosmosDbRepository.Setup(x => x.Add(It.IsAny<Humidity>())).Returns(Task.FromResult(responseMock.Object));
            var service = new BaseService<Humidity, CreateHumidityDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.Add(dto);
            // Assert
            serviceResponse.StatusCode.Should().Be(System.Net.HttpStatusCode.BadRequest);
        }

        [Fact]
        public async void When_GetAll_Then_ShouldReturnAllItems()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<Humidity>>();

            var dto = CreateSUT();
            var humidity = _mapper.Map<CreateHumidityDto, Humidity>(dto);

            var responseMock = new Mock<ItemResponse<Humidity>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.Created
            );

            mockCosmosDbRepository.Setup(x => x.GetAll()).Returns(Task.FromResult((IEnumerable<Humidity>) new List<Humidity> { humidity }));
            var service = new BaseService<Humidity, CreateHumidityDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.GetAll();
            // Assert
            serviceResponse.Entity.Count().Should().Be(1);    
        }

        [Fact]
        public async void When_GetById_Then_ShouldReturnSpecificItem()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<Humidity>>();

            var dto = CreateSUT();
            var humidity = _mapper.Map<CreateHumidityDto, Humidity>(dto);

            var responseMock = new Mock<ItemResponse<Humidity>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.OK
            );
            responseMock.Setup(x => x.Resource).Returns(
              humidity
           );

            mockCosmosDbRepository.Setup(x => x.GetByIdAndPartitionKey(It.IsAny<string>())).Returns(Task.FromResult(responseMock.Object));
            var service = new BaseService<Humidity, CreateHumidityDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.GetById(humidity.Id.ToString());
            // Assert
            serviceResponse.StatusCode.Should().Be(System.Net.HttpStatusCode.OK);
            serviceResponse.Resource.SensorId.Should().Be(dto.SensorId);
            serviceResponse.Resource.Timestamp.Should().Be(dto.Timestamp);
        }

        [Fact]
        public async void When_GetByInexistentId_Then_ShouldReturnNotFound()
        {
            // Arrange
            var mockCosmosDbRepository = new Mock<ICosmosDbRepository<Humidity>>();

            var responseMock = new Mock<ItemResponse<Humidity>>();
            responseMock.Setup(x => x.StatusCode).Returns(
               System.Net.HttpStatusCode.NotFound
            );

            mockCosmosDbRepository.Setup(x => x.GetByIdAndPartitionKey(It.IsAny<string>())).Returns(Task.FromResult(responseMock.Object));
            var service = new BaseService<Humidity, CreateHumidityDto>(mockCosmosDbRepository.Object);

            // Act 
            var serviceResponse = await service.GetById("inexistent");
            // Assert
            serviceResponse.StatusCode.Should().Be(System.Net.HttpStatusCode.NotFound);
        }

        private static CreateHumidityDto CreateSUT()
        {
            return new CreateHumidityDto
            {
                SensorId = Guid.NewGuid(),
                Timestamp = DateTime.Now,
            };
        }
    }
}