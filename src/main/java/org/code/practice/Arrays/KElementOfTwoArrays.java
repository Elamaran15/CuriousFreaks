package org.code.practice.Arrays;

import java.util.Arrays;

public class KElementOfTwoArrays {

    public static int kthElementNormalMethod(int a[], int b[], int k) {
        int[] newArr=new int[a.length + b.length];
        int first=0;
        int second=0;
        int newPointer=0;
        while(first<a.length && second<b.length){
            if(a[first]<b[second]){
                newArr[newPointer]=a[first];
                newPointer++;
                first++;
            }else{
                newArr[newPointer]=b[second];
                newPointer++;
                second++;
            }
        }


        while(first<a.length){
            newArr[newPointer]=a[first];
            newPointer++;
            first++;
        }

        while(second<b.length){
            newArr[newPointer]=b[second];
            newPointer++;
            second++;
        }

        return newArr[k-1];
    }


    public static void main(String[] args) {
        int[] arr1={100, 112, 256, 349, 770};
        int[] arr2={72, 86, 113, 119, 265, 445, 892};

        System.out.println(kthElementNormalMethod(arr1,arr2,7));
    }
}
