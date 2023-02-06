package com.example.mobilelele.domain.dtos.model;

import java.time.LocalDateTime;
import java.util.List;

public class UserModel extends BaseEntityDto{

    private String id; // –  username of the user.
    private String username; // –  username of the user.
    private String password; //– password of the user.
    private String firstName; //–  first name of the user.
    private String lastName; //–  last name of the user.
    private Boolean isActive; //– true OR false.
    private List<UserRoleModel> role; //–  user's role (User or Admin).
    private String imageUrl;//– a url of user's picture.
    private LocalDateTime created; // a date and time.
    private LocalDateTime modified;//– a date and time.

    @Override
    public String getId() {
        return id;
    }

    @Override
    public UserModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public UserModel setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public List<UserRoleModel> getRole() {
        return role;
    }

    public UserModel setRole(List<UserRoleModel> role) {
        this.role = role;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public UserModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public UserModel setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public UserModel setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
