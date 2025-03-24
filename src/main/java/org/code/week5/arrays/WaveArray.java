package org.code.week5.arrays;

import java.util.Arrays;

/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
If there are multiple solutions, find the lexicographically smallest one.

Note: The given array is sorted in ascending order, and you don't need to return anything to change the original array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
 */
public class WaveArray {

    public static void convertToWave(int[] arr) {
        if(arr.length<=1)
            return;
        int i=0;
        int j=1;
        while(j<arr.length){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=i+2;
            j=j+2;
        }
    }

    public static void main(String[] args) {
        int[] arr={2, 4, 7, 8, 9, 10};
        convertToWave(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
