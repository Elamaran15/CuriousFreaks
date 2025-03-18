package org.code.week4.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintDivisionOfNumber {

    static void sum(int n, int index, List<Integer> list){
        if(index>=Math.sqrt(n)+1)
            return;

        if(n%index==0)
            list.add(index);

        if((n/index) % index == 0)
            list.add(n/index);

        sum(n,index+1,list);
    }


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        sum(12,1,list);
        list.forEach(System.out::println);
    }
}
