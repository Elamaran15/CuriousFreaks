package org.code.Week2;

//Print the Kth Digit
//Given two numbers A and B, find Kth digit from right of AB.
//
//
//Example 1:
//
//Input:
//A = 3
//B = 3
//K = 1
//Output:
//7
//Explanation:
//33 = 27 and 1st
//digit from right is
//7

//https://www.geeksforgeeks.org/problems/print-the-kth-digit3520/0
public class RightDigitGFG {


    static long kthDigit(int A,int B,int K){
        long value=(long)Math.pow(A,B);

        if((int)Math.log10(value)+1==1){
            return value;
        }

        if(K>(int)Math.log10(value)+1){
           return 0L;
        }


        int count=1;

        while(value>0){

            long lastDigit=value%10;
            if(count==K){
                return lastDigit;
            }else{
                value=value/10;
                count++;
            }
        }

        return 0;

    }


    public static void main(String[] args) {
        System.out.println(kthDigit(3,3,1));
    }
}
