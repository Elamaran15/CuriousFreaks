package org.code.sorting;

import java.util.Arrays;

/*
1. At every pass left part of the array is getting sorted
2. Start from the second element compare it with the previous element
3. Swap if previous element is large, break if previous element is small.
 */
public class InsertionSort {

    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j])
                    swap(arr,j-1,j);
                else
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }


    public static void main(String[] args) {
        int[] arr1=new int[]{5,4,3,2,1};
        sort(arr1);

        Arrays.stream(arr1).forEach(System.out::println);
    }
}
