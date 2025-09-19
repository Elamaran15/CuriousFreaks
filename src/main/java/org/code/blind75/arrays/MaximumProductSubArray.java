package org.code.blind75.arrays;

public class MaximumProductSubArray {


    static void findSum(int[] arr){
        int maxProduct=Integer.MIN_VALUE;

        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod=prod*arr[i];

            maxProduct=Math.max(prod,maxProduct);

            if(prod<0){
                prod=1;
            }
        }

        System.out.println("Maximum prod: "+maxProduct);
    }


    public static void main(String[] args) {
        int[] arr={-2,0,-1};
        findSum(arr);
    }
}
