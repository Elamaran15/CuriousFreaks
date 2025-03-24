package org.code.week5.arrays;

import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
/*
Rotate Array by One


Given an array arr, rotate the array by one position in clockwise direction.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
 */

public class RotateArrayClockWise {

   //with extra space
    public static void rotate(int[] arr) {
        int[] tempArr=new int[arr.length];

        for(int i=0;i<tempArr.length;i++){
            if(i==0)
                tempArr[i]=arr[arr.length-1];
            else{
                tempArr[i]=arr[i-1];
            }
        }
        Arrays.stream(tempArr).forEach(System.out::println);
    }


    static void rotateOptimised(int[] arr){
        int pointer=arr.length-2;
        int temp=arr[arr.length-1];
        while(pointer>=0){
            arr[pointer+1]=arr[pointer];
            pointer--;
        }
        arr[0]=temp;
        Arrays.stream(arr).forEach(System.out::println);
    }


    public static void main(String[] args) {
        rotateOptimised(new int[]{9, 8, 7, 6, 4, 2, 1, 3});
    }
}
