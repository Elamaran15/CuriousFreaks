package org.code.week3.math;

//https://www.geeksforgeeks.org/problems/palindrome0746/1

//You are given an integer n. Your task is to determine whether it is a palindrome.
//
//A number is considered a palindrome if it reads the same backward as forward, like the string examples "MADAM" or "MOM".
//
//Examples:
//
//Input: n = 555
//Output: true
//Explanation: The number 555 reads the same backward as forward, so it is a palindrome.

import java.util.stream.IntStream;


public class Palindrome {
    public static boolean isPalindrome(int n) {
        int reverseNum=0;
        int num=n;

        if((int)Math.log10(n)+1==1)
            return true;

        while(n>0){
            reverseNum = 10 * reverseNum +(n%10);
            n=n/10;
        }
        return reverseNum==num;
    }


    public static boolean isPalindromeJava8(int n){

        String original = String.valueOf(n);
        String reversed = IntStream.range(0, original.length())
                .mapToObj(i -> original.charAt(original.length() - 1 - i))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        return original.equals(reversed);



    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
