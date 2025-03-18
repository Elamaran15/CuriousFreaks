package org.code.week4.contest;

import java.util.Scanner;


/*
Multiply left and right array sum
Problem
Submissions
Leaderboard
Discussions
Pitsy needs help with the given task by her teacher. The task is to divide an array into two halves (left and right) containing n/2 elements each and do the sum of the each. half and then multiply both the sum. In case of odd number of elements, include the odd one in the second half.

Example1: arr =[1,2,3,4] Array has 4 elements so half is going to be 2 elements each, First half sum = 1 + 2 = 3 Second half sum = 3+ 4 = 7 So now to multiply them = 3 * 7 = 21

Example2: arr =[5,3,9,12,3] Array has 4 elements so half is going to be 2 elements each, First half sum = 5 + 3 = 8 Second half sum = 9 + 12 + 3 = 24 So now to multiply them = 8 * 24 = 192

Note: If the length of the array is odd then the right half will contain one element more than the left half.

Input Format

n=4, arr[ ] = {1, 2, 3, 4}

Constraints

1 ≤ n ≤ 1000 1 ≤ a[i] ≤ 100

Output Format

21

Sample Input 0

4
1 2 3 4
Sample Output 0

21
 */
public class Multiplyleftandrightarraysum {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int mid=arr.length/2;
        int firstHalf=0;
        int secondHalf=0;
        for(int i=0;i<n;i++){
            if(i<mid)
                firstHalf+=arr[i];
            else
                secondHalf+=arr[i];
        }
        System.out.println(firstHalf*secondHalf);
    }
}
