package org.code.week5.arrays;

import java.util.Arrays;

public class MoveAllNegativeElementsToBegin {


    static int[] moveToBegin(int[] arr){
        if(arr.length<=1)
            return arr;

        int first=0;
        int second=1;

        while(second< arr.length){
            if(arr[first]>0 && arr[second]<0){
                swap(arr,first,second);
                first++;
                second++;
            }else{
                first++;
                second++;
            }
        }


        return arr;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int[] arr={-12,-11,-13,6,-7,-6};

        Arrays.stream(moveToBegin(arr)).forEach(System.out::println);
    }
}
