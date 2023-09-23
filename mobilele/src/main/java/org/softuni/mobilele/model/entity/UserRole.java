package org.softuni.mobilele.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.softuni.mobilele.model.entity.enums.Role;

@Entity
@Table(name = "roles")
public class UserRole extends BaseEntity {

    private Role name;

    public UserRole() {}

    public Role getName() {
        return name;
    }

    public void setName(Role name) {
        this.name = name;
    }
}
