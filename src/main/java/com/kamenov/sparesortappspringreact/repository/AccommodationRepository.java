package com.kamenov.sparesortappspringreact.repository;

import com.kamenov.sparesortappspringreact.models.entity.AccommodationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRepository extends JpaRepository<AccommodationEntity,Long> {
}
