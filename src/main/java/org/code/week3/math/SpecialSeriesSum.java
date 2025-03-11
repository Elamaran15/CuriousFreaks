package org.code.week3.math;
//Given the value of n, we need to find the sum of the series where i-th term is sum of first i natural numbers.
//
//NOTE: Sum of the series 1 + (1+2) + (1+2+3) + (1+2+3+4) + …… + (1+2+3+4+…+n)
//
//Example 1:
//
//Input: n = 5
//Output: 35
//Explanation: 1 + (1+2) + (1+2+3).. = 35
//Hence sum of the series is 35.

//https://www.geeksforgeeks.org/problems/special-series-sum0903/1
public class SpecialSeriesSum {


    static long sumOfTheSeries(long n){
        long outerSum=0;
        for(int i=1;i<=n;i++){
            int innerSum=0;
            for(int j=1;j<=i;j++){
                innerSum+=j;
            }
            outerSum+=innerSum;
        }
        return outerSum;
    }

    //The formula used in the function is:
    //n×(n+1)×(n+2)
    //
    //But why this formula? 🤔
    //
    //This formula is used to find the sum of the first n triangular numbers.
    //
    //What is a Triangular Number?
    //A triangular number is the sum of the first few natural numbers.
    //
    //For example:
    //
    //1st triangular number = 1
    //2nd triangular number = 1 + 2 = 3
    //3rd triangular number = 1 + 2 + 3 = 6
    //4th triangular number = 1 + 2 + 3 + 4 = 10
    //Now, if we need to sum up the first n triangular numbers, the formula used is:
    //n×(n+1)×(n+2)

    static long sumOfTheSeriesOptimisedUsingFormula(long n){
        return (n*(n+1)*(n+2)/6);
    }


    public static void main(String[] args) {
        System.out.println(sumOfTheSeries(10));
    }
}
