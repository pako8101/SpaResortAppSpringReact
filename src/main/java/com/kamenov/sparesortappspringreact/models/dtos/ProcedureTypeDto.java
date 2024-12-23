package com.kamenov.sparesortappspringreact.models.dtos;

import com.kamenov.sparesortappspringreact.models.enums.ProcedureEnumType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProcedureTypeDto {
    private Long id;
    @Size(min = 2,max = 30, message = "Procedure name must be between 3 and 30 characters")
    @NotNull
    private String name;
    @Size(min = 3,max = 100, message = "Description must be between 3 and 100 characters")
    @NotNull
    private String description;
    @NotNull(message = "You have to choose from which procedure you prefer!")
    private ProcedureEnumType procedureType;

    public ProcedureTypeDto() {
    }

    public @NotNull(message = "You have to choose from which procedure you prefer!") ProcedureEnumType getProcedureType() {
        return procedureType;
    }

    public ProcedureTypeDto setProcedureType(@NotNull(message = "You have to choose from which procedure you prefer!") ProcedureEnumType procedureType) {
        this.procedureType = procedureType;
        return this;
    }

    public Long getId() {
        return id;
    }

    public ProcedureTypeDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProcedureTypeDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProcedureTypeDto setDescription(String description) {
        this.description = description;
        return this;
    }
}
