package org.code.week9.slidingWindow;


/*
643. Maximum Average Subarray I

https://leetcode.com/problems/maximum-average-subarray-i/description/

643. Maximum Average Subarray I
Easy
Topics
Companies
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.



Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
public class MaxSubArrayWithSizek {
    public static double findMaxAverage(int[] nums, int k) {
      double maxAvg=0;

      int sum=0;
      for(int i=0;i<k;i++){
          sum=sum + nums[i];
      }

      maxAvg= (double) sum /k;

      int l=0;
      int r=k-1;
      int innerSum=sum;
      double innerAvg=0;
      while(r<nums.length-1){
          innerSum=innerSum-nums[l];
          l++;
          r++;
          innerSum=innerSum+nums[r];
          innerAvg= (double) innerSum /k;
          maxAvg=Math.max(innerAvg,maxAvg);
      }

      return maxAvg;

    }

    public static void main(String[] args) {
        int[] arr={5};
        int k=1;
        System.out.println(findMaxAverage(arr,k));
    }
}
