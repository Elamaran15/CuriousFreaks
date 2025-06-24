package org.code.practice.Math;


import java.awt.desktop.PreferencesEvent;

/*
You are given an integer n. Your task is to determine whether it is a palindrome.

A number is considered a palindrome if it reads the same backward as forward, like the string examples "MADAM" or "MOM".

Examples:

Input: n = 555
Output: true
Explanation: The number 555 reads the same backward as forward, so it is a palindrome.
Input: n = 123
Output: false
Explanation: The number 123 reads differently backward (321), so it is not a palindrome.

https://www.geeksforgeeks.org/problems/palindrome0746/1
 */
public class Palindrome {


    public static boolean isPalindrome(int n) {
        int ans=n;
        if((int)Math.log10(n)+1==1)
            return true;

        int reverse=0;
        if(n>0){
            while(n>0){
                int lastDigit=n%10;
                reverse = reverse*10 + lastDigit;
                n=n/10;
            }
            return reverse==ans;
        }else{
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(555));


    }


}
