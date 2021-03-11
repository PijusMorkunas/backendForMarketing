package services.mapper;

import entity.*;
import entity.dto.*;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class DtoToEntityMapper {

    /**
     * Converts from Category DTO to Category entity
     */
    public Category convertCategoryDTO(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setCategoryName(categoryDTO.getCategoryName());
        return category;
    }

    /**
     * Converts from Firm DTO to Firm entity
     */
    public Firm convertFirmDtoToEntity(FirmDTO firmDTO) {
        Firm firm = new Firm();
        firm.setCompanyName(firmDTO.getCompanyName());
        firm.setEmail(firmDTO.getEmail());
        firm.setPhone(firmDTO.getPhone());
        return firm;
    }

    /**
     * Converts from User DTO to User entity
     */
    public User convertUserDtoToEntity(UserDTO userDTO) {
        User user = new User();
        user.setPhone(userDTO.getPhone());
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
        return user;
    }

    /**
     * Converts from Application DTO to Application entity
     */
    public Credentials convertCredentialsDtoToEntity(CredentialsDTO credentialsDTO) {
        Credentials credentials = new Credentials();
        credentials.setUsername(credentialsDTO.getUsername());
        credentials.setPassword(credentialsDTO.getPassword());
        credentials.setActive(credentials.getActive());
        credentials.setAccType(credentialsDTO.getAccType());
        return credentials;
    }
    /**
     * Converts from Advert DTO to Advert entity
     */
    public Advert convertAdvertDtoToEntity(AdvertDTO advertDTO) {
        Advert advert = new Advert();
        advert.setName(advertDTO.getName());
        return advert;
    }
}
