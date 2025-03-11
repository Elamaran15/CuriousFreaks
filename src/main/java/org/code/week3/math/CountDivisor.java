package org.code.week3.math;

import java.util.ArrayList;
import java.util.List;

public class CountDivisor {


    static int countDivisors(int n) {
       int count=0;
       for (int i=1;i<=n;i++){
           if(n%i==0){
               if(i%3==0){
                   count++;
               }
           }
       }
       return count;
    }

    static List<Integer> divisorOptimised(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);

                if( (n/i)!=i && (n/i) % i == 0){
                    list.add(n/i);
                }
            }
        }
     return list;
    }


    public static void main(String[] args) {
        System.out.println(divisorOptimised(36));
    }
}
