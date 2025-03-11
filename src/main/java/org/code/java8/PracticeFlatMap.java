package org.code.java8;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeFlatMap {
    //Test Case: Convert List<Set<String>> to List<String> Without Duplicates
     static void problemOne(){
        List<Set<String>> setsList = Arrays.asList(
                new HashSet<>(Arrays.asList("Apple", "Banana", "Mango")),
                new HashSet<>(Arrays.asList("Banana", "Grapes")),
                new HashSet<>(Arrays.asList("Mango", "Orange", "Apple"))
        );

         List<String> result = setsList
                 .stream()
                 .flatMap(Set::stream)
                 .distinct()
                 .toList();

         result.forEach(System.out::println);

    }


    //Convert List<String> of Comma-Separated Numbers into List<Integer>
    static void problemTwo(){
        List<String> numberStrings = Arrays.asList("1,2,3", "4,5", "6,7,8,9");
        List<Integer> result = numberStrings
                .stream()
                .flatMap(a->Arrays.stream(a.split(",")))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .toList();
        result.forEach(System.out::println);

    }



    public static void main(String[] args) {
        problemTwo();


    }
}
