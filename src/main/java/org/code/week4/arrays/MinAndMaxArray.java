package org.code.week4.arrays;

import jdk.jshell.EvalException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

//Min and Max in Array
//Difficulty: BasicAccuracy: 68.55%Submissions: 330K+Points: 1Average Time: 10m
//Given an array arr. Your task is to find the minimum and maximum elements in the array.
//
//Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a maximum.
//
//Examples:
//
//Input: arr[] = [3, 2, 1, 56, 10000, 167]
//Output: 1 10000
//Explanation: minimum and maximum elements of array are 1 and 10000.
public class MinAndMaxArray {


    public static Map<Integer,Integer> getMinMax(int[] arr) {
        int min= Arrays.stream(arr).min().orElse(0);
        int max= Arrays.stream(arr).max().orElse(0);
        Map<Integer,Integer> map=new HashMap<>();
        map.put(min,max);
        return map;
    }

    public static void main(String[] args) {
        getMinMax(new int[]{5,7,34,67,2,56,5,8}).forEach((key,value) -> System.out.println("Min:"+key+" Value:"+value));
    }
}
