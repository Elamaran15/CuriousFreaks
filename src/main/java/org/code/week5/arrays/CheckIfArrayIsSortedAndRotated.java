package org.code.week5.arrays;
/*
1752. Check if Array Is Sorted and Rotated
Easy
Topics
Companies
Hint
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.



Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the element of value 3: [3,4,5,1,2].

https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
 */
public class CheckIfArrayIsSortedAndRotated {

    public static boolean check(int[] nums) {
        if(nums.length<=1)
            return true;
        int rotation=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                rotation++;
            }
        }
        if(nums[0]<nums[nums.length-1])
            rotation++;

        return rotation<=1;
    }

    public static void main(String[] args) {
         int[] arr={1,2,3};
        System.out.println(check(arr));
    }
}
