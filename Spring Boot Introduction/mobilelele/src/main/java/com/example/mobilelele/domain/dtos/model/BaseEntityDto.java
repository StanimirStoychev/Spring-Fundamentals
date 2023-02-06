package com.example.mobilelele.domain.dtos.model;

public class BaseEntityDto {

    private String id;

    public BaseEntityDto(){}

    public String getId() {
        return id;
    }

    public BaseEntityDto setId(String id) {
        this.id = id;
        return this;
    }
}
