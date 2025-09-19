package org.code.java8.flatmap;

import java.util.List;

public class Person {

    String name;
    List<String> phones;
    List<String> books;
    List<String> skills;

    Person(String name, List<String> phones, List<String> books, List<String> skills) {
        this.name = name;
        this.phones = phones;
        this.books = books;
        this.skills = skills;
    }

    public List<String> getPhones() { return phones; }
    public List<String> getBooks() { return books; }
    public List<String> getSkills() { return skills; }


}
