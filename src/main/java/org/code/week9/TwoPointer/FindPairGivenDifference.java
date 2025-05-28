package org.code.week9.TwoPointer;

import java.util.Arrays;

/*
Find Pair Given Difference
Difficulty: EasyAccuracy: 27.25%Submissions: 269K+Points: 2Average Time: 15m
Given an array, arr[] and an integer x, return true if there exists a pair of elements in the array whose absolute difference is x, otherwise, return false.

Examples:

Input: arr[] = [5, 20, 3, 2, 5, 80], x = 78
Output: true
Explanation: Pair (2, 80) have an absolute difference of 78.
Input: arr[] = [90, 70, 20, 80, 50], x = 45
Output: false
Explanation: There is no pair with absolute difference of 45.
Input: arr[] = [1], x = 1
Output: false

https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
 */
public class FindPairGivenDifference {


    public static boolean findPair(int[] arr, int x) {
      for(int i=0;i<arr.length-1;i++){
          for(int j=i+1;j<arr.length;j++){
              if(Math.abs(arr[i]-arr[j]) == x){
                  return true;
              }
          }
      }
      return false;
    }


    public static boolean findPairOptimised(int[] arr, int x) {
        Arrays.sort(arr);
       int i=0;
       int j=1;
       while(j<arr.length){
           if(i!=j){
               int diff=arr[j]-arr[i];
               if(diff==x){
                   return true;
               }else if(diff<x){
                   j++;
               }else{
                   i++;
               }

           }else{
               j++;
           }
       }
       return false;
    }


    public static void main(String[] args) {
       int[] arr={1};
        System.out.println(findPairOptimised(arr,1));
    }
}
