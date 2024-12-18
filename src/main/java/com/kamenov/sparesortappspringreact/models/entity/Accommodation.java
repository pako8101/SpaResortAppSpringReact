package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "accommodation")
public class Accommodation extends BaseEntity {

    @Column(unique = true, nullable = false)
    private int capacity;

    @Column(unique = true, nullable = false)
    private String name;

    public Accommodation() {
    }

    public int getCapacity() {
        return capacity;
    }

    public Accommodation setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getName() {
        return name;
    }

    public Accommodation setName(String name) {
        this.name = name;
        return this;
    }
}
