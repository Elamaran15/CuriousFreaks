package org.code.Week2;



//Given a number N, find the sum of first and last digit of N.

//Example 1:
//
//Input: N = 12345
//Output: 6
//Explanation: 1st and last digits are 1 and 5.

//https://www.geeksforgeeks.org/problems/corner-digits1317/1
public class GFGMath {
    public static int corner_digitSum(int n)
    {
        if(n>0) {
            if(((int) Math.log10(n) + 1)==1){
                return n;
            }

            int lastDigit = n % 10;
            while (n > 0) {
                n = n / 10;
                if ((int) Math.log10(n) + 1 == 1) {
                    return lastDigit + n;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(corner_digitSum(1));
    }

}
