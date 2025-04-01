package org.code.week6.Strings;

/*
796. Rotate String
Easy
Topics
Companies
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

https://leetcode.com/problems/rotate-string/description/
 */
public class RotateStringEasyTopics {

    public static boolean rotateString(String s, String goal) {
          char[] c=s.toCharArray();
           for(int i=0;i<c.length;i++){
               for(int j=0;j<c.length-1;j++){
                   swap(c,j,j+1);
               }
               if(String.copyValueOf(c).equals(goal))
                   return true;
           }
           return false;
    }

    private static void swap(char[] s, int j, int i) {
        char temp=s[j];
        s[j]=s[i];
        s[i]=temp;

    }


    /*
    Check if lengths are equal → ✅ (both have length 5)

    Concatenate s with itself → "abcdeabcde"

   Check if "cdeab" is in "abcdeabcde" → ✅ Return true
     */
    public boolean rotateStringChatgpt(String s, String goal) {
        // Step 1: Check if lengths are different. If they are, return false immediately.
        if (s.length() != goal.length()) return false;

        // Step 2: Concatenate s with itself
        String doubled = s + s;

        // Step 3: Check if goal is a substring of the concatenated string
        return doubled.contains(goal);
    }


    public static void main(String[] args) {
       String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s,goal));
    }
}
