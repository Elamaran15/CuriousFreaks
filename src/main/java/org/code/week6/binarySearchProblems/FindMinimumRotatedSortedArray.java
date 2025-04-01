package org.code.week6.binarySearchProblems;

import java.util.Arrays;

/*153. Find Minimum in Rotated Sorted Array
Medium
Topics
Companies
Hint
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 */
public class FindMinimumRotatedSortedArray {



    public static int findMin(int[] nums) {
       int min=nums[0];
       int start=1;
       int end=nums.length-1;

       while(start<=end){
           int mid=start +(end-start)/2;

           if(nums[mid]<min)
               min=nums[mid];

           if(nums[start]<nums[mid]){
               if(nums[start]<min)
                   end=mid-1;
               else
                   start=mid+1;
           }else if(nums[mid]>nums[mid-1] && nums[start]>nums[start+1]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }

       }
       return min;
    }

    public static int findMin1(int[] nums) {
        int min=nums[0];
        int start=1;
        int end=nums.length-1;

        while(start<=end){
            int mid=start +(end-start)/2;

            if(nums[mid]<min)
                min=nums[mid];

            if (nums[mid] > nums[mid-1] && nums[mid-1]<min) {
                end=min-1;
            }else{
                start=mid+1;
            }

        }
        return min;
    }


    static int findMinUsingJava8(int[] arr){
        return Arrays.stream(arr).min().orElse(0);
    }


    public static int findMinA2ZWorking(int[] arr){
        int start=0;
        int end=arr.length-1;
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start + (end-start)/2;

            if(arr[start]<=arr[mid]){
                min =Math.min(min,arr[start]);
                start=mid+1;
            }else{
                min=Math.min(arr[mid],min);
                end=mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
       int[] nums={11,13,15,17};
        System.out.println(findMinA2ZWorking(nums));
    }
}
