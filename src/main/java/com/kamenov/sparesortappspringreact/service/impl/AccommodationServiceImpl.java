package com.kamenov.sparesortappspringreact.service.impl;

import com.kamenov.sparesortappspringreact.models.entity.AccommodationEntity;
import com.kamenov.sparesortappspringreact.repository.AccommodationRepository;
import com.kamenov.sparesortappspringreact.service.AccommodationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AccommodationServiceImpl implements AccommodationService {
    private final AccommodationRepository repository;

    public AccommodationServiceImpl(AccommodationRepository repository) {
        this.repository = repository;
    }
@Override
    public List<AccommodationEntity> getAllAccommodations() {
        return repository.findAll();
    }
@Override
    public Optional<AccommodationEntity> getAccommodationById(Long id) {
        return repository.findById(id);
    }
@Override
    public AccommodationEntity saveAccommodation(AccommodationEntity accommodation) {
        return repository.save(accommodation);
    }
@Override
    public void deleteAccommodation(Long id) {
        repository.deleteById(id);
    }
}
