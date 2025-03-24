package org.code.week5.arrays;

import java.util.Arrays;

/*
Largest Element in Array
Difficulty: BasicAccuracy: 67.48%Submissions: 444K+Points: 1Average Time: 20m
Given an array arr[]. The task is to find the largest element and return it.

Examples:

Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
 */
public class LargestNumInArray {

    public static int largest(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public static int largestJava8(int[] arr){
        return Arrays.stream(arr).max().orElse(0);
    }

    public static void main(String[] args) {

    }
}
