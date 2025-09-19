package org.code.blind75.arrays.binarySearch;

import java.util.Arrays;
import java.util.Map;

public class FindMinimumRotatedSortedArray {


    static void find(int[] arr){
        int minIndex=findMinIndexBinarySearch(arr);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("Min index: "+minIndex);

        if(minIndex==0){
            System.out.println("Rotated time:"+ (arr.length));
        }else{
            System.out.println("Rotated time:"+ minIndex);
        }
    }

    private static int findMinIndexBinarySearch(int[] nums) {

        int start=0;
        int end=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start + (end-start) / 2;
            if(nums[start]<=nums[mid]){
                min= Math.min(min,nums[start]);
                start=mid+1;
            }else{
                min= Math.min(min,nums[mid]);
                end=mid-1;
            }
        }

        return min;
    }


    public static void main(String[] args) {
       int[] arr={1,2};

       find(arr);

    }
}
