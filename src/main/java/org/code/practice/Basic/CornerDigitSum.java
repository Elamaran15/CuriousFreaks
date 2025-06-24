package org.code.practice.Basic;


/*
Corner Digits Sum
Difficulty: BasicAccuracy: 35.58%Submissions: 6K+Points: 1Average Time: 10m

Given a number N, find the sum of first and last digit of N.


Example 1:

Input: N = 12345
Output: 6
Explanation: 1st and last digits are 1 and 5.

https://www.geeksforgeeks.org/problems/corner-digits1317/1
 */
public class CornerDigitSum {


    public static int corner_digitSum(int n) {

        if (n > 0) {
            if((int)Math.log10(n)+1==1){
                return n;
            }
            char firstChar = Integer.toString(n).charAt(0);
            int firstDigit = Character.getNumericValue(firstChar);
            char lastChar = Integer.toString(n).charAt((int) Math.log10(n));
            int lastDigit = Character.getNumericValue(lastChar);
            return firstDigit + lastDigit;
        }else{
            return n;
        }
    }

    public static void main(String[] args) {
        int n=1;

//        System.out.println(n/10);
//        System.out.println(n%10);
//
//        System.out.println(Integer.toString(n).charAt(0));
//        System.out.println(Integer.toString(n).charAt(3));
//        System.out.println((int)Math.log10(n));

        System.out.println(corner_digitSum(n));
    }


}
