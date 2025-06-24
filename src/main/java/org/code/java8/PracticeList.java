package org.code.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeList {


    public static void main(String[] args) {
        // Convert List to Uppercase
        List<String> names = Arrays.asList("ram", "john", "elamaran");
        List<String> ans = names.stream().map(String::toUpperCase).toList();
        ans.forEach(System.out::print);
        System.out.println();
        System.out.println("****************************");

        //order it in assending order
        List<String> ans2=names.stream().map(String::toUpperCase).sorted().toList();
        ans2.forEach(System.out::print);
        System.out.println();
        System.out.println("****************************");

        //order it in desending order
        List<String> ans3=names.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
        ans3.forEach(System.out::print);
        System.out.println();
        System.out.println("****************************");

        // Find Max Element Using Stream
        List<Integer> list = Arrays.asList(10, 20, 30, 50);
        int max= list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println("****************************");

        // Another way to find max
        int max2= list.stream().max(Integer::compareTo).get();
        System.out.println(max2);
        System.out.println("****************************");


        //Find the sum of numbers
        int sum= list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println("****************************");

        //Sum of Even Numbers Using Streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum2=numbers.stream()
                .filter(n->n%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum2);
        System.out.println("****************************");

        //Concatenate Strings with a Delimiter
        //Problem: Given a list of strings,
        // concatenate them into a single string, separated by a comma and a space (", ").
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        String word= String.join(",", words);
        System.out.println(word);
        System.out.println("****************************");
        // another way to use collectors
        String an=words.stream().collect(Collectors.joining(", "));
        System.out.println(an);
        System.out.println("****************************");
    }
}
