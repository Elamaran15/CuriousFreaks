package org.code.week4.arrays;

import java.util.Arrays;

public class SmallestNum {

    static void findSum(int[] arr){
        int smallest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest)
                smallest=arr[i];
        }
        System.out.println("Smallest nums:"+smallest);
    }

    static void findSumJava8(int[] arr){
        int smallest= Arrays.stream(arr).min().orElse(0);
        System.out.println("Smallest nums:"+smallest);
    }

    public static void main(String[] args) {
        findSum(new int[]{5,7,34,67,2,56,5,8});
    }
}
