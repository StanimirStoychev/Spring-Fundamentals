package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.user.UserLoginDTO;
import org.softuni.mobilele.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserLoginController {

    private final UserService userService;

    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "auth-login";
    }

    @GetMapping("/logout")
    public String logout() {
        userService.logoutUser();
        return "index";
    }

    @PostMapping("/login")
    public String login(UserLoginDTO userLoginDTO) {
        boolean loginSuccessful = userService.loginUser(userLoginDTO);
        return loginSuccessful ? "index" : "auth-login";
    }
}