package org.code.week5.arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {

    //FOR Leetcode
    public static void moveZeroes(int[] nums) {
        if(nums.length<=1)
            return;

      int i=0;
      int j=1;

      while(j<nums.length){
          if(nums[j]!=0 && nums[i]==0){
              swap(nums,j,i);
              i++;
              j++;
          } else if (nums[j]==0 && nums[i]==0) {
              j++;
          }else{
              i++;
              j++;
          }
      }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    //FOD GFG
    void pushZerosToEnd(int[] arr) {
        if(arr.length<=1)
            return;

        int i=0;
        int j=1;

        while(j<arr.length){
            if(arr[j]!=0 && arr[i]==0){
                swap(arr,j,i);
                i++;
                j++;
            } else if (arr[j]==0 && arr[i]==0) {
                j++;
            }else{
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={0};
        moveZeroes(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
