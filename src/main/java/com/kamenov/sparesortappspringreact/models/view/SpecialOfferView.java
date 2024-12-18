package com.kamenov.sparesortappspringreact.models.view;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SpecialOfferView {

    private BigDecimal discount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public SpecialOfferView() {
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public SpecialOfferView setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public SpecialOfferView setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public SpecialOfferView setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
}
