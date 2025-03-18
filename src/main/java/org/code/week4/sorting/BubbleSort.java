package org.code.week4.sorting;

import java.util.Arrays;

/*
Concept
Bubble Sort repeatedly compares adjacent elements in an array and swaps them if they are in the wrong order. This process continues until the entire array is sorted.

Algorithm Steps
Start from the first element and compare it with the next element.
If the first element is greater than the second, swap them.
Move to the next pair and repeat the process.
After one full pass through the array, the largest element will have "bubbled up" to its correct position at the end.
Repeat the process for the remaining elements until the array is sorted.
 */
public class BubbleSort {

    static void sortDesc(int[] arr){
       for(int i=0;i<arr.length-1;i++){
           for (int  j=0;j<arr.length-i-1;j++){
               if(arr[j]<arr[j+1])
                   swap(arr,j,j+1);
           }
       }
    }

    static void sortAsc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int  j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }

    //swap without third variable
    private static void swap(int[] arr, int j, int i) {
        arr[j]=arr[j] + arr[j+1];
        arr[j+1]=arr[j]-arr[j+1];
        arr[j]=arr[j] - arr[j+1];
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        sortDesc(arr);

        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("***************************");
        int[] arr1=new int[]{5,4,3,2,1};
        sortAsc(arr1);

        Arrays.stream(arr1).forEach(System.out::println);
    }
}
