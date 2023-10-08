package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.dto.user.UserLoginDTO;
import bg.softuni.pathfinder.model.dto.user.UserRegisterDTO;
import bg.softuni.pathfinder.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @PostMapping("/login")
    public ModelAndView login(UserLoginDTO userLoginDTO) {
        boolean isLogged = userService.login(userLoginDTO);

        if (!isLogged) {
            return new ModelAndView("login");
        }
        return new ModelAndView("redirect:/");
    }

    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("register");
    }

    @PostMapping("/register")
    public ModelAndView register(UserRegisterDTO userRegisterDTO) {

        this.userService.register(userRegisterDTO);

        return new ModelAndView("redirect:login");
    }
}
