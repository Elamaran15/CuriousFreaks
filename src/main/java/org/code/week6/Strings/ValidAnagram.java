package org.code.week6.Strings;

import java.util.Arrays;
/*
242. Valid Anagram
Easy
Topics
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
https://leetcode.com/problems/valid-anagram/description/
 */
public class ValidAnagram {


    public static boolean isAnagram(String s, String t) {
        int[] c=new int[27];

        for(int i=0;i<s.length();i++){
            int cc=s.charAt(i);
            c[cc-97]=c[cc-97]+1;
        }

        for(int i=0;i<t.length();i++){
            int cc=t.charAt(i);
            c[cc-97]=c[cc-97]-1;
        }

        for (int n:c){
            if(n>0)
                return false;
        }

        return true;
    }


    public static  boolean isAnagramOptimised(String s, String t) {

        // Convert both to lowercase to ignore case match
        s = s.toLowerCase();
        t = t.toLowerCase();

        // Strip of all the white spaces
        s = s.replace(" ", "");
        t = t.replace(" ", "");

        // Initialize the bucket array
        int[] counts = new int[26];

        // Fill the buckets
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }

        // Empty the buckets
        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']--;
        }

        // Check if all buckets are empty
        for (int count : counts) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
       String s="a";
       String t="ab";

        System.out.println(t.charAt(1)- 'a');



    }
}
