package org.code.practice.Arrays;

import java.util.Arrays;

public class CeilTheFloor {


    public static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int[] ans=new int[2];
        if(arr.length>1){
            if(arr[0]>x){
                ans[0]=-1;
            }else{
                ans[0]=findFloor(arr,x);
            }

            if(arr[arr.length-1]<x){
                arr[1]=-1;
            }else{
                ans[1]=findCeil(arr,x);
            }
        }
         return ans;
    }

    private static int findCeil(int[] arr, int x) {
        int start=0;
        int end=arr.length-1;
        int ceil=arr[end];
        while(start<end){
            int mid=start + (end-start)/2;
            if(arr[mid]>=x && ceil>=arr[mid]){
                ceil=arr[mid];
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ceil;

    }

    private static int findFloor(int[] arr, int x) {
        int start=0;
        int end=arr.length-1;
        int floor=arr[start];
        while(start<end){
            int mid=start + (end-start)/2;
            if(arr[mid]<=x && floor<=arr[mid]){
                floor=arr[mid];
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return floor;
    }


    public static void main(String[] args) {
        int[] arr={5, 6, 8, 8, 6, 5, 5, 6};
        Arrays.stream(getFloorAndCeil(10,arr)).forEach(System.out::println);
    }
}
