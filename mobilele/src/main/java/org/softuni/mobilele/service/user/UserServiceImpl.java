package org.softuni.mobilele.service.user;

import org.softuni.mobilele.model.dto.user.UserLoginDTO;
import org.softuni.mobilele.model.dto.user.UserRegistrationDTO;
import org.softuni.mobilele.model.entity.User;
import org.softuni.mobilele.repository.UserRepository;
import org.softuni.mobilele.util.CurrentUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.currentUser = currentUser;
    }

    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {
        userRepository.save(map(userRegistrationDTO));
    }

    @Override
    public boolean loginUser(UserLoginDTO userLoginDTO) {
        var userEntity = userRepository.findByEmail(userLoginDTO.email()).orElse(null);

        boolean loginSuccess = false;

        if (userEntity != null) {

            String rawPassword = userLoginDTO.password();
            String encodedPassword = userEntity.getPassword();

            loginSuccess = encodedPassword != null &&
                    passwordEncoder.matches(rawPassword, encodedPassword);

            if (loginSuccess) {
                currentUser
                        .setLogged(true)
                        .setFirstName(userEntity.getFirstName())
                        .setLastName(userEntity.getLastName());
            } else {
                currentUser.logout();
            }
        }
        return loginSuccess;
    }

    @Override
    public void logoutUser() {
        currentUser.logout();
    }

    private User map(UserRegistrationDTO userRegistrationDTO) {
        return new User()
                .setActive(true)
                .setFirstName(userRegistrationDTO.firstName())
                .setLastName(userRegistrationDTO.lastName())
                .setEmail(userRegistrationDTO.email())
                .setPassword(passwordEncoder.encode(userRegistrationDTO.password()));
    }


}
