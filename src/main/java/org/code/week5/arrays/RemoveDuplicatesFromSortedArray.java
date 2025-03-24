package org.code.week5.arrays;

/*
26. Remove Duplicates from Sorted Array
Solved
Easy
Topics
Companies
Hint
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesFromSortedArray {


    public static int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j < nums.length){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                j++;
                i++;
            }else{
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}
