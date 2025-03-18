package org.code.week4.recursion;

public class PowerOfNum {

    static int power(int num,int power){
        if(power<=1)
            return num;

        return num * power(num,power-1);
    }



    public static void main(String[] args) {
        System.out.println(power(5,2));
    }
}
