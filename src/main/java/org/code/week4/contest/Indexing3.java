package org.code.week4.contest;

import java.util.Scanner;

/*
Given an array arr. Your task is to find the elements whose value is equal to that of its index value.

Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 0-based indexing of the array.

Example: n = 6 arr = [3, 1, 2, 35,39, 5] Output 1 2 5

So here the array index starts from 0, and the values equal to the index are 1, 2 , 5 That is a[1] = 1, a[2] = 2, a[5] = 5

Input Format

n = 6 arr = [3, 1, 2, 35,39, 5]

Constraints

1<=n<=100

Output Format

1 2 5

Sample Input 0

5
0 1 2 3 4
Sample Output 0

0
1
2
3
4
 */
public class Indexing3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j=0;j<n;j++){
            if(arr[j]==j)
                System.out.println(j);
        }



    }
}
