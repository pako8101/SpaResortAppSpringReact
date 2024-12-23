package com.kamenov.sparesortappspringreact.service;

import com.kamenov.sparesortappspringreact.models.entity.ServiceEntity;
import com.kamenov.sparesortappspringreact.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ServiceService {


    public List<ServiceEntity> getAllServices();

    public Optional<ServiceEntity> getServiceById(Long id);

    public ServiceEntity saveService(ServiceEntity service);

    public void deleteService(Long id);
}