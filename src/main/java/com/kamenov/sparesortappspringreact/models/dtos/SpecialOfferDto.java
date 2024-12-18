package com.kamenov.sparesortappspringreact.models.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SpecialOfferDto {
    private Long id;
    private BigDecimal discount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public SpecialOfferDto() {
    }

    public Long getId() {
        return id;
    }

    public SpecialOfferDto setId(Long id) {
        this.id = id;
        return this;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public SpecialOfferDto setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public SpecialOfferDto setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public SpecialOfferDto setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
}
