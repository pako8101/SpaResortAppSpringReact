package com.kamenov.sparesortappspringreact.models.view;

public class ServiceViewModel {
    private String name;
    private String description;
    private SpecialOfferView specialOffer;

    public ServiceViewModel() {
    }

    public String getName() {
        return name;
    }

    public ServiceViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ServiceViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public SpecialOfferView getSpecialOffer() {
        return specialOffer;
    }

    public ServiceViewModel setSpecialOffer(SpecialOfferView specialOffer) {
        this.specialOffer = specialOffer;
        return this;
    }
}
