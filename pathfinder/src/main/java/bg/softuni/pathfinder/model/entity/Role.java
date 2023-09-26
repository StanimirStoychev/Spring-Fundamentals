package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.entity.enums.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    public Role() {}

    public UserRole getRole() {
        return role;
    }

    public Role setRole(UserRole role) {
        this.role = role;
        return this;
    }
}
