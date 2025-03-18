package org.code.week4.arrays;
//Find element at a given Index
//Difficulty: BasicAccuracy: 70.56%Submissions: 75K+Points: 1Average Time: 20m
//Given an array arr of integers and an index key(0-based index). Your task is to return the element present at the index key in the array.
//
//Examples:
//
//Input: key = 2 , arr = [10, 20, 30, 40, 50]
//Output: 30
//Explanation: The value of arr[2] is 30 .
//Input: key = 4 , arr = [10, 20, 30, 40, 50, 60, 70]
//Output: 50
//Explanation: The value of the arr[4] is 50 .

//https://www.geeksforgeeks.org/problems/c-array-print-an-element-set-25933/0
public class FindElementAtGivenIndex {


    public static int findElementAtIndex(int key, int[] arr) {
       if(key>arr.length || key<0)
           return -1;

       return arr[key];
    }

    public static void main(String[] args) {
        System.out.println(findElementAtIndex(4,new int[]{10, 20, 30, 40, 50, 60, 70}));
    }
}
