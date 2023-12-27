using Microsoft.AspNetCore.Authentication;
using Microsoft.Extensions.Options;
using Microsoft.IdentityModel.Tokens;
using System.IdentityModel.Tokens.Jwt;
using System.Security.Claims;
using System.Text.Encodings.Web;

namespace FactoryWatcher.Authentication
{
    public class CustomJwtAuthenticationOptions : AuthenticationSchemeOptions
    {
        public Action<TokenValidationParameters> TokenValidationParametersConfigurer { get; set; }

        public CustomJwtAuthenticationOptions ConfigureTokenValidationParameters(Action<TokenValidationParameters> configure)
        {
            TokenValidationParametersConfigurer = configure;
            return this;
        }
    }

    public class CustomJwtAuthenticationHandler : AuthenticationHandler<CustomJwtAuthenticationOptions>
    {
        private readonly ILogger<CustomJwtAuthenticationHandler> _logger;

        public CustomJwtAuthenticationHandler(IOptionsMonitor<CustomJwtAuthenticationOptions> options, ILoggerFactory logger, UrlEncoder encoder, ISystemClock clock)
            : base(options, logger, encoder, clock)
        {
            _logger = logger.CreateLogger<CustomJwtAuthenticationHandler>();
        }

        protected override async Task<AuthenticateResult> HandleAuthenticateAsync()
        {
            // Implement your custom JWT authentication logic here
            var token = Request.Headers["Authorization"].ToString().Replace("Bearer ", string.Empty);

            if (string.IsNullOrEmpty(token))
            {
                // Token is missing, authentication fails
                return AuthenticateResult.Fail("Token is missing");
            }

            try
            {
                var handler = new JwtSecurityTokenHandler();
                var jsonToken = handler.ReadToken(token) as JwtSecurityToken;

                if (jsonToken == null)
                {
                    // Token is invalid, authentication fails
                    return AuthenticateResult.Fail("Token is invalid");
                }

                // If authentication succeeds, create a ClaimsPrincipal and set it in the context
                var claimsIdentity = new ClaimsIdentity(jsonToken.Claims, Scheme.Name, ClaimsIdentity.DefaultNameClaimType, ClaimsIdentity.DefaultRoleClaimType);
                var principal = new ClaimsPrincipal(claimsIdentity);

                var ticket = new AuthenticationTicket(principal, Scheme.Name);
                return AuthenticateResult.Success(ticket);
            }
            catch (Exception ex)
            {
                // Log any exception during token validation
                _logger.LogError($"Error validating token: {ex.Message}");
                return AuthenticateResult.Fail("Token is invalid");
            }
        }

        protected override Task HandleChallengeAsync(AuthenticationProperties properties)
        {
            // Implement your custom challenge logic here
            Context.Response.Redirect("/auth/login");
            // Example: Log the challenge
            _logger.LogWarning("Custom JWT authentication challenge");

            // Call the base method to perform the default challenge behavior
            return base.HandleChallengeAsync(properties);
        }
    }
}
