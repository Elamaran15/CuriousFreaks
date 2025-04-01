package org.code.week6.Strings;

/*You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

Examples :

Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
Input: s = "abc"
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
https://www.geeksforgeeks.org/problems/palindrome-string0817/1

 */
public class PalindromeString {

    //using two pointer
   static boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j){
            if(c[i]!=c[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("acbca"));
    }
}
