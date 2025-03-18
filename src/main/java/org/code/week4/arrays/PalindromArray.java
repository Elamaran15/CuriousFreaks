package org.code.week4.arrays;


//Palindrome Array
//Difficulty: BasicAccuracy: 43.54%Submissions: 73K+Points: 1
//Given an array arr, the task is to find whether the arr is palindrome or not. If the arr is palindrome then return true else return false.
//
//An array is said to be palindrome if its reverse array matches the original array.
//
//Examples:
//
//Input: arr = [1, 2, 3, 2, 1]
//Output: true
//Explanation: Here we can see we have [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1] which is the same as before. So, the answer is true.

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/perfect-arrays4645/1
public class PalindromArray {


    public static boolean isPerfect(int[] arr) {
        int[] newArr=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            newArr[arr.length-(i+1)]=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=newArr[i])
                return false;
        }

        return true;
    }


    public static boolean isPerfectOptimised(int[] arr) {
        int i=0,j=arr.length-1;

        while (i<j){
            if(arr[i]!=arr[j])
                return false;

            i++;
            j--;
        }
        return true;

    }


    public static void main(String[] args) {
        System.out.println(isPerfectOptimised(new int[]{1, 2, 3, 2, 1}));
    }
}
