package org.code.week5.arrays;
/*
//https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array such that all the distinct elements come at the beginning of the original array.

Examples :

Input: arr = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return 1 after modifying the array, the driver code will print the modified array elements.
 */
public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] arr) {
        if(arr.length<1)
            return arr.length;

        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                j++;
                i++;
            }else{
                j++;
            }
        }

        return i+1;
    }

    //Leetcode problem
    /*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    public static int removeDuplicatesLeetCode(int[] nums) {
        if(nums.length<1)
            return nums.length;

          int i=0;
          int j=1;
          while(j<nums.length){
              if(nums[i]!=nums[j]){
                  nums[i+1]=nums[j];
                  j++;
                  i++;
              }else{
                  j++;
              }
          }

          return i+1;

    }

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesLeetCode(arr));
    }
}
