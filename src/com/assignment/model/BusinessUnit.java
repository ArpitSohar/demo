package com.assignment.model;

public class BusinessUnit {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public BusinessUnit setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BusinessUnit setName(String name) {
        this.name = name;
        return this;
    }
}
