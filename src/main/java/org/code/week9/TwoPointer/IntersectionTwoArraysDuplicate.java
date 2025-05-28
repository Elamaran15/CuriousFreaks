package org.code.week9.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArraysDuplicate {


    public static ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

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
            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }

        }
        return list;

    }


    public static void main(String[] args) {
        int[] a={1, 2, 3};
        int[] b={4, 5, 6};
        intersectionWithDuplicates(a,b)
                .forEach(System.out::println);
    }
}
