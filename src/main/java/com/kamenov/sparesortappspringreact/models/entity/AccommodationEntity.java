package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "accommodation")
public class AccommodationEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private int capacity;

    @Column(unique = true, nullable = false)
    private String name;
    @NotNull
    @Column(unique = true, nullable = false,name = "price_per_night")
    private double pricePerNight;

    public AccommodationEntity() {
    }

    public AccommodationEntity setPricePerNight(@NotNull double pricePerNight) {
        this.pricePerNight = pricePerNight;
        return this;
    }

    @NotNull
    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getCapacity() {
        return capacity;
    }

    public AccommodationEntity setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getName() {
        return name;
    }

    public AccommodationEntity setName(String name) {
        this.name = name;
        return this;
    }
}
