package com.example.mobilelele.domain.entities;

import com.example.mobilelele.domain.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class UserRole extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private Role role;

    public Role getRole() {
        return role;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }
}
