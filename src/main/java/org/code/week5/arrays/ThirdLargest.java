package org.code.week5.arrays;

import java.util.Arrays;
import java.util.Comparator;

import static org.code.sorting.InsertionSort.swap;

public class ThirdLargest {
    static int thirdLargestJava8(int[] arr) {
        return Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2).findFirst().orElse(-1);
    }

    static int thirdLargest(int[] arr){
        if(arr.length<3)
            return -1;

        insertSort(arr);
        for(int j=0;j<3;j++){
            if(j==2)
                return arr[j];
        }

        return -1;
    }

    private static void insertSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j-1]>arr[j])
                    swap(arr,j-1,j);
                else
                    break;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(thirdLargest(arr));
    }

}
