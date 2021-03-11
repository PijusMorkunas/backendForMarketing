package services.mapper;

import entity.*;
import entity.dto.*;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class EntityToDtoMapper {

    /**
     * Converts from Category DTO to Category entity
     */
    public CategoryDTO convertCategoryToDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategoryName(category.getCategoryName());
        return categoryDTO;
    }

    /**
     * Converts from Firm DTO to Firm entity
     */
    public FirmDTO convertDTOToFirm(Firm firm) {
        FirmDTO firmDTO = new FirmDTO();
        firmDTO.setCompanyName(firm.getCompanyName());
        firmDTO.setEmail(firm.getEmail());
        firmDTO.setPhone(firm.getPhone());
        return firmDTO;
    }

    /**
     * Converts from User DTO to User entity
     */
    public UserDTO convertDTOToUser(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setPhone(user.getPhone());
        userDTO.setAddress(user.getAddress());
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setSurname(user.getSurname());
        return userDTO;
    }

    /**
     * Converts from Credentials DTO to Credentials entity
     */
    public CredentialsDTO convertCredentialsDtoToEntity(Credentials credentials) {
        CredentialsDTO credentialsDTO = new CredentialsDTO();
        credentialsDTO.setUsername(credentials.getUsername());
        credentialsDTO.setPassword(credentials.getPassword());
        credentialsDTO.setActive(credentials.getActive());
        credentialsDTO.setAccType(credentials.getAccType());
        return credentialsDTO;
    }
    /**
     * Converts from Advert DTO to Advert entity
     */
    public AdvertDTO convertAdvertDtoToEntity(Advert advert) {
        AdvertDTO advertDTO = new AdvertDTO();
        advertDTO.setName(advert.getName());
        return advertDTO;
    }

//    public PostDTO convertPostEntityToDTO(Post post) {
//        return convertPostEntityToDTO(post, post.getCompany().getId());
//    }
}
