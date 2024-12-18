package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "special_offer")
public class SpecialOffer extends BaseEntity {

    @Column(unique = true, nullable = false)
    private BigDecimal discount;

     @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime endDate;

    @OneToOne
    @JoinColumn(name = "service_id")
    private Service service;

    public SpecialOffer() {
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public SpecialOffer setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public SpecialOffer setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public SpecialOffer setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public Service getService() {
        return service;
    }

    public SpecialOffer setService(Service service) {
        this.service = service;
        return this;
    }
}
