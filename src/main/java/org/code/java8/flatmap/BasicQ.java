package org.code.java8.flatmap;

import java.util.Arrays;
import java.util.List;

public class BasicQ {


    //Flatten a List of Lists of Integers
    static void test1(){
        List<List<Integer>> nums = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        List<Integer> ans = nums.stream()
                .flatMap(list-> list.stream()).toList();

        ans.forEach(System.out::println);
    }

    //Split Sentences into Words
    static void test2(){
        List<String> sentences = List.of("I love Java", "Streams are powerful");
        List<String> ans = sentences.stream()
                .map(list->list.split(" "))
                .flatMap(list-> Arrays.stream(list)).toList();
        System.out.println(ans);
    }

    //Extract All Characters from a List of Words
    static void test3(){
        List<String> words = List.of("Java", "Stream");
        List<String> ans =words.stream().map(list-> list.split(""))
                .flatMap(list-> Arrays.stream(list)).toList();
        System.out.println(ans);
    }

    //Flatten a 2D Array into a List
    static void test4(){
        String[][] arr = { {"A", "B"}, {"C", "D"} };
        List<String> ans = Arrays.stream(arr)
                .flatMap(arr1-> Arrays.stream(arr1))
                .toList();

        System.out.println(ans);
    }


    public static void main(String[] args) {
        test4();
    }
}
