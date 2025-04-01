package org.code.week6.binarySearchProblems.applicationSenarios;

import java.util.Arrays;

public class AggresiveCows {

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int start=1;
        int end=stalls[stalls.length-1]-stalls[0];

        while(start<=end){
            int mid=start + (end-start)/2;

            if(isCowCanBePlaced(stalls,mid,k)){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return end;
    }

    private static boolean isCowCanBePlaced(int[] stalls, int mid, int k) {
        int countCows=1;
        int lastCow=stalls[0];

        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-lastCow >=mid){
                countCows++;
                lastCow=stalls[i];
            }

            if(countCows>=k)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr={2, 12, 11, 3, 26, 7};
        System.out.println(aggressiveCows(arr,5));

    }
}
