package com.citb408;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Author {
    private final long id;
    private String name;
    private LocalDate birthday;

    public Author() {
        this.id = 9;
    }

    public Author(long id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public long age() {
        return ChronoUnit.YEARS.between(this.birthday,LocalDate.now());
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
