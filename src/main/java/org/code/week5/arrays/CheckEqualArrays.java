package org.code.week5.arrays;

import org.code.sorting.MergeSort;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckEqualArrays {

    public static boolean checkEqual(int[] a, int[] b) {
        MergeSort.mergeSort(a,0,a.length-1);
        MergeSort.mergeSort(b,0,b.length-1);

        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]!=b[j]) {
                return false;
            }
            else{
                i++;
                j++;
            }
        }
        return true;
    }


    static boolean checkUsingMap(int[] a, int[] b){
        Map<Integer,Integer> map=new HashMap<>();

       for(int num:a){
          int count=map.getOrDefault(num,0);
          map.put(num,count+1);
       }

       for(int num: b){
           int count=map.getOrDefault(num,0);
           if(count==0)
               return false;
           else
               map.put(num,count-1);
       }

       return true;



    }

    public static void main(String[] args) {
       int[] a={1, 2, 5};
       int[] b={2, 1, 5};

        System.out.println(checkUsingMap(a,b));


    }
}
