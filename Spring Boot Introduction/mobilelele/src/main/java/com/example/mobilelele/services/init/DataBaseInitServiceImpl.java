package com.example.mobilelele.services.init;

import com.example.mobilelele.services.role.UserRoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class DataBaseInitServiceImpl implements DataBaseInitService {

    private final UserRoleService roleService;

    @Autowired
    public DataBaseInitServiceImpl(UserRoleService roleService) {
        this.roleService = roleService;
    }

    @PostConstruct
    public void postConstruct(){
        dbInit();
    }

    @Override
    public void dbInit() {
        if(isDbInit()) {
            this.roleService.dbInit();
        }
    }

    @Override
    public boolean isDbInit() {
        return this.roleService.isDbInit();
    }
}
