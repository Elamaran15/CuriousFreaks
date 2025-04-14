package org.code.week8.contest3;


import java.util.Arrays;
import java.util.Scanner;

/*
You are given two unsorted arrays a[] and b[]. Both arrays may contain duplicate elements. For each element in a[], your task is to count how many elements in b[] are less than or equal to that element. n is the size of a array and m is the size of b array.

Input:n =6, a[] = [1, 2, 3, 4, 7, 9], m = 6, b = [0, 1, 2, 1, 1, 4] Output: [4, 5, 5, 6, 6, 6] Explanation: For a[0] = 1, there are 4 elements in b (0, 1, 1, 1) that are ≤ 1. For a[1] = 2, there are 5 elements in b (0, 1, 1, 1, 2) that are ≤ 2. For a[2] = 3, there are 5 elements in b that are ≤ 3. Similarly, for a[3] = 4, there are 6 elements in b that are ≤ 4, and for a[4] = 7 and a[5] = 9, there are also 6 elements in b that are ≤ 7 and ≤ 9, respectively.

Input Format

n = 6 a[] = [1, 2, 3, 4, 7, 9], m = 6 b = [0, 1, 2, 1, 1, 4]

Constraints

1 ≤ a.size(), b.size() ≤ 105

Output Format

4, 5, 5, 6, 6, 6

Sample Input 0

5
4 8 7 5 1
7
4 48 3 0 1 1 5
Sample Output 0

5, 6, 6, 6, 3
 */
public class CountingElementsInTwoArraysThree {





    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }


        int nB=in.nextInt();
        int[] b=new int[nB];
        for(int i=0;i<b.length;i++){
            b[i]=in.nextInt();
        }


        for(int i=0;i<a.length;i++){
            int count=0;
            Arrays.sort(b);
            for(int j=0;j<b.length;j++){
                if(b[j]<=a[i]){
                    count++;
                }else{
                    break;
                }
            }
            if(i!=a.length-1)
             System.out.print(count +", ");
            else
                System.out.print(count);
        }



    }
}
