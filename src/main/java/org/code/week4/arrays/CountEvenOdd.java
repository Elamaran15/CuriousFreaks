package org.code.week4.arrays;

import java.util.Arrays;

public class CountEvenOdd {


    static void countEvenAndOdd(int[] arr){
        int evenCount=0;
        int oddCount=0;

        for(int num : arr){
            if(num%2==0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even count :"+evenCount);
        System.out.println("Odd count :"+oddCount);
    }


    static void countEvenAndOddJava8(int[] arr){
        long evenCount=Arrays.stream(arr).filter(num-> num%2==0).count();
        long oddCount=Arrays.stream(arr).filter(num-> num%2!=0).count();

        System.out.println("Even count :"+evenCount);
        System.out.println("Odd count :"+oddCount);

    }

    public static void main(String[] args) {
        countEvenAndOddJava8(new int[]{1,2,3,4,5,6});
    }
}
