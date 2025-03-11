package org.code.week3.math;


//Write a program that gets n as input and print the reverse of the number
//
//Testcase 1 :
//
//Input :
//
//325345
//
//Expected output:
//
//543523
public class ReverseNum {

    static void reverseNum(int n){
        int reversNum=0;
        while(n>0){
            reversNum = 10 * reversNum +(n%10);
            n=n/10;
        }
        System.out.println(reversNum);

    }

    public static void main(String[] args) {
        reverseNum(325345);
    }
}
