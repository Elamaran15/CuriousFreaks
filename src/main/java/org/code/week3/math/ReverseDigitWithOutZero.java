package org.code.week3.math;


//Reverse digits
//You are given an integer n. Your task is to reverse the digits,
// ensuring that the reversed number has no leading zeroes.
//Input: 200
//Output: 2
//Explanation: By reversing the digits of number, number will change into 2.
//Input : 122
//Output: 221
//Explanation: By reversing the digits of number, number will change into 221.
//https://www.geeksforgeeks.org/problems/reverse-digit0316/1
public class ReverseDigitWithOutZero {

    public static int reverseDigits(int n) {
        int reverse=0;
        while(n>0){
            int lastDigit=n%10;
            if(lastDigit!=0)
                reverse=reverse*10+lastDigit;

            n=n/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(12023));
    }
}
