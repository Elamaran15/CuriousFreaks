package org.code.week5.searching;

public class LinearSearch {

    static boolean searchInSorted(int arr[], int k) {
       for(int i=0;i<arr.length;i++){
           if(arr[i]==k) return true;
       }
       return false;
    }


    public static void main(String[] args) {

    }
}
