package org.code.week4.recursion;

public class PrintUpToN {


    static void printN(int n){
        if(n<1)
            return;

        System.out.println(n);
        printN(n-1);
    }

    static void printNFrom1(int n){
        if(n<1)
            return;

        printN(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        printNFrom1(10);
    }
}
