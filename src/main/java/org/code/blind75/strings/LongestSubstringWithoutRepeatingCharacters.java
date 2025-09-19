package org.code.blind75.strings;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

3. Longest Substring Without Repeating Characters
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters {


    public static int lengthOfLongestSubstringUsingSet(String s) {
       char[] chars=s.toCharArray();

       int maxLength=0;
       Set<Character> ans=new HashSet<>();

       for(char c:chars){
           if(!ans.contains(c)){
               ans.add(c);
           }else{
               maxLength=Math.max(maxLength,ans.size());
               ans.clear();
               ans.add(c);
           }
       }
       return Math.max(maxLength,ans.size());
    }


    public static int lengthOfLongestSubstring(String s){
        char[] chars=s.toCharArray();

        int left=0;
        int right=0;
        Set<Character> ans=new HashSet<>();
        int maxLength=0;
        while(right<chars.length && left < chars.length){
            if(!ans.contains(chars[right])){
                ans.add(chars[right]);
                right++;
            }else{
                maxLength=Math.max(maxLength,(right-left)+1);
                while(!ans.contains(chars[right])){
                   ans.remove(chars[left]);
                   left++;
               }
            }
        }

        return  maxLength;

    }

    public static int lengthOfLongestSubstringUsingSetOptimised(String s){
        int left=0;
        int right=0;
        int maxLength=0;

        Set<Character> chars=new HashSet<>();

        while(right<s.length()){
            if(!chars.contains(s.charAt(right))){
               chars.add(s.charAt(right));
               right++;
            }else{
                maxLength=Math.max(maxLength,chars.size());

                while(chars.contains(s.charAt(right))){
                    chars.remove(s.charAt(left));
                    left++;
                }


            }

        }
        return Math.max(maxLength,chars.size());
    }



    public static void main(String[] args) {
         String s="pwwkew";
       System.out.println(lengthOfLongestSubstringUsingSetOptimised(s));

//        int[] arr=new int[255];
//        Arrays.fill(arr,0);
//        arr['a']=1;
//
//        System.out.println(arr[97]);

    }
}
