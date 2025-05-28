package org.code.week9.KandanesAlgo;



/*
152. Maximum Product Subarray
Medium
Topics
Companies
Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.



Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


https://leetcode.com/problems/maximum-product-subarray/description/
 */
public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int n = nums.length;

        int leftProduct = 1;
        int rightProduct = 1;
        int maxProduct = nums[0]; // Initial max is the first element

        for (int i = 0; i < n; i++) {
            // If product becomes 0, reset to 1
            leftProduct = (leftProduct == 0 ? 1 : leftProduct) * nums[i];
            rightProduct = (rightProduct == 0 ? 1 : rightProduct) * nums[n - 1 - i];

            maxProduct = Math.max(maxProduct, Math.max(leftProduct, rightProduct));
        }

        return maxProduct;
    }




    public static void main(String[] args) {
        int[] arr={-2,0,-1};
        System.out.println(maxProduct(arr));

        //System.out.println(-1*3);
    }
}
