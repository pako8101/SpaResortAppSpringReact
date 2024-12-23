package com.kamenov.sparesortappspringreact.service.impl;

import com.kamenov.sparesortappspringreact.models.entity.ServiceEntity;
import com.kamenov.sparesortappspringreact.repository.ServiceRepository;
import com.kamenov.sparesortappspringreact.service.ServiceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceServiceImpl implements ServiceService {
    private final ServiceRepository repository;

    public ServiceServiceImpl(ServiceRepository repository) {
        this.repository = repository;
    }
@Override
    public List<ServiceEntity> getAllServices() {
        return repository.findAll();
    }
@Override
    public Optional<ServiceEntity> getServiceById(Long id) {
        return repository.findById(id);
    }
@Override
    public ServiceEntity saveService(ServiceEntity service) {
        return repository.save(service);
    }
@Override
    public void deleteService(Long id) {
        repository.deleteById(id);
    }
}
