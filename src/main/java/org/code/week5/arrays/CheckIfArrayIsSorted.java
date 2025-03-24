package org.code.week5.arrays;

//https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
//Check if array is sorted
//Difficulty: EasyAccuracy: 39.37%Submissions: 243K+Points: 2Average Time: 15m
//Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.
//
//Examples:
//
//Input: arr[] = [10, 20, 30, 40, 50]
//Output: true
//Explanation: The given array is sorted.

public class CheckIfArrayIsSorted {


    public static boolean arraySortedOrNot(int[] arr) {
        int startIndex=0;
        int endIndex=arr.length-1;

        while(startIndex<endIndex){
            if(arr[startIndex]>arr[startIndex+1] || arr[endIndex]<arr[endIndex-1]) {
                return false;
            }else{
                startIndex++;
                endIndex--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50};
        System.out.println(arraySortedOrNot(arr));
    }

}
