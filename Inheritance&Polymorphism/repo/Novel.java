package com.citb408.repo;

public class Novel extends Book {
    private String novelAbstract;

    public Novel(double fileSize, String format, String title, Author author, String isbnCode, String novelAbstract) {
        super(fileSize, format, title, author, isbnCode);
        this.novelAbstract = novelAbstract;
    }

    public String getNovelAbstract() {
        return novelAbstract;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Novel{" +
                "novelAbstract='" + novelAbstract + '\'' +
                '}';
    }
}
