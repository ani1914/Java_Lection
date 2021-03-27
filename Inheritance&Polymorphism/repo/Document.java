package com.citb408.repo;

public class Document {
    private double fileSize;
    private String format;
    private String title;

    public Document() {
    }

    public Document(double fileSize, String format, String title) {
        this.fileSize = fileSize;
        this.format = format;
        this.title = title;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "fileSize=" + fileSize +
                ", format='" + format + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
