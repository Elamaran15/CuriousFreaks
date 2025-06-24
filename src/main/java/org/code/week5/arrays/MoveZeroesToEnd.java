package org.code.week5.arrays;

import java.util.Arrays;
/*
283. Move Zeroes
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */

public class MoveZeroesToEnd {

    //FOR Leetcode
    public static void moveZeroes(int[] nums) {
        if(nums.length<=1)
            return;

      int i=0;
      int j=1;

      while(j<nums.length){
          if(nums[j]!=0 && nums[i]==0){
              swap(nums,j,i);
              i++;
              j++;
          } else if (nums[j]==0 && nums[i]==0) {
              j++;
          }else{
              i++;
              j++;
          }
      }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    //FOD GFG
    void pushZerosToEnd(int[] arr) {
        if(arr.length<=1)
            return;

        int i=0;
        int j=1;

        while(j<arr.length){
            if(arr[j]!=0 && arr[i]==0){
                swap(arr,j,i);
                i++;
                j++;
            } else if (arr[j]==0 && arr[i]==0) {
                j++;
            }else{
                i++;
                j++;
            }
        }
    }


    static void practice(int[] arr){
         if(arr.length<=1){
             Arrays.stream(arr).forEach(System.out::println);
             return;
         }

         int first=0;
         int second=1;

         while(second<arr.length){
             if(arr[first]==0 && arr[second]!=0){
                 swap(arr,first,second);
                 first++;
                 second++;
             }else if(arr[first]==0 && arr[second]==0){
                 second++;
             }else{
                 first++;
                 second++;
             }
         }
        Arrays.stream(arr).forEach(System.out::println);
    }


    public static void main(String[] args) {
        int[] arr={0};
        practice(arr);
        //Arrays.stream(arr).forEach(System.out::println);
    }
}
