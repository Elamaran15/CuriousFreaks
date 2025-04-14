package org.code.practice.Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1539. Kth Missing Positive Number
Easy
Topics
Companies
Hint
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.



Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

https://leetcode.com/problems/kth-missing-positive-number/description/
 */
public class KthMissingPositiveNumber {

    public static int findKthPositive(int[] arr, int k) {
        List<Integer> missingNums=new ArrayList<>();


        for(int i=1;i<=arr[arr.length-1];i++){
            if(!isAvailable(arr,i)){
                missingNums.add(i);
            }
        }

        if(missingNums.isEmpty()){
            return arr[arr.length-1]+k;
        }

        if(missingNums.size()<k){
          int miss=arr[arr.length-1] - missingNums.size();
          return arr[arr.length-1]+miss;
        }

        return missingNums.stream().skip(k-1).findFirst().orElse(0);

    }


    static boolean isAvailable(int[] arr,int i){
        return Arrays.stream(arr).anyMatch(x -> x == i);
    }

    static int findKthPositiveBruteForce(int[] arr, int k){
        if(arr[0]>=k){
            return k;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }

    
   static int findMissingBruteForce(int[] arr, int k){
        int missingNum=0;
        int arrNum=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]-(i+1))<k){
                missingNum=arr[i]-(i+1);
                arrNum=arr[i];
            }
        }

        return (k-missingNum) + arrNum;
   }

    public static void main(String[] args) {
            int[] arr={1,13,18};
        System.out.println(findMissingBruteForce(arr,21));
    }
}
