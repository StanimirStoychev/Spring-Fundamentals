package com.example.mobilelele.domain.beans;

import com.example.mobilelele.domain.dtos.model.UserRoleModel;

import java.util.List;

public class LoggedUser {

    private String id;
    private String username;
    private List<UserRoleModel> roleModels;

    public LoggedUser(){}

    public String getId() {
        return id;
    }

    public LoggedUser setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public LoggedUser setUsername(String username) {
        this.username = username;
        return this;
    }

    public List<UserRoleModel> getRoleModels() {
        return roleModels;
    }

    public LoggedUser setRoleModels(List<UserRoleModel> roleModels) {
        this.roleModels = roleModels;
        return this;
    }
}
