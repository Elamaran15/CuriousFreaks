package org.code.blind75.arrays;

/*
217. Contains Duplicate
Solved
Easy
Topics
premium lock icon
Companies
Given an integer array nums,
return true if any value appears at least twice in the array,
and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

https://leetcode.com/problems/contains-duplicate/description/
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public static boolean containsDuplicateUsingMap(int[] nums) {
        Map<Integer, Long> ans=Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return  ans.values().stream().anyMatch(aLong -> aLong>1);
    }

    public static boolean containsDuplicateUsingSet(int[] nums){
        Set<Integer> ans=new HashSet<>();
        for(int n:nums){
            if(!ans.add(n)){
                return  true;
            }
        }
        return false;
    }



    //practice 12-09-25
    static boolean usingTwoPointer(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }


    //practice using hashmap
    //12-09-25
    static boolean checkUsingMap(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])!=null){
                return true;
            }else{
                map.put(arr[i],i);
            }
        }

        return false;

    }





    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(checkUsingMap(arr));
    }
}
