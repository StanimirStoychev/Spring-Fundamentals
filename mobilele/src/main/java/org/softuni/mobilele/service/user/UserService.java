package org.softuni.mobilele.service.user;

import org.softuni.mobilele.model.dto.user.UserRegistrationDTO;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistrationDTO);
}
