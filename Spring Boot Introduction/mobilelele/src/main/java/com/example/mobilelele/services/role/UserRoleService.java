package com.example.mobilelele.services.role;

import com.example.mobilelele.domain.dtos.model.UserRoleModel;
import com.example.mobilelele.domain.dtos.view.UserRoleViewDto;
import com.example.mobilelele.services.init.DataBaseInitService;

import java.util.List;

public interface UserRoleService {
    List<UserRoleViewDto> getAll();

    List<UserRoleModel> findAllRoles();

    UserRoleModel findRoleByName(String name);
}
