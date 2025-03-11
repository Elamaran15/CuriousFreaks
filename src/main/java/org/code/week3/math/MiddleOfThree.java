package org.code.week3.math;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MiddleOfThree {

    static int middle(int a, int b, int c) {
       List<Integer> list= Stream.of(a,b,c).sorted().toList();
        return list.get(1);
    }

    static int middleOptimised(int a, int b, int c) {

        if(a>b&&a>c){
            if(b>c){
                return b;
            }else{
                return c;
            }
        }else if(b>a&&b>c){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(a>b){
                return a;
            }else{
                return b;
            }
        }
    }

    static int findMinMiddle(int a, int b, int c){
          if(a<b && a<c){
              if(b<c)
                  return b;
              else
                  return c;
          }else if(b<a && b<c){
              if(a<c)
                  return a;
              else
                  return c;
          }else if(c<a && c<b){
              if(a<b)
                  return a;
              else
                  return b;
          }
          return 0;
    }

    public static void main(String[] args) {
        System.out.println(findMinMiddle(100,150,200));
    }
}
