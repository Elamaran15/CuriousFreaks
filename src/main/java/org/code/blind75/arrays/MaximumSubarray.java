package org.code.blind75.arrays;


/*
53. Maximum Subarray
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums, find the subarray with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.


https://leetcode.com/problems/maximum-subarray/description/

 */

import java.util.Arrays;
import java.util.List;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum + nums[i];

            if(sum>max){
                max=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        return max;
    }


    public static List<Integer> maxSubArrayStartAndEndIndex(int[] nums) {
        int max= Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int ansStart=0;
        int ansEnd=0;

        for(int i=0;i<nums.length;i++){
            if(sum==0) {
                start=i;
            }
            sum=sum + nums[i];

            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }
        }
        return List.of(ansStart,ansEnd);
    }


    //practice 15-09-25
    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }

        return max;
    }


    //Follow up question
    //get the max subarray index
    static void findIndex(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=-1;
        int ansStart=-1;
        int ansEnd=-1;

        for(int i=0;i<arr.length;i++){
            if(sum==0) start=i;

            sum=sum+arr[i];

            if(sum>max){
                max=sum;
                ansStart=start;ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Start index: "+ansStart);
        System.out.println("End Index: "+ansEnd);
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        //System.out.println(findMax(arr));
        findIndex(arr);
    }

}
