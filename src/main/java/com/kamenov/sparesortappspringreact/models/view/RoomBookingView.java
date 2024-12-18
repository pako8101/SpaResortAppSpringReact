package com.kamenov.sparesortappspringreact.models.view;

import com.kamenov.sparesortappspringreact.models.dtos.AccommodationDto;

import java.time.LocalDateTime;

public class RoomBookingView {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private AccommodationDto accommodation;
    private String customerName;

    public RoomBookingView() {
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public RoomBookingView setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public RoomBookingView setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public AccommodationDto getAccommodation() {
        return accommodation;
    }

    public RoomBookingView setAccommodation(AccommodationDto accommodation) {
        this.accommodation = accommodation;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public RoomBookingView setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}
