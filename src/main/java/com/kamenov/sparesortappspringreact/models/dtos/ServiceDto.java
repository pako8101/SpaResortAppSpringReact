package com.kamenov.sparesortappspringreact.models.dtos;

public class ServiceDto {
    private Long id;
    private String name;
    private String description;
    private SpecialOfferDto specialOffer;

    public ServiceDto() {
    }

    public Long getId() {
        return id;
    }

    public ServiceDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ServiceDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ServiceDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public SpecialOfferDto getSpecialOffer() {
        return specialOffer;
    }

    public ServiceDto setSpecialOffer(SpecialOfferDto specialOffer) {
        this.specialOffer = specialOffer;
        return this;
    }
}
