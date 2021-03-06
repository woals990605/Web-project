package site.metacoding.web.dto.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data // Getter, Setter, toString
public class PasswordResetReqDto {

    @Size(min = 4, max = 20)
    @NotBlank
    private String id;

    @Size(min = 4, max = 30)
    @Email
    @NotBlank
    private String email;
}