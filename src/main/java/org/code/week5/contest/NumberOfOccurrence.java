package org.code.week5.contest;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOccurrence {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int k=in.nextInt();

        System.out.println(Arrays.stream(arr).filter(a->a==k).count());
    }
}
