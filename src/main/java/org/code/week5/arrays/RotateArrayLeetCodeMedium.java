package org.code.week5.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/description/
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

189. Rotate Array

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArrayLeetCodeMedium {

    public static void rotate(int[] nums, int k) {
       for(int i=1;i<=k;i++){
           int pointer=nums.length-2;
           int tempLastIndexValue=nums[nums.length-1];
           while(pointer>=0){
               nums[pointer+1]=nums[pointer];
               pointer--;
           }
           nums[0]=tempLastIndexValue;
       }
        System.out.println("******************************");
        Arrays.stream(nums).forEach(System.out::print);
    }

    public static void rotateSecondApproach(int[] nums, int k) {
        if(nums.length==1)
            return;

        int[] tempArray=new int[nums.length];
        int pointer=0;


        for(int i=k;i<nums.length;i++){
            tempArray[pointer]=nums[i];
            pointer++;
        }

        for(int j=0;j<k;j++){
            tempArray[pointer]=nums[j];
            pointer++;
        }
        System.arraycopy(tempArray,0,nums,0,nums.length);
        Arrays.stream(nums).forEach(System.out::println);
    }


    static void rotateOptimised(int[] nums, int k){
        k=k%nums.length;  //if nums.length == 2,k=4 no use of rotating 4 times so length 2
        int[] temp=new int[k];

        System.arraycopy(nums, 0, temp, 0, k);

        for(int i=0;i<nums.length-k;i++){
            nums[i] = nums[k+i];
        }

        for(int i=nums.length-k;i<nums.length;i++){
            nums[i]=temp[i - (nums.length-k)];
        }
    }


    public static void Rotatetoleft(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }

    static void rotateFinalSolution(int[] nums, int k){
        int n=nums.length;
        k = k % n;
        if (n == 0)
            return;


        if (k > n)
            return;
        int nk=n-k;


        int[] temp=new int[nk];

        for(int i=0;i<nk;i++){
            temp[i]=nums[i];
        }

        for(int i=0;i<k;i++){
            nums[i]=nums[nk+i];
        }

        for(int i=0;i<temp.length;i++){
            nums[k+i]=temp[i];
        }

        Arrays.stream(nums).forEach(System.out::println);


    }


    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7};
        rotateFinalSolution(arr,3);
    }
}
