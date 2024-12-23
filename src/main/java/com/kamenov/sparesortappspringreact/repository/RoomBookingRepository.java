package com.kamenov.sparesortappspringreact.repository;

import com.kamenov.sparesortappspringreact.models.entity.RoomBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomBookingRepository extends JpaRepository<RoomBookingEntity,Long> {
}
