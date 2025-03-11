package org.code.week3.arrays;

import java.util.Arrays;

public class PrintAllNums {

    static void printArray(int arr[]) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    static void printArrayJava8(int arr[]){
        Arrays.stream(arr)
                .forEach(j->{
                System.out.print(j);
                System.out.print(" ");
        });
    }


    public static void main(String[] args) {
        printArrayJava8(new int[]{1,2,3,4,5});
    }
}
