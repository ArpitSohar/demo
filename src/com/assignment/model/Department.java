package com.assignment.model;

/*
* Can be HR, TECH DELIVERY, SALES, etc*/
public class Department {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public Department setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Department setName(String name) {
        this.name = name;
        return this;
    }
}
