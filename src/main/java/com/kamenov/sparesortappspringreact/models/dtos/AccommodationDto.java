package com.kamenov.sparesortappspringreact.models.dtos;

import jakarta.validation.constraints.*;

public class AccommodationDto {
    private Long id;
    @Size(min = 2,max = 30, message = "Accommodation name must be between 3 and 30 characters")
    @NotNull
    private String name;
    @Min(value = 1,message = "Over 1 person! ")
    @Max(8)
    @NotNull
    @Positive
    private int capacity;
    @Min(value = 35,message = "Over 35 Euros! ")
    @Max(890)
    @NotNull
    @Positive
    private double pricePerNight;
    public AccommodationDto() {
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public AccommodationDto setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
        return this;
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
