package entity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class AdvertDTO {

    private Long id;
    @NotBlank
    private String name;

//    //<----CATEGORY ENTITY---->//Todo--???
//    //**@ManyToMany in Entity**
//    private Set<String> categoryDto;

}
