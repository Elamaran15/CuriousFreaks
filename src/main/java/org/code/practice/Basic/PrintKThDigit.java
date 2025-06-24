package org.code.practice.Basic;


/*
Print the Kth Digit
Difficulty: BasicAccuracy: 38.65%Submissions: 39K+Points: 1
Given two numbers a and b, find kth digit from right of ab.

Example 1:

Input: a = 3, b = 3, k = 1
Output: 7
Explanation: 33 = 27 and 1st digit from right is 7
Input: a = 5, b = 2, k = 2
Output: 2
Explanation: 52 = 25 and second digit from right is 2.

https://www.geeksforgeeks.org/problems/print-the-kth-digit3520/0
 */
public class PrintKThDigit {


    static long kthDigit(int a, int b, int k) {
        long powerValue = (long) Math.pow(a,b);
        int check=1;
        if(powerValue>0){
            while(k>check){
                powerValue=powerValue/10;
                check++;
            }
            return powerValue%10;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(kthDigit(3,3,1));
    }
}
