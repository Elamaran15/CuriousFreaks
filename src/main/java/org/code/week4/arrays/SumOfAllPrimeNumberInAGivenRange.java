package org.code.week4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.
//
//
//
//Examples:
//
//Input : L = 10, R = 20
//Output : Sum = 60
//Prime numbers between [10, 20] are:
//11, 13, 17, 19
//Therefore, sum = 11 + 13 + 17 + 19 = 60
//Input : L = 15, R = 25
//Output : Sum = 59
//
//Note: Use sieve of eratosthenes to solve the problem
public class SumOfAllPrimeNumberInAGivenRange {


    static ArrayList<Integer> findSum(int left,int right){
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[right+1];
        Arrays.fill(arr,1);

        arr[0]=0;
        arr[1]=0;

        for(int i=2;i<=Math.sqrt(right);i++){
            if(arr[i]==1){
                for(int j=i*2;j<=right;j+=i){
                    arr[j]=0;
                }
            }
        }

        for(int i=0;i<=right;i++){
            if(arr[i]==1 && i>=left)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        findSum(10,20).forEach(System.out::println);
    }
}
