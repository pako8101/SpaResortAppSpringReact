package com.kamenov.sparesortappspringreact.models.entity;

import com.kamenov.sparesortappspringreact.models.enums.ProcedureEnumType;
import jakarta.persistence.*;

@Entity
@Table(name = "procedure_type")
public class ProcedureTypeEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String description;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ProcedureEnumType procedureType;

    public ProcedureTypeEntity() {
    }

    public ProcedureEnumType getProcedureType() {
        return procedureType;
    }

    public ProcedureTypeEntity setProcedureType(ProcedureEnumType procedureType) {
        this.procedureType = procedureType;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProcedureTypeEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProcedureTypeEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}
