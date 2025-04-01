package org.code.week6.binarySearchProblems.applicationSenarios;


import java.util.Arrays;

/*
410. Split Array Largest Sum
Hard
Topics
Companies
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.



Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

https://leetcode.com/problems/split-array-largest-sum/description/
 */
public class SplitArrayLargestSum {

    public static int splitArray(int[] nums, int k) {
      int start= Arrays.stream(nums).max().orElse(0);
      int end=Arrays.stream(nums).sum();

      while(start<=end){
          int mid=start + (end-start)/2;
          int StudentCount=getStudentCount(nums,mid);
          if(StudentCount<=k)
              end=mid-1;
          else
              start=mid+1;
      }

      return start;
    }

    private static int getStudentCount(int[] nums, int mid) {
        int student=1;
        int ans=0;
        for(int i=0;i<nums.length;i++){

            if(ans+nums[i]<=mid){
                ans+=nums[i];
            }else{
                student++;
                ans=nums[i];
            }
        }

        return student;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        System.out.println(splitArray(arr,2));
    }
}
