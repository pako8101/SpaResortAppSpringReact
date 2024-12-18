package com.kamenov.sparesortappspringreact.repository;

import com.kamenov.sparesortappspringreact.models.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity,Long> {
}
