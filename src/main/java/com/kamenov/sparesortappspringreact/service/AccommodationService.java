package com.kamenov.sparesortappspringreact.service;

import com.kamenov.sparesortappspringreact.models.entity.AccommodationEntity;

import java.util.List;
import java.util.Optional;

public interface AccommodationService {
    public List<AccommodationEntity> getAllAccommodations() ;

    public Optional<AccommodationEntity> getAccommodationById(Long id) ;

    public AccommodationEntity saveAccommodation(AccommodationEntity accommodation) ;

    public void deleteAccommodation(Long id);
}
