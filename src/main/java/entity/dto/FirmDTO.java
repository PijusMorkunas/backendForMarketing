package entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FirmDTO {

    private long Id;
    @NotBlank
    private String companyName;

    private String email;

    private String phone;
    @NotBlank
    private String password;
    @NotBlank
    private String username;

}
