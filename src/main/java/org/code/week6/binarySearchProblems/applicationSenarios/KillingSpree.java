package org.code.week6.binarySearchProblems.applicationSenarios;


/*
Killing Spree
Difficulty: MediumAccuracy: 48.32%Submissions: 13K+Points: 4
There are Infinite People Standing in a row, indexed from 1.
A person having index 'i' has strength of (i*i).
You have Strength 'P'. You need to tell what is the maximum number of People You can Kill With your Strength P.
You can only Kill a person with strength 'X' if P >= 'X'  and after killing him, Your Strength decreases by 'X'.


Example 1:

Input:
N = 14
Output: 3
Explanation:
The strengths of people is 1, 4, 9, 16, ....
and so on. WE can kill the first 3 person ,
after which our Power becomes 0 and we cant
kill anyone else. So answer is 3


Example 2:

Input:
N = 10
Output: 2

Your Task:
You don't need to read input or print anything. Your task is to complete the function killinSpree() which takes the integer N as input parameters and returns the maximum Number of People You can kill.

Expected Time Complexity: O(log(n))
Expected Auxiliary Space: O(1)

https://www.geeksforgeeks.org/problems/killing-spree3020/0
 */
public class KillingSpree {

    static long killinSpree(long n)
    {
        long start=1;
        long end=(long)Math.sqrt(n);


        while(start<=end){
            long mid=start + (end-start)/2;
            long sqValue=(mid * (mid+1)*((2L *mid) +1))/6;
            if(n>=sqValue){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return end;
    }





    public static void main(String[] args) {
      long min= (long)Math.sqrt(12);

        System.out.println(killinSpree(1000000000000l));
    }
}
