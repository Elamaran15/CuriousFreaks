package org.code.week4.arrays;


//Max and Min Product from 2 Arrays
//Difficulty: BasicAccuracy: 58.96%Submissions: 50K+Points: 1Average Time: 20m
//Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array arr1, and minimum element of the second array arr2.
//
//Examples :
//
//Input : arr1 = [5, 7, 9, 3, 6, 2],  arr2 = [1, 2, 6, 1, 9]
//Output : 9
//Explanation: The max in arr1 is 9. The min element in arr2 is 1. The product is 9*1 = 9.
//Input : arr1 = [0, 0, 0, 0],  arr2 = [1, 1, 2]
//Output : 0

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second3943/0
public class MaxAndMinProductOfTwoArrays {

    public static long findMultiplication(int[] arr1, int[] arr2) {
        return (long) finMaxJava8(arr1) * findMinJava8(arr2);
    }

    private static int findMin(int[] arr2) {
        int min=arr2[0];
        for(int i=1;i<arr2.length;i++){
            if(min>arr2[i]){
                min=arr2[i];
            }
        }
        return min;
    }

    private static int finMax(int[] arr1) {
        int max=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        return max;
    }


    private static int finMaxJava8(int[] arr1) {
       return Arrays.stream(arr1).max().orElse(0);
    }

    private static int findMinJava8(int[] arr2) {
       return Arrays.stream(arr2).min().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(findMultiplication(new int[]{0, 0, 0, 0},new int[]{1, 1, 2}));
    }
}
