package org.code.blind75.arrays;

import java.util.Arrays;


/*
238. Product of Array Except Self
Solved
Medium
Topics
premium lock icon
Companies
Hint

Given an integer array nums, return an array answer such that answer[i] is equal to the
product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

https://leetcode.com/problems/product-of-array-except-self/description/

 */

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
       int[] newArr=new int[nums.length];
       int newIndex=0;

       for(int i=0;i<nums.length;i++){
           int product=1;
           for(int j=0;j<nums.length;j++){
               if(j!=i){
                   product=product*nums[j];
               }
           }
           newArr[newIndex]=product;
           newIndex++;
       }
       return newArr;
    }

    public static int[] productExceptSelfOptimised(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1 & 2: Calculate left products and store them in the answer array
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct; // Store the product of elements to the left of current index
            leftProduct *= nums[i];   // Update leftProduct for the next iteration
        }

        // Step 3: Calculate right products and multiply with left products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct; // Multiply current left product with product of elements to the right
            rightProduct *= nums[i];    // Update rightProduct for the next iteration
        }

        return answer;
    }



    //practice 12-09-25
    static int[] check(int[] arr){
        int[] newArr=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    product=product*arr[j];
                }
            }

            newArr[i]=product;
        }

        return newArr;
    }

    //15-09-25 practice
    static void findProd(int[] arr){
        int[] newArr=new int[arr.length];
        int arrLength=arr.length;
        int leftProd=1;
        for(int i=0;i<arrLength;i++){
            newArr[i]=leftProd;
            leftProd=leftProd*arr[i];
        }

        int rightProd=1;
        for(int i=arrLength-1;i>=0;i--){
            newArr[i]=newArr[i] * rightProd;
            rightProd=rightProd * arr[i];
        }

        Arrays.stream(newArr).forEach(System.out::println);


    }



    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        //Arrays.stream(productExceptSelfOptimised(arr)).forEach(System.out::println);

        findProd(arr);

    }
}
