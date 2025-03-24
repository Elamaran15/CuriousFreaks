package org.code.week5.arrays;
//https://www.geeksforgeeks.org/problems/second-largest3735/1

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/*
Second Largest
Difficulty: EasyAccuracy: 26.72%Submissions: 1.1MPoints: 2Average Time: 15m
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
 */
public class SecondLargest {

    public static int getSecondLargestJava8(int[] arr) {
         return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
                 .distinct()
                 .skip(1)
                 .findFirst()
                 .orElse(-1);
    }

    public static int getSecondLargest(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }

        int secondMax=0;

        for(int j=0;j<arr.length;j++){
            if(secondMax<arr[j] && arr[j]!=max)
                secondMax=arr[j];
        }

        return secondMax;
    }


    static int getSecondLargestOptimised(int[] arr){
        if(arr.length<2) return -1;

        int firstMax=-1;
        int secondMax=-1;
        for(int i:arr){
            if(firstMax<i){
                secondMax=firstMax;
                firstMax=i;
            }
            else if(secondMax < i && i < firstMax){
                secondMax=i;
            }
        }
        return secondMax;
    }




    public static void main(String[] args) {
        int[] arr = {10,10,10};
        System.out.println(getSecondLargestOptimised(arr));
    }
}
