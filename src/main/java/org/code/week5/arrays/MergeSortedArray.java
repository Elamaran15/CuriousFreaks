package org.code.week5.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
/*
88. Merge Sorted Array
Easy
Topics
Companies
Hint
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.



Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     if(n==0)
         return;

     int indexNums1=0;
     int indexNums2=0;
     int[] tempArr=new int[nums1.length];
     int tempIndex=0;

     while(indexNums1<nums1.length && indexNums2<nums2.length){

         if(nums1[indexNums1]<nums2[indexNums2] && nums1[indexNums1] !=0){
             tempArr[tempIndex]=nums1[indexNums1];
             tempIndex++;
             indexNums1++;
         }else{
             tempArr[tempIndex]=nums2[indexNums2];
             tempIndex++;
             indexNums2++;
         }

     }

     while(indexNums1<nums1.length){
         if(nums1[indexNums1] !=0) {
             tempArr[tempIndex] = nums1[indexNums1];
             tempIndex++;
         }
         indexNums1++;
     }




     System.arraycopy(tempArr,0,nums1,0,tempArr.length);
     Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void mergeSort(int[] num1,int m,int[] num2,int n){
        if(n==0)
            return;


       int index1=m-1;
       int index2=n-1;
       int pointer=m+n-1;

       while(index1>=0 && index2 >=0){
           if(num1[index1]<num2[index2]){
               num1[pointer]=num2[index2];
               index2--;
               pointer--;
           }else{
               num1[pointer]=num1[index1];
               index1--;
               pointer--;
           }
       }

       while(index2 >=0){
           num1[pointer]=num2[index2];
           index2--;
           pointer--;
       }

       Arrays.stream(num1).forEach(System.out::print);
    }

    public static void main(String[] args) {
        int[] nums1={0,0,0,0,0};
        int[] nums2={1,2,3,4,5};

        mergeSort(nums1,0,nums2,5);
    }

}
