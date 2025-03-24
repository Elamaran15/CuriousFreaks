package org.code.week5.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*

Code
Testcase
Test Result
Test Result
349. Intersection of Two Arrays
Easy
Topics
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set =new HashSet<>();
      boolean iCheck=nums1.length<nums2.length;
      for(int i=0;i<Math.min(nums1.length, nums2.length);i++){
          for(int j=0;j<Math.max(nums1.length,nums2.length);j++){
              if(iCheck) {
                  if (nums1[i] == nums2[j]) {
                      set.add(nums1[i]);
                      break;
                  }
              }else{
                  if (nums1[j] == nums2[i]) {
                      set.add(nums1[j]);
                      break;
                  }
              }
          }
      }

     return set.stream().mapToInt(a->a).toArray();
    }

    public static void main(String[] args) {
        int[] num1={4,9,5};
        int[] num2={9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

}
