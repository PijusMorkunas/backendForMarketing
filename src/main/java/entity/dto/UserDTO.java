package entity.dto;

import entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
public class UserDTO {

    private Long id;
    @Email
    private String email;

    private String phone;

    private String address;

    private String name;

    private String surname;

    public UserDTO(User user) {
        this.id = user.getId();

        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.phone = user.getPhone();
//        this.roles = client.getRoles().stream()
//                .map(client::getRoleName)
//                .collect(Collectors.toSet());
    }
}
