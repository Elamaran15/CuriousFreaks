package org.code.week4.recursion;

public class CountDigits {

    static int countDigits(int n){
        if(n%10==n)
            return 1;

        return 1 + countDigits(n/10);
    }


    public static void main(String[] args) {
        System.out.println(countDigits(12345));
    }
}
