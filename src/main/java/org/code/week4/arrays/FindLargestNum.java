package org.code.week4.arrays;

import java.util.Arrays;

public class FindLargestNum {


    static void findLargestNum(int[] arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i])
                largest=arr[i];
        }
        System.out.println("Largest number in an array: "+largest);
    }

    static void findLargestNumJava8(int[] arr){
        int largest=Arrays.stream(arr).max().orElse(0);
        System.out.println("Largest number in an array: "+largest);
    }

    public static void main(String[] args) {
        findLargestNumJava8(new int[]{1,9,3,4,5,6});
    }
}
