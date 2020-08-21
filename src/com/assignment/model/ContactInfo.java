package com.assignment.model;

public class ContactInfo {
    private Long id;
    private String primaryMobileNumber;
    private String email;
    private String alternateMobileNumber;

    public Long getId() {
        return id;
    }

    public ContactInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public ContactInfo setPrimaryMobileNumber(String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAlternateMobileNumber() {
        return alternateMobileNumber;
    }

    public ContactInfo setAlternateMobileNumber(String alternateMobileNumber) {
        this.alternateMobileNumber = alternateMobileNumber;
        return this;
    }
}
