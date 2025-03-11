package org.code.week3.math;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class FactorialNum {

    static int factorial(int n) {
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial *=i;
        }
       return factorial;
    }


    static int factorialNum(int n){
      return IntStream
              .rangeClosed(1,n)
              .reduce(1,(a,b) ->a*b);
    }


    public static void main(String[] args) {
        System.out.println(factorialNum(4));
    }
}
