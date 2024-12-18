package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.*;

@Entity
public class ServiceEntity extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String name;
@Column(nullable = false,columnDefinition = "TEXT")
    private String description;

    @OneToOne(mappedBy = "service",
            cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    private SpecialOfferEntity specialOfferEntity;

    public ServiceEntity() {
    }

    public String getName() {
        return name;
    }

    public ServiceEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ServiceEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public SpecialOfferEntity getSpecialOffer() {
        return specialOfferEntity;
    }

    public ServiceEntity setSpecialOffer(SpecialOfferEntity specialOfferEntity) {
        this.specialOfferEntity = specialOfferEntity;
        return this;
    }
}
