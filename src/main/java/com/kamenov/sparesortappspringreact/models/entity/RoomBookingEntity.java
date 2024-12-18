package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "room_booking")
public class RoomBookingEntity extends BaseEntity{

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "accommodation_id")
    private AccommodationEntity accommodationEntity;

    @Column(unique = true, nullable = false)
    private String customerName;

    public RoomBookingEntity() {
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public RoomBookingEntity setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public RoomBookingEntity setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public AccommodationEntity getAccommodation() {
        return accommodationEntity;
    }

    public RoomBookingEntity setAccommodation(AccommodationEntity accommodationEntity) {
        this.accommodationEntity = accommodationEntity;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public RoomBookingEntity setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}
