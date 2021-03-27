package com.citb408;

import java.math.BigDecimal;

public class Video {
    private String name;
    private BigDecimal duration;
    private int likes;
    private Author author;
    private static BigDecimal maxDuration;

    public Video(String name, BigDecimal duration, int likes) {
        this.name = name;
        this.duration = duration;
        this.likes = likes;
    }

    public Video(String name, BigDecimal duration, int likes, Author author) {
        this.name = name;
        this.duration = duration;
        this.likes = likes;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public static BigDecimal getMaxDuration() {
        return maxDuration;
    }

    public static void setMaxDuration(BigDecimal maxDuration) {
        Video.maxDuration = maxDuration;
    }

    public static void increaseMaxDuration(BigDecimal maxDuration) {
        Video.maxDuration.add(maxDuration);
    }

    public boolean isWithMoreLikes(Video video) {
        return this.likes > video.likes;
    }

    public Video videoWithMoreLikes(Video video) {
        if (this.likes > video.likes) {
            return this;
        }
        return video;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", likes=" + likes +
                ", author=" + author +
                '}';
    }
}
