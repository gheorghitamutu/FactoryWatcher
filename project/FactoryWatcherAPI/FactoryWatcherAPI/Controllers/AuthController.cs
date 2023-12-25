using FactoryWatcher.BusinessLogic;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.IdentityModel.Tokens;
using System.IdentityModel.Tokens.Jwt;
using System.Security.Claims;
using System.Security.Cryptography;

namespace FactoryWatcher.Controllers
{
    [Route("api/v{version:apiVersion}/auth")]
    [ApiController]
    [ApiVersion("1.0")]
    public class AuthController : Controller
    {
        private readonly IConfiguration _configuration;
        private readonly ICosmosDbRepository<User> _userService;
        private readonly ICosmosDbRepository<User> UserServiceWithLogging;

        private static readonly TimeSpan TokenLifetime = TimeSpan.FromHours(1);

        public AuthController(IConfiguration configuration, ICosmosDbRepository<User> UserService)
        {
            _configuration = configuration;
            var logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BaseServiceDispatch<ICosmosDbRepository<User>>>();
            _userService = UserService;
            UserServiceWithLogging = BaseServiceDispatch<ICosmosDbRepository<User>>.Create(_userService, logger);
        }

        [HttpPost("register")]
        public async Task<ActionResult<User>> Register(CreateUserDto request)
        {
            IEnumerable<User> users = await UserServiceWithLogging.GetAll();

            foreach (var user in users)
            {
                if (user.UserName == request.UserName)
                {
                    return BadRequest("Username Taken!");
                }
            }

            CreatePasswordHash(request.Password, out byte[] passwordHash, out byte[] passwordSalt);
            var newUser = new User()
            {
                UserName = request.UserName,
                PasswordHash = passwordHash,
                PasswordSalt = passwordSalt,
            };

            var result = await UserServiceWithLogging.Add(newUser);
            return Ok(result);
        }

        [HttpPost("login")]
        public async Task<ActionResult<string>> Login(CreateUserDto request)
        {
            User foundUser = null;
            IEnumerable<User> users = await UserServiceWithLogging.GetAll();

            foreach (var user in users)
            {
                if (user.UserName == request.UserName)
                {
                    foundUser = user; break;
                }
            }

            if (foundUser == null)
            {
                return BadRequest("User not found");
            }

            if (!VerifyPasswordHash(request.Password, foundUser.PasswordHash, foundUser.PasswordSalt))
            {
                return BadRequest("Wrong password");
            }

            string token = CreateToken(foundUser);

            var refreshToken = GenerateRefreshToken();
            SetRefreshToken(refreshToken, foundUser);

            return Ok(token);
        }

        [HttpPost("refresh-token")]
        public async Task<ActionResult<string>> RefreshToken(CreateUserDto request)
        {
            User foundUser = null;
            IEnumerable<User> users = await UserServiceWithLogging.GetAll();

            foreach (var user in users)
            {
                if (user.UserName == request.UserName)
                {
                    foundUser = user; break;
                }
            }

            if (foundUser == null)
            {
                return BadRequest("User not found");
            }

            var refreshToken = Request.Cookies["refreshToken"];

            if (!foundUser.RefreshToken.Equals(refreshToken))
            {
                return Unauthorized("Invalid Refresh Token!");
            }

            if (foundUser.TokenExpires < DateTime.UtcNow)
            {
                return Unauthorized("Token Expired!");
            }

            string token = CreateToken(foundUser);
            var newRefreshToken = GenerateRefreshToken();
            SetRefreshToken(newRefreshToken, foundUser);

            return Ok(token);
        }

        private RefreshToken GenerateRefreshToken()
        {
            var refreshToken = new RefreshToken
            {
                Token = Convert.ToBase64String(RandomNumberGenerator.GetBytes(64)),
                Expires = DateTime.UtcNow.Add(TokenLifetime)
            };

            return refreshToken;
        }

        private async void SetRefreshToken(RefreshToken newRefreshToken, User _user)
        {
            var cookieOptions = new CookieOptions
            {
                HttpOnly = true,
                Expires = newRefreshToken.Expires,
            };
            Response.Cookies.Append("refreshToken", newRefreshToken.Token, cookieOptions);

            _user.RefreshToken = newRefreshToken.Token;
            _user.TokenCreated = newRefreshToken.Created;
            _user.TokenExpires = newRefreshToken.Expires;

            var result = await UserServiceWithLogging.Update(_user.Id.ToString(), _user);
        }

        private void CreatePasswordHash(string password, out byte[] passwordHash, out byte[] passwordSalt)
        {
            using (var hmac = new HMACSHA512())
            {
                passwordSalt = hmac.Key;
                passwordHash = hmac.ComputeHash(System.Text.Encoding.UTF8.GetBytes(password));
            }
        }

        private bool VerifyPasswordHash(string password, byte[] passwordHash, byte[] passwordSalt)
        {
            using (var hmac = new HMACSHA512(passwordSalt))
            {
                var computeHash = hmac.ComputeHash(System.Text.Encoding.UTF8.GetBytes(password));
                return computeHash.SequenceEqual(passwordHash);
            }
        }

        private string CreateToken(User user)
        {
            List<Claim> claims = new List<Claim>
            {
                new Claim(ClaimTypes.Name, user.UserName),
                new Claim(ClaimTypes.Role, "User")
            };

            var key = new SymmetricSecurityKey(System.Text.Encoding.UTF8.GetBytes(_configuration.GetSection("JwtSettings:Key").Value));

            var cred = new SigningCredentials(key, SecurityAlgorithms.HmacSha512Signature);

            var tokenDescriptor = new SecurityTokenDescriptor
            {
                Subject = new ClaimsIdentity(claims),
                Expires = DateTime.UtcNow.Add(TokenLifetime),
                Issuer = _configuration.GetSection("JwtSettings:Issuer").Value,
                Audience = _configuration.GetSection("JwtSettings:Audience").Value,
                SigningCredentials = cred
            };

            var token = new JwtSecurityTokenHandler().CreateToken(tokenDescriptor);

            var jwt = new JwtSecurityTokenHandler().WriteToken(token);

            return jwt;

        }
    }
}