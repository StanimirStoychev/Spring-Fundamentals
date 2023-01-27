package com.example.mobilelele.domain.entities;

import com.example.mobilelele.domain.enums.Category;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    private String ImageUrl;

    @Column
    private Integer startYear;

    @Column
    private Integer endYear;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime modified;

    @ManyToOne
    private Brand brand;

    public String getName() {
        return name;
    }

    public Model setName(String name) {
        this.name = name;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Model setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public Model setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
        return this;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public Model setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public Model setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Model setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public Model setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }
}
