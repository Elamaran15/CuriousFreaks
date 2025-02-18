package org.code.week1;

import java.util.Scanner;

public class ProblemSet1 {

    //Prob 1 : Write a program that takes an integer, then a string,
    // then a char from the user and prints them in the screen.

    private static void problemOne(){
        System.out.println("Enter a number:");
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num);
        in.close();
        System.out.println("Enter a word:");
        Scanner inStr =new Scanner(System.in);
        String str = inStr.next();
        System.out.println(str);
        inStr.close();
        System.out.println("Enter a Character:");
        Scanner inC =new Scanner(System.in);
        char character = inC.next().charAt(0);
        System.out.println(character);
        inC.close();
    }


    //Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.
    //
    //If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.
    //
    //Input: 45 45 45

    private static void sumOfAngles(){
        System.out.println("Enter an angle:");
        Scanner in = new Scanner(System.in);
        in.close();
        int angle=in.nextInt() + in.nextInt() + in.nextInt();

        if(angle==180) System.out.println("Triangle can be formed");
        else System.out.println("Triangle cannot be formed");
    }


    //Given mark of student, Print the Grade
    //
    //Grade A if mark is greater than or equal to 90
    //
    //Grade B if mark is greater than or equal to 80
    //
    //Grade C if mark if greater than or equal to 60
    //
    //Grade D if mark if greaer than or equal to 35
    //
    //Fail if mark is lesser than 35

    private static void problemThree(){
        System.out.println("Enter the grade: ");
        Scanner in =new Scanner(System.in);
        int mark=in.nextInt();
        in.close();

//        if(mark>=90) System.out.println("Grade A");
//        else if (mark>=80) System.out.println("Grade B");
//        else if (mark >= 60) System.out.println("Grade C");
//        else if (mark >= 35) System.out.println("Grade D");
//        else System.out.println("Fail");

        String grade = switch (mark/10){
            case 10,9 -> "Grade A";
            case 8 -> "Grade B";
            case 6,7 -> "Grade C";
            case 3,5,4 -> "Grade D";
            default -> "Fail";
        };
        System.out.println(grade);
    }


    //Prob 4: Write a program using switch case which takes a value and prints the respective Size.
    //If size is 29 then its small
    //
    //If size is 30 then its Medium
    //
    //If size is 38 then its Large
    //
    //If size is 42 then its XLarge
    //
    //If size is not any of the above then Invalid.
    private static void problem4(){
        System.out.println("Enter Size:");
        try(Scanner in =new Scanner(System.in)){
            int size=in.nextInt();
            switch (size){
                case 29 -> System.out.println("Small");
                case 30 -> System.out.println("Medium");
                case 38 -> System.out.println("Large");
                case 42 -> System.out.println("XLarge");
                default -> System.out.println("Invalid");
            }
        }
    }

    public static void main(String[] args) {
        problem4();
    }




}
