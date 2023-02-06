package com.example.mobilelele.domain.dtos.model;

import java.time.LocalDateTime;

public class BrandDto extends BaseEntityDto{

    private String name;

    private LocalDateTime created;

    private LocalDateTime modified;

    public String getName() {
        return name;
    }

    public BrandDto setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public BrandDto setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public BrandDto setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
