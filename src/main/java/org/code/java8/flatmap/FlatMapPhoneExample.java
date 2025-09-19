package org.code.java8.flatmap;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapPhoneExample {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Elamaran",
                        List.of("1234", "5678"),
                        List.of("Clean Code", "Effective Java"),
                        List.of("Java", "Spring", "Docker")),
                new Person("Arun",
                        List.of("9876"),
                        List.of("Java Concurrency in Practice", "Agile Principles"),
                        List.of("Java", "AWS", "Kubernetes")),
                new Person("Kumar",
                        List.of("5555", "6666", "7777"),
                        List.of("Clean Architecture"),
                        List.of("Python", "Docker"))
        );

        // 1️⃣ Extract all phone numbers
        List<String> phoneNumbers = people.stream()
                .map(list -> list.getPhones())
                .flatMap(list -> list.stream()).toList();

        System.out.println(phoneNumbers);


        // 2️⃣ Extract all book titles
        List<String> book = people.stream()
                .map(list->list.getBooks())
                .flatMap(list-> list.stream()).toList();

        System.out.println(book);

        // 3️⃣ Extract all unique skills
        Set<String> uniqueSkills = people.stream()
                .flatMap(p -> p.getSkills().stream())
                .collect(Collectors.toSet());

        System.out.println(uniqueSkills);

        //Count how many people know Docker
        Long count = people.stream().map(list-> list.getSkills())
                .flatMap(list-> list.stream())
                .filter(skill->skill.equals("Docker"))
                .count();
        System.out.println(count);
    }
}
