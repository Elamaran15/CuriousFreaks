package org.code.week9.KandanesAlgo;


/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.


 */
public class MaximumSubarray {

    //Using Kandanes Alogrithm
    public static int maxSubArray(int[] nums) {

        int maxSum= Integer.MIN_VALUE;
        int sum=0;
        int i=0;

        while(i< nums.length){
            sum=sum+nums[i];
            maxSum=Math.max(maxSum,sum);

            if(sum<0){
                sum=0;
            }
            i++;
        }
        return maxSum;

    }

    public static void main(String[] args) {
       int[] arr={5,4,-1,7,8};

        System.out.println(maxSubArray(arr));
    }
}
