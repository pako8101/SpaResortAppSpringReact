package com.kamenov.sparesortappspringreact.repository;

import com.kamenov.sparesortappspringreact.models.entity.ProcedureTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedureTypeRepository extends JpaRepository<ProcedureTypeEntity,Long> {
}
