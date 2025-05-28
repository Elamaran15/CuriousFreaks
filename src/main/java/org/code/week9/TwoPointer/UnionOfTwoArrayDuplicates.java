package org.code.week9.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoArrayDuplicates {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       int i=0;
       int j=0;
       int k=0;
       ArrayList<Integer> list=new ArrayList<>();

       while(i<a.length && j<b.length){
           if(a[i]==b[j]){
               if(k==0 || list.get(k-1)!=a[i]){
                   list.add(a[i]);
                   k++;
               }
               i++;
               j++;
           } else if (a[i]<b[j]) {
               if(k==0 || list.get(k-1)!=a[i]){
                   list.add(a[i]);
                   k++;
               }
               i++;
           }else{
               if(k==0 || list.get(k-1)!=b[j]){
                   list.add(b[j]);
                   k++;
               }
               j++;
           }
       }



       while(i<a.length){
            if(k==0 || list.get(k-1)!=a[i]){
                list.add(a[i]);
                k++;
            }
            i++;
       }

        while(j<b.length){
            if(k==0 || list.get(k-1)!=b[j]){
                list.add(b[j]);
                k++;
            }
            j++;
        }

       return list;
    }


    public static void main(String[] args) {
       int[] a={1, 2, 3, 4, 5};
       int[] b={1, 2, 3, 6, 7};
        findUnion(a,b).forEach(System.out::println);


    }
}
