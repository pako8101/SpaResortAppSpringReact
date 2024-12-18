package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "procedure_type")
public class ProcedureTypeEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String description;

    public ProcedureTypeEntity() {
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
