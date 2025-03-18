package org.code.week4.recursion;

public class Fibonoci {

    public static int nthFibonacci(int n) {
        if(n==1)
            return 1;

        if(n==0)
            return 0;

        return nthFibonacci(n-1) + nthFibonacci(n-2);

    }



    public static void main(String[] args) {
        System.out.println(nthFibonacci(4));
    }
}
