package org.code.week8.contest1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayDuplicate {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        Set<Integer> set =new HashSet<>();
        for(int i:arr){
            if(!set.add(i)){
                System.out.print(i +" ");
            }
        }
    }
}
