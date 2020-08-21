package com.assignment.model;

public class JobInfo {
    private Competency competency;
    private BusinessUnit businessUnit;
    private Employee employee;

    public Competency getCompetency() {
        return competency;
    }

    public JobInfo setCompetency(Competency competency) {
        this.competency = competency;
        return this;
    }

    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    public JobInfo setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public JobInfo setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }
}
