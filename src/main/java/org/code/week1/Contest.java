package org.code.week1;

import java.util.Scanner;

public class Contest {
   //Write a program which takes the following input and prints them one by one. 1. An whole number 2. A letter 3. A number with fractional part 4. A word
    //
    //Input Format
    //
    //34 S 56.1 PowerRanger
    //
    //Constraints
    //
    //2 ≤ whole numer ≤ 10^6
    //
    //Output Format
    //
    //34
    //S
    //56.1
    //PowerRanger
    static void problemOne(){
        try(Scanner in =new Scanner(System.in)){
            System.out.println(in.nextInt());
            System.out.println(in.next());
            System.out.println(in.nextBigDecimal());
            System.out.println(in.next());
        }
    }

    static void problemTwo(){
        try(Scanner in =new Scanner(System.in)){
            int n=in.nextInt();
            for(int i=2;i<=n;i++){
                System.out.println(i);
            }
        }
    }

    //NaturalNumbers 2
    static void problemThree(){
        try(Scanner in =new Scanner(System.in)){
            int n=in.nextInt();
            int num=0;
            for(int i=1;i<=n;i++){
                num+=i;
            }
            System.out.println(num);
        }

    }


    public static void main(String[] args) {
        problemThree();
    }

}
