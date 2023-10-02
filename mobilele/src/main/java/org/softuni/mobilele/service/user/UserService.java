package org.softuni.mobilele.service.user;

import org.softuni.mobilele.model.dto.user.UserLoginDTO;
import org.softuni.mobilele.model.dto.user.UserRegistrationDTO;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistrationDTO);

    boolean loginUser(UserLoginDTO userLoginDTO);

    void logoutUser();
}
