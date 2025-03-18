package org.code.week4.arrays.search;

public class LinearSearch {


    static int search(int arr[], int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{10, 8, 30, 4, 5},5));
    }
}
