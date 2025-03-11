package org.code.week3.math;


//Given an integer N, find the absolute difference between sum of the squares of first N natural numbers and square of sum of first N natural numbers.
//
//Example 1:
//
//Input: N = 2
//Output: 4
//Explanation: abs|(12 + 22) - (1 + 2)2| = 4
//https://www.geeksforgeeks.org/problems/squares-difference0939/1


public class SquaresDifference {

    static long squaresDiff(int N){
        long sqValue=(N * (N+1)*((2L *N) +1))/6;
        long sumN= (long) Math.pow((double) (N * (N + 1)) /2,2);
        return Math.abs(sqValue-sumN);
    }

    public static void main(String[] args) {
        System.out.println(squaresDiff(3));
    }
}
