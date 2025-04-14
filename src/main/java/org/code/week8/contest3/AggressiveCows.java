package org.code.week8.contest3;

import java.util.Arrays;
import java.util.Scanner;

/*
You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

Input: stalls[] = [1, 2, 4, 8, 9], k = 3 Output: 3 Explanation: The first cow can be placed at stalls[0], the second cow can be placed at stalls[2] and the third cow can be placed at stalls[3]. The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.

Input Format

n = 5 stalls[] = [1, 2, 4, 8, 9], k = 3

Constraints

2 <= stalls.size() <= 106

Output Format

3

Sample Input 0

5
10 1 2 7 5
3
Sample Output 0

4
 */
public class AggressiveCows {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }

        int k=in.nextInt();

        Arrays.sort(a);

        int start=1;
        int end=a[a.length-1]-a[0];

        while(start<=end){
            int mid=start + (end-start)/2;

            if(isCowCanBePlaced(a,mid,k)){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        System.out.println(end);
    }
    private static boolean isCowCanBePlaced(int[] stalls, int mid, int k) {
        int countCows=1;
        int lastCow=stalls[0];

        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-lastCow >=mid){
                countCows++;
                lastCow=stalls[i];
            }

            if(countCows>=k)
                return true;
        }
        return false;
    }


}
