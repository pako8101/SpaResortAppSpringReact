package com.kamenov.sparesortappspringreact.models.view;

public class AccommodationView {

    private String name;
    private int capacity;

    public AccommodationView() {
    }

    public String getName() {
        return name;
    }

    public AccommodationView setName(String name) {
        this.name = name;
        return this;
    }

    public int getCapacity() {
        return capacity;
    }

    public AccommodationView setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }
}
