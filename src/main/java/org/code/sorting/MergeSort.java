package org.code.sorting;

import java.util.Arrays;

public class MergeSort {

       public static void mergeSort(int[] arr,int start,int end){
           if(start>=end)
               return;

           int mid=start + (end-start)/2;
           mergeSort(arr,start,mid);
           mergeSort(arr,mid+1,end);
           mergeArray(arr,start,mid,end);
       }

    private static void mergeArray(int[] arr, int start, int mid, int end) {
           int leftStartIndex=start;
           int rightStartIndex=mid+1;
           int[] temp=new int[end-start+1];
           int tempIndex=0;
           while(leftStartIndex<=mid && rightStartIndex<=end){
               if(arr[leftStartIndex]<=arr[rightStartIndex]){
                   temp[tempIndex]=arr[leftStartIndex];
                   tempIndex++;
                   leftStartIndex++;
               }else{
                   temp[tempIndex]=arr[rightStartIndex];
                   tempIndex++;
                   rightStartIndex++;
               }
           }

           while(leftStartIndex<=mid){
               temp[tempIndex]=arr[leftStartIndex];
               tempIndex++;
               leftStartIndex++;
           }

           while(rightStartIndex<=end){
               temp[tempIndex]=arr[rightStartIndex];
               tempIndex++;
               rightStartIndex++;
           }

           System.arraycopy(temp,0,arr,start,temp.length);

    }


//    public static void main(String[] args) {
//           int[] arr={5,4,3,2,1};
//        mergeSort(arr,0,arr.length-1);
//
//        Arrays.stream(arr).forEach(System.out::println);
//    }
}
