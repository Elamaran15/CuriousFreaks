package org.code.coreJava.funtionalPrograming.firstclassfunction;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FirstClassFunctionExample {

    static void print(Function<String,Integer> fun,String name){
        int n=fun.apply(name);
        for(int i=0;i<=n;i++){
            System.out.println(name);
        }
    }

    public static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Function<String,Integer>  asVariable = s -> s.length();

        System.out.println(asVariable.apply("Elamaran"));

        //print(asVariable,"Elamaran");


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // Passing behavior dynamically
        filterAndPrint(numbers, x -> x % 2 == 0); // Even numbers

    }





}
