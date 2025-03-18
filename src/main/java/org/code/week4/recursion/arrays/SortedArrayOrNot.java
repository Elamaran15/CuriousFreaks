package org.code.week4.recursion.arrays;

public class SortedArrayOrNot {


    static boolean check(int[] arr,int index){
        if(index>=arr.length-1){
            return true;
        }

        if(arr[index]>arr[index+1])
            return false;

        return check(arr,index+1);

    }



    public static void main(String[] args) {
        System.out.println(check(new int[]{1,2,6,4,5,6},0));
    }
}
