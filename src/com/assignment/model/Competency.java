package com.assignment.model;

public class Competency {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public Competency setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Competency setName(String name) {
        this.name = name;
        return this;
    }
}
