package org.code.week5.arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
/*
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */

//Leetcode
/*
75. Sort Colors
Solved
Medium
Topics
Companies
Hint
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

https://leetcode.com/problems/sort-colors/description/
 */
public class Sort0s1sand2s {

    public static void sort012(int[] arr) {
        int zero = 0;
        int one =  0;
        int two =  0;

        for (int j : arr) {
            if (j == 0) zero++;
            if (j == 1) one++;
            if (j == 2) two++;
        }

        for(int i=0;i<zero;i++){
            arr[i]=0;
        }

        for(int i=zero;i<one+zero;i++){
            arr[i]=1;
        }

        for(int i=one+zero;i<arr.length;i++){
            arr[i]=2;
        }
        Arrays.stream(arr).forEach(System.out::println);


    }

    //Dutch national flag algorithm
    public static void sort012OptimalSolution(int[] arr) {
        if(arr.length==1)
            return;

        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swap(int[] arr, int mid, int low) {
       int temp=arr[mid];
       arr[mid]=arr[low];
       arr[low]=temp;
    }

    public static void main(String[] args) {
      int[] arr={2,2};
        sort012OptimalSolution(arr);
    }
}
