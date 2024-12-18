package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.*;

@Entity
public class Service extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String name;
@Column(nullable = false,columnDefinition = "TEXT")
    private String description;

    @OneToOne(mappedBy = "service",
            cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    private SpecialOffer specialOffer;

    public Service() {
    }

    public String getName() {
        return name;
    }

    public Service setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Service setDescription(String description) {
        this.description = description;
        return this;
    }

    public SpecialOffer getSpecialOffer() {
        return specialOffer;
    }

    public Service setSpecialOffer(SpecialOffer specialOffer) {
        this.specialOffer = specialOffer;
        return this;
    }
}
