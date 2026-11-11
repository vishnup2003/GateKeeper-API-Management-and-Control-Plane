package in.vishnu.gatekeeper.management.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class LoginResponse {
    private String token;
    private String tokenType;
    private Long expireInSeconds;
    private String role;
    private Long organisationId;
}
