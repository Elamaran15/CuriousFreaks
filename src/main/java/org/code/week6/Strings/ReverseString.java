package org.code.week6.Strings;

//Reverse a String
//Difficulty: BasicAccuracy: 69.49%Submissions: 397K+Points: 1Average Time: 15m
//You are given a string s, and your task is to reverse the string.
//
//Examples:
//
//Input: s = "Geeks"
//Output: "skeeG"

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/reverse-a-string/1
public class ReverseString {

    public static String reverseString(String s) {
        char[] c=s.toCharArray();

        int i=0;
        int j=c.length-1;

        while(i<j){
            swap(c,i,j);
            i++;
            j--;
        }
        return String.copyValueOf(c);
    }

    private static void swap(char[] c, int i, int j) {
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;

    }


    public static void main(String[] args) {
        String s="Geeks";
        System.out.println(reverseString(s));
    }
}
