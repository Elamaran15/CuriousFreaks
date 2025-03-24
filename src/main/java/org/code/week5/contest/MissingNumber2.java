package org.code.week5.contest;

import java.util.Scanner;
/*
You are given an array arr of size n - 1
that contains distinct integers in the range
from 1 to n, in sorted order. Since there are only n-1 numbers in array,
there is one number missing from 1 to n. You need to find the number.arr[] = [1, 2, 3, 5]

Input Format

n = 5 arr[] = [1, 2, 3, 5]

Constraints

1 ≤ arr.size() ≤ 100000

Output Format

4

Sample Input 0

5
1 2 4 5
Sample Output 0

3
 */
public class MissingNumber2 {

    static void missingBruteForce(){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
                System.out.println(i+1);
        }
    }

    static void missingNumMaths(int[] arr){
        int n=arr.length;

        int totalNum=n*(n+1)/2;

        int arrSum=0;

        for(int num:arr){
            arrSum+=num;
        }

        System.out.println("Missing number in an array"+ (totalNum - arrSum));

    }

    public static int findMissingNumber(int[] arr, int n) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If the value at mid index is not equal to mid + 1, missing number is on the left
            if (arr[mid] != mid + 1) {
                high = mid - 1;
            } else {
                low = mid + 1; // Otherwise, search on the right side
            }
        }

        return low + 1; // The missing number
    }

    public static void main(String[] args) {
      int[] arr={1, 2, 3, 5,5};
        System.out.println(findMissingNumber(arr,arr.length));
    }
}
