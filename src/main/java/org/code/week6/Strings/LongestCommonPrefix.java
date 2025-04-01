package org.code.week6.Strings;

import java.util.Arrays;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length<=1)
            return strs[0];

        int min=findMinIndex(strs);
        int i=0;
        boolean flag=false;
        boolean insideFlag=true;
        String ans="";
        while(i<min){
            for(int j=0;j<strs.length-1;j++) {
                if (insideFlag) {
                    if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                        flag = true;
                        insideFlag=true;
                    } else {
                        insideFlag=false;
                    }
                }else{
                    break;
                }
            }
            if(insideFlag)
            i++;
            else
                break;
        }
        if(flag)
            ans=strs[0].substring(0,i);

        return ans;
    }

    private static int findMinIndex(String[] strs) {
        int min=strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<min)
                min=strs[i].length();
        }
        return min;

    }

    public static String longestCommonPrefixOptimised(String[] strs) {
        Arrays.sort(strs);

        StringBuilder str=new StringBuilder();

        for(int i=0;i<strs[0].length();i++){
           if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
               str.append(strs[0].charAt(i));
           }else{
               break;
           }
       }

       return str.toString();
    }


    public static void main(String[] args) {
        String[] ans={"flower","flow","flight"};
        System.out.println(longestCommonPrefixOptimised(ans));
    }
}
