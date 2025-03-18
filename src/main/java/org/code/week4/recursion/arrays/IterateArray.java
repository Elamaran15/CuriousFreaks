package org.code.week4.recursion.arrays;

public class IterateArray {

    static void iterate(int[] arr,int index){
        if(index==arr.length)
            return;

        System.out.println(arr[index]);
        iterate(arr,index+1);
    }


    public static void main(String[] args) {
        iterate(new int[]{1,2,3,4},0);
    }
}
