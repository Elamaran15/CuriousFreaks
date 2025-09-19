package org.code.blind75.arrays;

/*
1. Two Sum
Easy
Topics
premium lock icon
Companies
Hint

Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

https://leetcode.com/problems/two-sum/description/
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    //Brute force approach Time Complexity: O(N(square))
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                     return new int[]{i,j};
            }
        }

        return new int[]{0,0};
    }


    public static int[] twoSumOptimalUsingHashMap(int[] nums, int target) {
        // Create a HashMap to store the numbers we've seen so far and their indices
        Map<Integer, Integer> ans = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // For each number, calculate the number needed to reach the target
            int n = target - nums[i];

            // Check if the required number 'n' is already in the map
            if (ans.get(n) != null) {
                // If yes, we found the pair that adds up to the target
                // Return the pair as an array (actual numbers, not indices)
                return new int[]{nums[i], n};
            } else {
                // If not found, store the current number with its index
                // This helps us check future numbers against this one
                ans.put(nums[i], i);
            }
        }

        // If no pair found that adds up to the target, return an empty array
        return new int[]{};
    }



    //practice using two pointer
    static void practiceUsingTwoPointer(int[] arr,int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+"  "+j);
                }
            }
        }
    }




    //using hashmap practice
    static void usingMap(int[] arr,int target){
        Map<Integer,Integer> ansMap=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int numberRequired= target - arr[i];

            if(ansMap.get(numberRequired)!=null){
                System.out.println(arr[i]+" "+ numberRequired);
            }else{
                ansMap.put(arr[i],i);
            }

        }
    }





    public static void main(String[] args) {
    int[] arr={2,6,5,8,11};
    //Arrays.stream(twoSumOptimalUsingHashMap(arr,14)).forEach(System.out::println);
        //practiceUsingTwoPointer(arr,14);
        usingMap(arr,14);
    }
}
