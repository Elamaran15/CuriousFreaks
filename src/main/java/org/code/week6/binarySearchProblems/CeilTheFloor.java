package org.code.week6.binarySearchProblems;

import java.util.Arrays;

/*
Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].

Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.

Examples:

Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
Output: 6, 8
Explanation: Floor of 7 is 6 and ceil of 7 is 8.

Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6]
Output: 8, -1
Explanation: Floor of 10 is 8 but ceil of 10 is not possible.
 */
public class CeilTheFloor {

    public static int[] getFloorAndCeil(int x, int[] arr) {
        int floorValue=-1;
        int floor=-1;
        int cielValue=-1;
        int ciel=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x && (floor==-1 || x-arr[i]<floor)){
                floorValue=arr[i];
                floor=x-arr[i];
            }else if(arr[i]>=x && (ciel==-1 || arr[i]-x<ciel)){
                cielValue=arr[i];
                ciel=arr[i]-x;
            }
        }
        return new int[]{floorValue,cielValue};

    }

    public static int[] getFloorAndCeilUsingSort(int x, int[] arr){
        Arrays.sort(arr);
        int floor=-1;
        int ciel=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                floor=arr[i];
            }
        }

        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]>=x){
                ciel=arr[j];
            }
        }
        return new int[]{floor,ciel};
    }

    public static int[] getFloorAndCeilUsingBinarySearch(int x, int[] arr){
        int start=0;
        int end=arr.length-1;


        int floor=-1;
        int ciel=-1;
        int mid=0;
        boolean ansFoundFlag=false;

        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==x){
                ansFoundFlag=true;
                break;
            }

            if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        if(ansFoundFlag)
            return new int[]{x,x};

        if(arr[0]>x) {
            floor=-1;
        }else{
            floor=arr[end];
        }

        if(arr[arr.length-1]<x) {
            ciel=-1;
        }else{
            ciel=arr[start];
        }

        return  new int[]{floor,ciel};
    }




    public static void main(String[] args) {

        int[] arr={5,6,8,9,6,5,5,6};
        int x=7;
        Arrays.sort(arr);

//         int i= 6 + (7-6)/2;
//        System.out.println(i);
//         Arrays.stream(arr)
//                 .forEach(System.out::print);


        Arrays.stream(getFloorAndCeilUsingBinarySearch(x,arr)).forEach(System.out::println);

    }
}
