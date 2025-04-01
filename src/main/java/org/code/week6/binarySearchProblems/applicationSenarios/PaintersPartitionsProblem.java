package org.code.week6.binarySearchProblems.applicationSenarios;

import java.util.Arrays;

/*
The Painter's Partition Problem-II
Difficulty: HardAccuracy: 27.52%Submissions: 131K+Points: 8
Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board.

Return the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered [2,3,4] or only board [1] or nothing but not boards [2,4,5].

Examples:

Input: arr[] = [5, 10, 30, 20, 15], k = 3
Output: 35
Explanation: The most optimal way will be: Painter 1 allocation : [5,10], Painter 2 allocation : [30], Painter 3 allocation : [20,15], Job will be done when all painters finish i.e. at time = max(5+10, 30, 20+15) = 35
Input: arr[] = [10, 20, 30, 40], k = 2
Output: 60
Explanation: The most optimal way to paint: Painter 1 allocation : [10,20,30], Painter 2 allocation : [40], Job will be complete at time = 60

https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1
 */
public class PaintersPartitionsProblem {


    public static  int minTime(int[] arr, int k) {
        int start= Arrays.stream(arr).max().orElse(0);
        int end=Arrays.stream(arr).sum();

        while(start<=end){
            int mid=start+(end-start)/2;

            int paintersRequried=findPainters(arr,mid);
            if(paintersRequried<=k)
                end=mid-1;
            else
                start=mid+1;
        }
        return start;
    }

    private static int findPainters(int[] arr, int mid) {
        int ans=0;
        int painterCount=1;
        for(int i=0;i<arr.length;i++){
            if(ans+arr[i]<=mid){
                ans+=arr[i];
            }else{
                ans=arr[i];
                painterCount++;
            }
        }
        return painterCount;
    }


    public static void main(String[] args) {
        int[] arr={100, 200, 300, 400};
        System.out.println(minTime(arr,1));
    }
}
