package org.code.week6.Strings;
/*

Code
Testcase
Test Result
Test Result
151. Reverse Words in a String
Medium
Topics
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

//https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            if (strArr[i] != null && !strArr[i].isEmpty()) {
                stringBuilder.append(strArr[i]);
                if (i != 0)
                    stringBuilder.append(" ");

            }
        }
        return stringBuilder.toString().strip();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
