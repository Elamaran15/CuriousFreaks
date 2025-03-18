package org.code.week4.recursion.arrays;

public class SearchInArray {


    static int searchIndex(int[] arr,int index,int searchNum){
        if(index==arr.length)
            return -1;

        if(searchNum==arr[index])
            return index;


        return searchIndex(arr,index+1,searchNum);
    }


    public static void main(String[] args) {
        System.out.println(searchIndex(new int[]{1,2,3,4,5,6},0,5));
    }
}
