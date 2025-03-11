package org.code.week3.math;
//Find n-th term of series 1, 3, 6, 10, 15, 21
//Difficulty: BasicAccuracy: 60.58%Submissions: 28K+Points: 1
//Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…
//https://www.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1
public class NthSeries {


    static int dummy(int n){
        int[] arr={1,3,6,10,15,21};
        return findNthTerm(n);
    }

    static int findNthTerm(int n) {
        int sumN=0;
        for(int i=1;i<=n;i++){
            sumN+=i;
        }
        return sumN;
    }


    public static void main(String[] args) {
        System.out.println(dummy(6));
    }
}
