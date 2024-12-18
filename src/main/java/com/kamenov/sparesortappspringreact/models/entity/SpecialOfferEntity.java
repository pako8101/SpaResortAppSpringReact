package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "special_offer")
public class SpecialOfferEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private BigDecimal discount;

     @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime endDate;

    @OneToOne
    @JoinColumn(name = "service_id")
    private ServiceEntity serviceEntity;

    public SpecialOfferEntity() {
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public SpecialOfferEntity setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public SpecialOfferEntity setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public SpecialOfferEntity setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public ServiceEntity getService() {
        return serviceEntity;
    }

    public SpecialOfferEntity setService(ServiceEntity serviceEntity) {
        this.serviceEntity = serviceEntity;
        return this;
    }
}
