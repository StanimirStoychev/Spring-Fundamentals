package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.entity.enums.Categories;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

    @Column(nullable = false)
    private Categories name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Category() {}

    public Categories getName() {
        return name;
    }

    public Category setName(Categories name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }
}
