package org.code.week5.contest;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr consisting of only 0's and 1's in random order. Modify the array to segregate 0s onto the left side and 1s onto the right side of the array.

Input Format

n = 5 arr[] = [0, 0, 1, 1, 0]

Constraints

1 ≤ arr.size() ≤ 100000

Output Format

0, 0, 0, 1, 1

Sample Input 0

5
0 1 0 1 0
Sample Output 0

0 0 0 1 1
 */
public class Segregate0sAnd1 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }

        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
