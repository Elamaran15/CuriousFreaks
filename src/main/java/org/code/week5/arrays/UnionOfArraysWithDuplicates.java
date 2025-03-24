package org.code.week5.arrays;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionOfArraysWithDuplicates {

    public static int findUnionJava8(int a[], int b[]) {
        Set<Integer> set= Stream.of(a,b)
                .flatMapToInt(n-> Arrays.stream(n).distinct())
                .boxed()
                .collect(Collectors.toSet());

        return set.size();
    }

    public static int findUnionSet(int a[], int b[]){
       Set<Integer> set=new HashSet<>();
       for(int num:a){
           set.add(num);
       }

       for(int num:b){
           set.add(num);
       }
        return set.size();
    }



    public static void main(String[] args) {
        int[] a={1, 2, 1, 1, 2};
        int[] b={2, 2, 1, 2, 1};
        System.out.println(findUnionSet(a,b));
    }
}
