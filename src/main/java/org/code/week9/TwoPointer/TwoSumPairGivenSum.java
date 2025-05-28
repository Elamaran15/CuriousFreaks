package org.code.week9.TwoPointer;

import java.util.Arrays;

public class TwoSumPairGivenSum {


   static boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int diff = arr[i] + arr[j];
            if(diff==target){
                return true;
            }
            else if(diff<target){
                i++;
            }else{
                j--;
            }
        }

        return false;
    }


    public static void main(String[] args) {
       int[] arr={11};
       int target=11;
        System.out.println(twoSum(arr,target));
    }
}
