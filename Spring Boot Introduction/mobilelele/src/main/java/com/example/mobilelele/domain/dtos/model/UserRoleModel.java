package com.example.mobilelele.domain.dtos.model;

public class UserRoleModel extends BaseEntityDto {

    private String id;

    private String role;

    public UserRoleModel(){}

    @Override
    public String getId() {
        return id;
    }

    @Override
    public UserRoleModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getRole() {
        return role;
    }

    public UserRoleModel setRole(String role) {
        this.role = role;
        return this;
    }
}
