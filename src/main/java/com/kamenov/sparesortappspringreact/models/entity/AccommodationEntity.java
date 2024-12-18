package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "accommodation")
public class AccommodationEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private int capacity;

    @Column(unique = true, nullable = false)
    private String name;

    public AccommodationEntity() {
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
