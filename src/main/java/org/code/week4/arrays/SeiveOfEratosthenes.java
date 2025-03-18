package org.code.week4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Sieve of Eratosthenes
//Difficulty: EasyAccuracy: 47.43%Submissions: 62K+Points: 2
//Given a positive integer n, calculate and return all prime numbers less than or equal to n using the Sieve of Eratosthenes algorithm.
//
//
//A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

//https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1
public class SeiveOfEratosthenes {

    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[n+1];
        Arrays.fill(arr,1);

        arr[0]=0;
        arr[1]=0;
        //starting from 2 since its is the small prime number
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]==1){
                for(int j=i*2;j<=n;j=j+i){
                    arr[j]=0;
                }
            }
        }


        for(int i=0;i<=n;i++){
            if(arr[i]==1)
                list.add(i);
        }
       return list;
    }


    public static void main(String[] args) {
        sieveOfEratosthenes(204).forEach(System.out::println);
    }
}
