package org.code.week6.binarySearchProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastOccurrences {


    public static ArrayList<Integer> find(int arr[], int x) {
       int i=0;
       int j=arr.length-1;
       boolean firstFlag=false;
       boolean lastFlag=false;
        ArrayList<Integer> list=new ArrayList<>();
        int firstNum=-1;
        int secondNum=-1;
       while(i<=j){
           if(!firstFlag){
               if(arr[i]==x){
                   firstNum=i;
                   firstFlag=true;
               }else {
                   i++;
               }
           }

           if(!lastFlag){
               if(arr[j]==x){
                   secondNum=j;
                   lastFlag=true;
               }else {
                   j--;
               }
           }

           if(lastFlag && firstFlag)
               break;
       }


       list.add(firstNum);
       list.add(secondNum);

       return list;
    }


    static ArrayList<Integer> findUsingBinarySearch(int arr[], int x) {
        ArrayList<Integer> list=new ArrayList<>();
        int first=binarySearch(arr,x,true);
       int  second=binarySearch(arr,x,false);
       list.add(first);
       list.add(second);
        return list;


    }

    private static int binarySearch(int[] arr,int x,boolean leftFlag) {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;

            if(leftFlag) {
                if (arr[mid] == x) {
                    ans = mid;
                    end=mid-1;
                }
                else if(arr[mid]<x)
                    start=mid+1;
                else
                   end = mid - 1;
            }else{
                if (arr[mid] == x) {
                    ans = mid;
                    start=mid+1;
                }
                else if(arr[mid]<x)
                    start=mid+1;
                else
                    end = mid - 1;
            }

        }
        return ans;
    }



    public static void main(String[] args) {
        int[] arr={1,3,5,5,5,5,6,7,123,125};
        findUsingBinarySearch(arr,5).forEach(System.out::println);

    }
}
