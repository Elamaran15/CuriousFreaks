package org.code.week8.contest2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s.

Input Format

s = "geeksforgeeks"

Constraints

0<=n<=100

Output Format

e

Explanation - e has occurred 4 times in the string which is the maximum, so e is the string which has maximum occurence.

Sample Input 0

geeksforgeeks
Sample Output 0

e
Sample Input 1

s
Sample Output 1

s
 */
public class MostFrequentFive {


    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
       String s = in.next();

        Map<String,Long> ans=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        // Get the entry with the max value
        Optional<Map.Entry<String, Long>> maxEntry = ans.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        maxEntry.ifPresent( e-> {
            System.out.println(e.getKey());
        });

    }
}
