package org.code.week8.contest2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '-1'.

Input Format

S = "geeskgs"

Constraints

0<=n<=100

Output Format

k

Explanation: k is the first character in the string which is not repeated

Sample Input 0

gkk
Sample Output 0

g
Sample Input 1

gghhsskk
Sample Output 1

-1
 */
public class NonRepeatingTwo {



    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String ans=in.next();
        Map<String, Long> ansMap = Arrays.stream(ans.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),             // key mapper
                        LinkedHashMap::new,              // map factory (preserves order)
                        Collectors.counting()            // downstream collector
                ));

        boolean ansFlag=false;
        for (Map.Entry<String, Long> entry : ansMap.entrySet()) {
            if (entry.getValue() == 1) {
                ansFlag=true;
                System.out.println(entry.getKey());
                break;
            }
        }
        if(!ansFlag) {
            System.out.println(-1);
        }
    }
}
