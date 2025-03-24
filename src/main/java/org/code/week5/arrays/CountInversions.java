package org.code.week5.arrays;

/*
Given an array of integers arr[]. Find the Inversion Count in the array.
Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum.

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
//https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
 */
public class CountInversions {

    static int inversionCount(int arr[]) {
       int countInversion=0;

       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j] && i<j)
                   countInversion++;
           }
       }
        return countInversion;
    }


    static int inversionCountUsingMergeLogic(int arr[]) {
       if(arr.length<=1) {
           return 0;
       }

        int start=0;
        int end=arr.length-1;
        return merge(arr,start,end);
    }

    static int merge(int[] arr,int start,int end){
        if(start>=end)
            return 0;

        int mid=start + (end-start)/2;
        int invCount = 0;
        invCount+=merge(arr,start,mid);
        invCount+=merge(arr,mid+1,end);
        invCount+=countInversion(arr,start,mid,end);
        return invCount;
    }

    private static int countInversion(int[] arr, int start, int mid, int end) {
        int left=start;
        int right=mid+1;
        int count=0;
        while(left<=mid && right<=end){
            if(arr[left]>arr[right] && left<right){
                count++;
            }
            left++;
        }

        while(left<=mid){
            if(arr[left]>arr[right] && left<right){
                count++;
            }
            left++;
        }
     return count;

    }


    static int recursion(int count,int i){
        if(i<0)
            return count;

        count++;
        return recursion(count,i-1);

    }

    public static void main(String[] args) {
       int[] arr={24 ,18, 38, 43, 14, 40, 1, 54};
       System.out.println(inversionCountUsingMergeLogic(arr));

        //System.out.println(recursion(0,5));
    }
}
