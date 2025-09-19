package org.code.java8;


import java.util.List;

/*

Find even numbers from a list of integers.

Given a list of strings, convert each string to uppercase using streams.

Count the number of strings in a list that start with the letter "A".

Given a list of numbers, square each number and return the new list.

Sort a list of strings in alphabetical order using streams.
 */
public class BasicLevel {


    //Find even numbers from a list of integers.
    static List<Integer> findEven(List<Integer> list){
         return list.stream().filter(a-> a%2==0).toList();
    }


    //Given a list of strings, convert each string to uppercase using streams.

    static List<String> upperCase(List<String> list){
        return list.stream().map(String::toUpperCase).toList();
    }


    //Count the number of strings in a list that start with the letter "A".
    static List<String> countStartLetter(List<String> list){
        return list.stream().filter(a-> a.startsWith("A")).toList();
    }

    //Sort a list of strings in alphabetical order using streams
    static List<String> sortAscString(List<String> list){
        return list.stream().sorted().toList();
    }

    public static void main(String[] args) {
//     List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
//     findEven(list).forEach(System.out::println);

//     List<String> str=List.of("ela","reo","arun","prem");
//     upperCase(str).forEach(System.out::println);

//     List<String> str=List.of("ela","reo","Arun","prem","Anu");
//        countStartLetter(str).forEach(System.out::println);

//        List<String> str=List.of("ela","reo","Arun","prem","Anu");
//        sortAscString(str).forEach(System.out::println);



    }
}
