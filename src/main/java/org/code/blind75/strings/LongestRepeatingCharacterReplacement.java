package org.code.blind75.strings;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {



    public static int characterReplacement(String s, int k) {
     int left=0;
     int right=0;

     int maxFreq=0;
     int[] arrOfAlpabets=new int[25];
     int maxWindowSize=0;

     while(right<s.length()){
         arrOfAlpabets[s.charAt(right) - 'A']++;
         maxFreq=Math.max(maxFreq, arrOfAlpabets[s.charAt(right) - 'A']);
         int windowLength=right-left+1;
         //Important**
         int characterNeedToBeChange=windowLength-maxFreq;

         if(characterNeedToBeChange>k){
             arrOfAlpabets[s.charAt(left)-'A']--;
             left++;
         }

         //after reducing size of window size that left++ we need to check the current window length based on that maxWindowSize

         windowLength=right-left+1;

         maxWindowSize=Math.max(maxWindowSize,windowLength);
         right++;

     }
     return maxWindowSize;
    }

    public static void main(String[] args) {
          String ans="AABABBA";
        System.out.println(characterReplacement(ans,1));
    }
}
