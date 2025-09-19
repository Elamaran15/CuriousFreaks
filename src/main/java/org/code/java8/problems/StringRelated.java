package org.code.java8.problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringRelated {


    //Find the first non-repeated character in a string using streams.
    static void findChar(String ans){
        //String ans="eellamrrimmgoo";
      Map<Character,Long> valueMap= ans.chars()// Stream of int (ASCII values)
               .mapToObj(c->(char)c)//convert int ascii to character
               .collect(Collectors.groupingBy(Function.identity(),// Group by character itself
                       LinkedHashMap::new,// Preserve insertion order
                       Collectors.counting()));// Count frequency
        //value.forEach((character, aLong) -> System.out.println("Key: "+character+"  Count: "+aLong));


       String finalAns= valueMap.entrySet()
                .stream()// Stream of Map.Entry<Character, Long>
               .filter(value->value.getValue()==1)// Keep only non-repeated chars
                .map(Objects::toString)//map the Entier key value into String
                .findFirst().orElse(null);//find first or return null

        System.out.println(finalAns);
    }



    //2.Find the first repeated character in a string using streams.
    static void findSecondRepeated(String ans){
       Map<Character,Long> valueMap= ans.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity()
                        ,LinkedHashMap::new,Collectors.counting()));

       Character finalAns= valueMap.entrySet().stream()
                .filter(value->value.getValue()>1)
                .map(Map.Entry::getKey)   //Convert only key
                .findFirst().orElse(null);

        System.out.println(finalAns);
    }


    //3.Count the frequency of each character in a string
    static void countChar(String ans){
      Map<Character,Long> valueMap=  ans.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      valueMap.forEach((key, value1) -> System.out.println("Key: " + key + "  Value: " + value1));
    }


    //count frequency using array of char ascii value
    static void countAscii(String ans){
        int[] arr=new int[26];
        for(char c: ans.toCharArray()){
            arr[c - 'a']++;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }


    //Count Word Frequency in a Sentence
    //java is fun and java is powerful
    static void countWord(String sentence){
      List<String> words=Arrays.stream(sentence.split(" ")).toList();

      Map<String,Long> values=words.stream()
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      values.forEach((key,value)-> System.out.println(key+"  "+value));
    }

    //Count length of each Word in a Sentence
    //java is fun and powerful
    static void countLength(String sentence){
        List<String> words=Arrays.stream(sentence.split(" ")).toList();

       Map<String,Integer> length=
               words.stream().collect(Collectors.toMap(Function.identity(),String::length));
       length.forEach((key,value)-> System.out.println(key+"  "+value));

    }

    //Reverse each word in a sentence using streams.
    static void reverseAll(){
        String sentence="java is fun and powerful language and its more popular";
        String ans=Arrays.stream(sentence.split(" "))
                        .map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));

        System.out.println(ans);

    }


    //Find all palindromes from a list of strings using streams.
    static void findPalindrome(){
        List<String> find=List.of("saas","lkkl","non","tiger","love","none","thick","super","ava");

        List<String>ans=find.stream().filter(s ->
            new StringBuilder(s).reverse().toString().equals(s)
        ).toList();

        ans.forEach(System.out::println);
    }


    //Find the longest string in a list using streams.
    static void findLongString(){
        List<String> find=List.of("saas","lkkl","noneone","tigerforest","loveinsurancecompany","none","thicksheak","superover","ava");

       String ans= find.stream()
               .max(Comparator.comparing(String::length))
               .orElse(null);
       System.out.println(ans);

    }


    //Find duplicate characters in a string using streams.
    static void findDuplicate(){
        String ans="ElamaranE";

        Map<Character,Long> count=ans.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Character>finalAns=count.entrySet().stream().filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey).toList();

        System.out.println(finalAns);
    }


    //Given a list of strings,
    // group them by their first character, and then sort the groups by size descending.

    static void groupByString(){
        List<String> find=List.of("saas","lkkl","aon","tiger","love","aone","thick","tsuper","ava");

      Map<Character,List<String>> grouped= find.stream()
              .collect(Collectors.groupingBy(s -> s.charAt(0)));

        Map<Character, List<String>> sorted =
                grouped.entrySet().stream()
                        // Step 1: Convert the map into a stream of entries (key=first char, value=list of words)
                        // Step 2: Sort these entries by the size of their list (descending order)
                        .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))

                        // Step 3: Collect back into a Map
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,     // key → the character (first letter)
                                Map.Entry::getValue,   // value → the list of strings for that character
                                (a, b) -> a,           // merge rule if duplicate keys appear (keep the first one)
                                LinkedHashMap::new     // use LinkedHashMap so the sorted order is preserved
                        ));
    }








    public static void main(String[] args) {
        String ans="java is fun and powerful";
        groupByString();
    }
}
