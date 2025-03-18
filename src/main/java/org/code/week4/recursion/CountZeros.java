package org.code.week4.recursion;

public class CountZeros {


    static int countZero(int n){
        int d=n%10;
        if(d==n){
            if(d==0)
                return 1;
            else
                return 0;
        }

        if(d==0)
            return 1 + countZero(n/10);
        else
            return countZero(n/10);
    }


    public static void main(String[] args) {
        System.out.println(countZero(20300));
    }
}
