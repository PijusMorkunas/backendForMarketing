package services;

import entity.User;
import entity.dto.UserDTO;
import exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repositories.UserRepository;
import services.mapper.EntityToDtoMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;
    private EntityToDtoMapper entityMapper;
    private PasswordEncoder passwordEncoder;


    public UserService(UserRepository userRepository, EntityToDtoMapper entityMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.entityMapper = entityMapper;
        this.passwordEncoder = passwordEncoder;
    }


//    public List<UserDTO> getAllUsers() {
//        return userRepository.findAll()
//                .stream()
//                .map(user -> entityMapper.convertUserEntityToDTO(user))
//                .collect(Collectors.toList());
//    }

//    public UserDTO getUserById(Long id){
//        return entityMapper.convertUserEntityToDTO(getUserEntityById(id));
//    }




//    public UserDTO addUser(User user){
////        Role role = roleRepository.getOne(2L);
////        user.addRole(role);
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        User savedUser = userRepository.save(user);
//        return entityMapper.convertUserEntityToDTO(savedUser);
//    }

//    @Override
//    public User loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userRepository.findWithRolesByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//    }

    // TODO: get by users name, update user


    public User getUserEntityById(Long id){
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }

//    public UserDTO getUserDtoByUser(User user) {
//        return entityMapper.convertUserEntityToDTO(user);
//    }
}
