package org.code.week8.contest1;

import java.util.Scanner;

public class PeekElement {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }


        if(arr[0]>arr[1]) {
            System.out.println(arr[0]);
            return;
        }

        if(arr[arr.length-1]>arr[arr.length-2]) {
            System.out.println(arr[arr.length - 1]);
            return;
        }


        int start=1;
        int end=arr.length-2;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]){
                System.out.println(arr[mid]);
                return;
            }

            if(arr[start]<=arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }


    }
}
