package org.code.week1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ProblemSet2 {

    //Write a program which takes two values x and y. Prints x for y number of times.
    //Input:
    //2
    //3
    //Expected Output
    // 2
    //2
    //2
    //Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.

    private static void problemOne(){
        System.out.println("Enter a number: ");
        try(Scanner in =new Scanner(System.in)) {
            int x=in.nextInt();
            int y=in.nextInt();
            for (int i = 0; i < y; i++) {
                System.out.println(x);
            }
        }
    }

    //Write a program to take x and print multiples of x till 1000.
    private static void problemTwo(){
        System.out.println("Enter a number: ");
        try(Scanner in =new Scanner(System.in)){
            int x=in.nextInt();
            int i=1;
            while(x*i<=1000){
                System.out.println(x*i);
                i++;
            }
        }
    }

    //Write a program to get firstName and lastName
    // and n as input and print fullName that is firstName+lastName for n times.
    private static void problemThree(){
        System.out.println("Enter FirstName And LastName:");
        try(Scanner in =new Scanner(System.in)){
            String firstName=in.next();
            String lastName=in.next();
            System.out.println("Enter n:");
            try(Scanner inn =new Scanner(System.in)) {
                int n=inn.nextInt();
               for (int i=0;i <n;i++){
                    System.out.println(firstName+lastName);
                }
            }
        }
    }




    public static void main(String[] args) {
        problemThree();
    }
}
