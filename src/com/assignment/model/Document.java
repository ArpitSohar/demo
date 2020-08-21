package com.assignment.model;

public class Document {
    private Long id;
    private String fileName;
    private String fileExtension;
    private String path;

    public Long getId() {
        return id;
    }

    public Document setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public Document setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public Document setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }

    public String getPath() {
        return path;
    }

    public Document setPath(String path) {
        this.path = path;
        return this;
    }
}
