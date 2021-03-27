package com.citb408.repo;

public class Book extends Document {

    private Author author;
    private String isbnCode;

    public Book() {
    }

    public Book(double fileSize, String format, String title, Author author, String isbnCode) {
        super(fileSize, format, title);
        this.author = author;
        this.isbnCode = isbnCode;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString()
                +
                "Book{author=" + author +
                ", isbnCode='" + isbnCode + '\'' +
                '}';
    }
}
