package org.code.Week2.contest;

import java.util.Scanner;
//Teena is fond of patterns, but she needs your help to solve the below pattern. Given n as input, teena wants you to print the below pattern.
//
//Input Format
//
//n = 5


//12345
//678910
//1112131415
//1617181920
//2122232425

public class EasyPattern {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int value=1;
        for(int row=1;row<=n;row++){

            for(int j=1;j<=n;j++) {
                System.out.print(value++);
            }
            System.out.println();
        }
    }
}
