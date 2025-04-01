package org.code.week6.binarySearchProblems;


import javax.swing.*;
import java.util.Arrays;

/*
You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
 */
public class MissingInArray {



    static int missingNumber(int arr[]) {
        Arrays.sort(arr);
       if(arr.length<=1)
           return arr[0];

       int start=0;
       int end=arr.length-1;

       while(start<=end){
           int mid=start + (end-start)/2;

           if(arr[mid]!=mid+1)
               return arr[mid]+1;

           if(arr[mid]<=mid+1)
               start=mid+1;
           else
               end=mid-1;
       }

       return end;
    }


    static int missingNumberOptimised(int arr[]) {
        Arrays.sort(arr);

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(arr[mid]==mid+1)
                start=mid+1;
            else
                end=mid-1;
        }

        return start+1;
    }


    public static void main(String[] args) {
        int[] arr={2};
        System.out.println(missingNumberOptimised(arr));
    }
}
