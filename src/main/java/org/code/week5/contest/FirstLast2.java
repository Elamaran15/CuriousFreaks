package org.code.week5.contest;

import java.util.Scanner;

public class FirstLast2 {

    static void binarySearch(int[] arr, int searchNum) {
        int low = 0;
        int high = arr.length - 1;
        boolean flag = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == searchNum) {
                System.out.println(mid);
                flag = true;
            }
            if (searchNum <= arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        if (!flag) {
            System.out.println(-1);
        }
    }

    static void findFirstAndLast(int[] arr,int k) {

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                if (first == -1) {
                    first = i;
                } else {
                    last = i;
                }
            }
        }

        if (first == -1) {
            System.out.println(-1);
        } else {
            System.out.println(first);
            System.out.println(last);
        }

    }


    public static void main(String[] args) {

    }
}
