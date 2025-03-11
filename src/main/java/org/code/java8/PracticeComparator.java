package org.code.java8;

import java.util.*;

public class PracticeComparator {

    //Sort a List of Integers in Descending Order
    //Given a list of numbers: [10, 5, 20, 15, 30]
    static void problemOne(){
        List<Integer> num= new ArrayList<>(List.of(10, 5, 20, 15, 30));
        num.sort(Comparator.reverseOrder());
        num.forEach(System.out::println);
    }

    //Sort a List of Strings Alphabetically (Case Insensitive)
    //Given a list: ["Banana", "apple", "Grapes", "mango"]
    //Sort it ignoring case ("apple" should come before "Banana").
    static void problemTwo(){
        List<String> words = new ArrayList<>();
        words.add("Banana");
        words.add("apple");
        words.add("Grapes");
        words.add("mango");

        words.sort(String.CASE_INSENSITIVE_ORDER.reversed());

        words.forEach(System.out::println);
    }

    //We will sort a list of strings based on their length.
    static void problemThree(){
        List<String> words = Arrays.asList("elephant", "cat", "dog", "tiger");
        words.sort(Comparator.comparing(String::length));
    }




    public static void main(String[] args) {
        problemTwo();
    }
}
