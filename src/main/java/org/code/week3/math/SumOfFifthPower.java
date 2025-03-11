package org.code.week3.math;

public class SumOfFifthPower {


    static long sumOfFifthPowers(long N) {
        long sum=0;
        for(int i=1;i<=N;i++){
            sum += (long) Math.pow(i, 5);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfFifthPowers(989));
    }
}
