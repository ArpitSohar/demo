package com.assignment.model;

public class EmployeeDocumentInfo {
    private Employee employee;
    private Document document;
    private DocumentType documentType;

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeDocumentInfo setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public Document getDocument() {
        return document;
    }

    public EmployeeDocumentInfo setDocument(Document document) {
        this.document = document;
        return this;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public EmployeeDocumentInfo setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
        return this;
    }
}
