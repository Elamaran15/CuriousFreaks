package org.code.week3.math;

public class GCD {



    public static int gcd(int a, int b) {
        int greaterValue=0;

        if(a==b)
            return a;


        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
               greaterValue=i;
            }
        }
        return greaterValue;
    }

    public static void main(String[] args) {
        System.out.println(gcd(15,16));
    }
}
