package com.kamenov.sparesortappspringreact.models.dtos;

public class AccommodationDto {
    private Long id;
    private String name;
    private int capacity;

    public AccommodationDto() {
    }

    public Long getId() {
        return id;
    }

    public AccommodationDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AccommodationDto setName(String name) {
        this.name = name;
        return this;
    }

    public int getCapacity() {
        return capacity;
    }

    public AccommodationDto setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }
}
