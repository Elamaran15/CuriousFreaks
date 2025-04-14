package org.code.practice.Arrays;


/*
4. Median of Two Sorted Arrays
Hard
Topics
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 */
public class MedianOfTwoSortedArrays {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] newArr=new int[nums1.length+nums2.length];

      int first=0;
      int second=0;
      int newPointer=0;

      while(first<nums1.length && second<nums2.length){
          if(nums1[first]<=nums2[second]){
              newArr[newPointer]=nums1[first];
              first++;
              newPointer++;
          }else{
              newArr[newPointer]=nums2[second];
              second++;
              newPointer++;
          }
      }

      while(first<nums1.length){
          newArr[newPointer]=nums1[first];
          first++;
          newPointer++;
      }

      while(second<nums2.length){
          newArr[newPointer]=nums2[second];
          second++;
          newPointer++;
      }
      int mid=(newArr.length - 1) / 2;
      if(newArr.length%2==1){
          return newArr[mid];
      }else{
          return ( (double) (newArr[mid] + (newArr[mid+1])) / 2);
      }
    }


    public static void main(String[] args) {
        int[] arr1={1,2};
        int[] arr2={3,4};


        System.out.println(findMedianSortedArrays(arr1,arr2));



    }
}
