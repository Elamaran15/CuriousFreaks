package org.code.week5.searching;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {

    static int binarySearch(int[] arr,int searchNum){
        int low=0;
        int high=arr.length-1;

        while(low<=high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == searchNum)
                return mid;

            if (searchNum < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }


    static int binarySearchRegression(int[] arr,int searchNum,int low,int high){
        if(low>high)
            return -1;

        int mid = low + (high - low)/2;

        if(arr[mid]==searchNum)
            return mid;

        if(searchNum<arr[mid])
            return binarySearchRegression(arr,searchNum,low,mid-1);
        else
            return binarySearchRegression(arr,searchNum,mid+1,high);
    }

    static int binarySearchJava8(int[] arr,int searchNum){
       return IntStream.range(0,arr.length)
               .filter(value -> arr[value]==searchNum)
                .findFirst()
               .orElse(-1);
    }


    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearchJava8(arr,10));
    }
}
