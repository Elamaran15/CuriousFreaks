package org.code.week6.binarySearchProblems;


import java.util.List;

/*
Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times so that it will look like this:
After 1st Rotation : [9, 2, 4, 6]
After 2nd Rotation : [6, 9, 2, 4]

Examples:

Input: arr = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.
Input: arr = [1, 2, 3, 4, 5]
Output: 0
Explanation: The given array is not rotated.

https://www.geeksforgeeks.org/problems/rotation4723/1
 */
public class FindKthRotation {

    public static int findKRotation(List<Integer> arr) {
        int start=0;
        int end=arr.size()-1;

        if(arr.get(start)<=arr.get(end))
            return 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr.get(mid)<arr.get(mid-1))
                return mid;

            if(arr.get(start)>arr.get(mid))
                end=mid-1;
            else
                start=mid+1;
        }

        return 0;
    }


    static int finMin(List<Integer> arr){
      int start=0;
      int end=arr.size()-1;
      int n=arr.size()-1;
      while(start<end){
          int mid=start + (end-start)/2;

          if(mid>0 && arr.get(mid-1)>arr.get(mid))
              return mid;

          if(mid<n-1 && arr.get(mid) > arr.get(mid+1))
              return mid+1;

          if(arr.get(start)<=arr.get(mid)){
              start=mid+1;
          }else{
              end=mid;
          }
      }
      return start;
    }


    public static int findKRotation(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int n = arr.length;

        // If already sorted, return 0
        if (arr[start] <= arr[end])
            return 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the smallest element
            if (mid > 0 && arr[mid] < arr[mid - 1])
                return mid;

            // Check if mid+1 is the smallest element
            if (mid < n - 1 && arr[mid] > arr[mid + 1])
                return mid + 1;

            // Adjust search space
            if (arr[mid] >= arr[start])
                start = mid + 1; // Search right half
            else
                end = mid - 1;   // Search left half
        }

        return 0; // Default case
    }


    public static void main(String[] args) {
        int[] arr={8 ,10 ,21, 31, 43, 45};
        System.out.println(findKRotation(arr));
    }
}
