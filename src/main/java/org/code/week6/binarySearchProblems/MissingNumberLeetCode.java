package org.code.week6.binarySearchProblems;


import java.util.Arrays;

/*
268. Missing Number
Solved
Easy
Topics
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]

Output: 2

Explanation:

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumberLeetCode {

    //using cycle sort
    public int missingNumberOldSolution(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex =nums[i];
            if(nums[i]<nums.length && nums[i] !=nums[correctIndex])
                swap(nums,i,correctIndex);
            else
                i++;
        }


        for (int j=0;j<nums.length;j++){
            //0,1
            //0,1
            if(nums[j] != j)
                return j;
        }

        return nums.length;
    }
    public void swap(int[] nums, int i, int correctIndex) {
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;
    }


    public static int missingNumber(int[] nums){
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;

            if(nums[mid]==mid)
                start=mid+1;
            else
                end=mid-1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
