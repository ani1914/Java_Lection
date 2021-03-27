package com.citb408.repo;

public class Newspaper extends Document {
    private int numberOfArticles;

    public Newspaper(double fileSize, String format, String title, int numberOfArticles) {
        super(fileSize, format, title);
        this.numberOfArticles = numberOfArticles;
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Newspaper{" +
                "numberOfArticles=" + numberOfArticles +
                '}';
    }
}
