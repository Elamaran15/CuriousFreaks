package org.code.week3.math;


//https://www.geeksforgeeks.org/problems/special-odd-series-sum1235/1
//Special Odd Series Sum
//Given the value of n, we need to find the sum of the series where i-th term is sum of first i odd natural numbers.
//
//NOTE: Sum of the series 1 + (1+3) + (1+3+5) + (1+3+5+7) + …… + (1+3+5+7+…+(2n-1))
//
//Example 1:
//
//Input: n = 2
//Output: 5
//Explanation: 1 + (1+3) = 5
//Hence sum of the series is 5.

public class SpecialOddSeriesSum {

    static long sumOfTheSeries(long n){
        int outerSum=0;
        for(int i=1;i<=n;i++){
            int innerSum=0;
            int count=1;
            int j=1;
            while(count<=i){
                if(j%2!=0){
                    innerSum+=j;
                    count++;
                }
                j++;
            }
            outerSum+=innerSum;
        }
        return outerSum;
    }

   //Understanding the Problem Statement
   //We are given a number n, and we need to find the sum of a special series where each term is the sum of the first i odd natural numbers.
   //
   //Series Pattern
   //The series follows this pattern:
   //1+(1+3)+(1+3+5)+(1+3+5+7)+⋯+(1+3+5+⋯+(2n−1))

    //Thus, the sum of the series is:
    //1pow(2) + 2pow(2) + 3pow(2) + 4pow(2) .... + npow(2)
    // so the formula for sum of square number is
    //n*(n+1)(2*n+1)/6
    static long sumOfTheSeriesOptimisedUsingMathFormula(long n){
        // Using the formula: (n * (n + 1) * (2n + 1)) / 6
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) {
        System.out.println(sumOfTheSeries(5));
    }
}
