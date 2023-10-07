package bg.softuni.pathfinder.service.user;

import bg.softuni.pathfinder.model.dto.user.UserRegisterDTO;
import bg.softuni.pathfinder.model.entity.User;

import java.util.List;

public interface UserService {

   void register(UserRegisterDTO userRegisterDTO);
}
