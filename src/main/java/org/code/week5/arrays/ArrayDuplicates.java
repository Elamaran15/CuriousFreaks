package org.code.week5.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayDuplicates {


    public static List<Integer> findDuplicatesJava8(int[] arr) {
        Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      return  frequencyMap
              .keySet()
              .stream()
              .filter(key -> frequencyMap.get(key)>1)
              .collect(Collectors.toList());
    }

    public static List<Integer> bruteForce(int[] arr){
        List<Integer> list=new ArrayList<>();

        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }

    public static List<Integer> bruteForceUsingSet(int[] arr){
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();

        for(int num:arr){
            if(!set.add(num)){
                list.add(num);
            }
        }

        return list;
    }


    public static void main(String[] args) {
          int[] arr={2, 3, 1, 2, 3};

        bruteForceUsingSet(arr).forEach(System.out::println);

    }
}
