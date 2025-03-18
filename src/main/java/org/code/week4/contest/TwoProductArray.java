package org.code.week4.contest;

import java.util.Scanner;

/*
Given two arrays (Get first input for one array and then again get for the other array), find if the product of two array are same. If same, print 1 else print 0. First get n which is the number of elements in both the array(both arrays has same number of elements)

Example - arr1 = [4, 1, 3, 9, 3] arr2 = [2, 9, 4, 4, 2]

Output: 0

Explanation: Product of arr1 = 4* 1* 3* 9* 3 = 324 Product of arr2 = 2* 9* 4* 4* 2 = 576 So 324 is not equal to 576

Input Format

n = 5 arr1 = [4, 1, 3, 9, 3] arr2 = [2, 9, 4, 4, 2]

Constraints

0<=n<=1000

Output Format

0

Sample Input 0

2
2 3
3 1
Sample Output 0

0
 */
public class TwoProductArray {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];


        //for arr1
        int productArrayOne=1;
        int productArrayTwo=1;
        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
            productArrayOne*=arr1[i];
        }
        System.out.println("Product One:"+productArrayOne);
        for(int j=0;j<n;j++){
            arr2[j]=in.nextInt();
            productArrayTwo*=arr2[j];
        }
        System.out.println("Product Two:"+productArrayTwo);
        System.out.println( productArrayOne==productArrayTwo ? 1:0);
    }
}
