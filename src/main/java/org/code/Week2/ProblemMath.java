package org.code.Week2;

public class ProblemMath {


    static void countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }

    static void countDigitsUsingMath(int n){
        System.out.println((int)Math.log10(n)+1);
    }


    public static void main(String[] args) {
        countDigitsUsingMath(12345);
    }
}
