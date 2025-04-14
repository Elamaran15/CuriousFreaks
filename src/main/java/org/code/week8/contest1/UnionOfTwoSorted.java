package org.code.week8.contest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoSorted {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.nextInt();
        }

        for(int i=0;i<arr2.length;i++){
            arr2[i]=in.nextInt();
        }

        int first=0;
        int second=0;


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(first<arr1.length && second<arr2.length){
            if(arr1[first]==arr2[second]){
                System.out.print(arr1[first] +" ");
                first++;
                second++;
            }else if(arr1[first]<arr2[second]){
               first++;
            }else{
                second++;
            }
        }





    }
}
