package org.code.week3.math;

//Consider a sample space consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number n, you have to find the number of integers less than n in the sample space.
//
//Examples :
//
//Input: n = 9
//Output: 2
//Explanation: 1 and 4 are the only Perfect Squares less than 9. So, the Output is 2.
//Input: n = 3
//Output: 1
//Explanation: 1 is the only Perfect Square less than 3. So, the Output is 1.

//https://www.geeksforgeeks.org/problems/count-squares3649/1
public class CountSquares {

    static int countSquares(int n) {
        int count=0;
        int i=1;
        while(i<n){
            int powValue=(int)Math.pow(i,2);
            if(powValue<n){
                count++;
                i++;
            }else{
                break;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSquares(100));
    }
}
