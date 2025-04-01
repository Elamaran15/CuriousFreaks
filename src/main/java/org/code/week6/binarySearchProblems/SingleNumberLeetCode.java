package org.code.week6.binarySearchProblems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
136. Single Number
Easy
Topics
Companies
Hint
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4
 */
public class SingleNumberLeetCode {
    public static int singleNumberJava8(int[] nums) {
       Map<Integer, Long> map= Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       return map.keySet()
               .stream()
               .filter(key -> map.get(key) == 1)
               .findFirst().orElse(0);
    }

    public static int singleNumber(int[] nums){
        if(nums.length<=1)
            return nums[0];

        Arrays.sort(nums);

        if(nums[0]!=nums[1])
            return nums[0];

        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int start=1;
        int end=nums.length-2;

        while (start<=end){
            int mid=start + (end-start)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
                return nums[mid];

            if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;

    }


    public static void main(String[] args) {
       int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
