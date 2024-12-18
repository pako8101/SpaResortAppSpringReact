package com.kamenov.sparesortappspringreact.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "procedure_type")
public class ProcedureType extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String description;

    public ProcedureType() {
    }

    public String getName() {
        return name;
    }

    public ProcedureType setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProcedureType setDescription(String description) {
        this.description = description;
        return this;
    }
}
