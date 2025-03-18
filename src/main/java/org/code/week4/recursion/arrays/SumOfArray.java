package org.code.week4.recursion.arrays;

public class SumOfArray {

    static int sumOfArray(int[] arr,int index){
        if(index>=arr.length-1)
            return arr[index];

        return arr[index] + sumOfArray(arr,index+1);
    }


    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1,2,3,4,5},0));
    }
}
