package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "room_booking")
public class RoomBooking extends BaseEntity{

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "accommodation_id")
    private Accommodation accommodation;

    @Column(unique = true, nullable = false)
    private String customerName;

    public RoomBooking() {
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public RoomBooking setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public RoomBooking setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public RoomBooking setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public RoomBooking setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}
