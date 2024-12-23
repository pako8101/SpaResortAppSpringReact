package com.kamenov.sparesortappspringreact.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class RoomBookingDto {
    private Long id;
    @NotNull
    private LocalDateTime startDate;
    @NotNull
    private LocalDateTime endDate;
    @NotNull
    private AccommodationDto accommodation;
    @Size(min = 2,max = 30, message = "Customer name must be between 3 and 30 characters")
    @NotNull
    private String customerName;

    public RoomBookingDto() {
    }

    public Long getId() {
        return id;
    }

    public RoomBookingDto setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public RoomBookingDto setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public RoomBookingDto setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public AccommodationDto getAccommodation() {
        return accommodation;
    }

    public RoomBookingDto setAccommodation(AccommodationDto accommodation) {
        this.accommodation = accommodation;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public RoomBookingDto setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}
