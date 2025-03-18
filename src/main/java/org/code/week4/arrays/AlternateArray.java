package org.code.week4.arrays;

//Alternates in an Array
//Difficulty: BasicAccuracy: 52.74%Submissions: 198K+Points: 1Average Time: 15m
//You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).
//
//Examples:
//
//Input: arr[] = [1, 2, 3, 4]
//Output: 1 3
//Explanation:
//Take first element: 1
//Skip second element: 2
//Take third element: 3
//Skip fourth element: 4

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1
public class AlternateArray {

    public static ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        getAlternates(new int[]{1, 2, 3, 4, 5}).forEach(System.out::println);
    }
}
