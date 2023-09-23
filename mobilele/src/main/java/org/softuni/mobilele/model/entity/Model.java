package org.softuni.mobilele.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.softuni.mobilele.model.entity.enums.Category;

import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    private String name;

    private Category category;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "start_year")
    private short startYear;

    @Column(name = "end_year")
    private short endYear;

    private LocalDateTime created;

    private LocalDateTime modified;

    @ManyToOne
    private Brand brand;

    public Model() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public short getStartYear() {
        return startYear;
    }

    public void setStartYear(short startYear) {
        this.startYear = startYear;
    }

    public short getEndYear() {
        return endYear;
    }

    public void setEndYear(short endYear) {
        this.endYear = endYear;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
