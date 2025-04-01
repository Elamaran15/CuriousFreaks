package org.code.week6.binarySearchProblems.Contest;

import java.util.Scanner;

public class MaximumSortedArray {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        int start=0;
        int end=arr.length-1;
        int max=Integer.MIN_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[start]<=arr[mid]){
                max=Math.max(arr[mid],max);
                start=mid+1;
            }else{
                max=Math.max(arr[end],max);
                end=mid-1;
            }
        }

        System.out.println(max);
    }
}
