package org.code.week6.arrays;


/*
485. Max Consecutive Ones
Easy
Topics
Companies
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.



Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2

https://leetcode.com/problems/max-consecutive-ones/description/
 */
public class MaxConsecutiveOnesLeetCode {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int outer=0;
        int inner=0;
        int i=0;
        while(i< nums.length) {
            if (nums[i] == 1)
                ++inner;
            else {
                if(outer<inner)
                  outer = inner;

                inner=0;
            }
            i++;
        }
        return Math.max(outer,inner);
    }

    public static void main(String[] args) {
      int[] arr={1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));

    }


}
