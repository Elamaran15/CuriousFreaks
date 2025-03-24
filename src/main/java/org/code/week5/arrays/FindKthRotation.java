package org.code.week5.arrays;

import java.util.ArrayList;
import java.util.List;

/*
Find Kth Rotation
Difficulty: EasyAccuracy: 23.16%Submissions: 273K+Points: 2Average Time: 20m
Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times so that it will look like this:
After 1st Rotation : [9, 2, 4, 6]
After 2nd Rotation : [6, 9, 2, 4]

Examples:

Input: arr = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.

//https://www.geeksforgeeks.org/problems/rotation4723/1
 */
public class FindKthRotation {

    public static int findKRotation(List<Integer> arr) {
        int min=arr.stream()
                .mapToInt(a->a)
                .min()
                .orElse(0);
        for(int i=0;i<arr.size();i++){
            if(min==arr.get(i))
                return i;
        }
        return 0;
    }


    public int findKRotationCurious(List<Integer> a) {
        int x=-1;
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)>a.get(i+1)){
                x=i;
                break;
            }
        }
        if(x!=-1){
            return x+1;
        }
        return 0;
    }

    public static int findMineOptimised(List<Integer> arr){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(5,6, 1, 2, 3, 4);
        System.out.println(findMineOptimised(list));
    }
}
