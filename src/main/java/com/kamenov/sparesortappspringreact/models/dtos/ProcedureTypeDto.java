package com.kamenov.sparesortappspringreact.models.dtos;

public class ProcedureTypeDto {
    private Long id;
    private String name;
    private String description;

    public ProcedureTypeDto() {
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
