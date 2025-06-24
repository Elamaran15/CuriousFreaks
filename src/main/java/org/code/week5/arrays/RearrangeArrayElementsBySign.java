package org.code.week5.arrays;


import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:



Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present
in nums is preserved.
The rearranged array begins with a positive integer.

Examples:
Input : nums = [2, 4, 5, -1, -3, -4]

Output : [2, -1, 4, -3, 5, -4]

Explanation: The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4
maintain their relative positions
 */
public class RearrangeArrayElementsBySign {


    public static int[] rearrangeArray(int[] nums) {

        List<Integer> positive= Arrays.stream(nums).boxed()
                .filter(n-> n>0).toList();

        List<Integer> negative= Arrays.stream(nums).boxed()
                .filter(n-> n<0).toList();

        int positivePointer=0;
        int negativePointer=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=positive.get(positivePointer);
                positivePointer++;
            }else{
                nums[i]=negative.get(negativePointer);
                negativePointer++;
            }
        }

        return  nums;
    }

    public static int[] rearrangeArray2(int[] nums) {

        List<Integer> positive= Arrays.stream(nums).boxed()
                .filter(n-> n>0).toList();

        List<Integer> negative= Arrays.stream(nums).boxed()
                .filter(n-> n<0).toList();

        int index=Math.min(positive.size(),negative.size());

        for(int i=0;i<index;i++){
            nums[i*2]=positive.get(i);
            nums[(i*2)+1]=negative.get(i);
        }


       if(positive.size()>negative.size()){
           while(index<nums.length) {
               nums[index] = positive.get(index);
               index++;
           }
       }else{
           while(index<nums.length) {
               nums[index] = negative.get(index);
               index++;
           }
       }

        return nums;

    }



    public static void main(String[] args) {
      int[] nums={2, 4, 5, -1, -3, 6};
      Arrays.stream(rearrangeArray2(nums)).forEach(System.out::println);
    }
}
