package org.code.blind75.arrays;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int totalTrappingWater=0;
        int[] leftMax=getLeftMax(height);
        int[] rightMax=getRightMax(height);

        for(int i=0;i<height.length;i++){
            if(height[i]<leftMax[i] && height[i]<rightMax[i]) {
                int waterLevel = Math.min(leftMax[i], rightMax[i]) - height[i];
                totalTrappingWater = totalTrappingWater + waterLevel;
            }
        }
       return totalTrappingWater;
    }

    private static int[] getRightMax(int[] height) {
        int[] rightMax=new int[height.length];
        rightMax[height.length-1]=0;
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i+1]); // ✅ only bars after i
        }
        return rightMax;

    }

    private static int[] getLeftMax(int[] height) {
        int[] leftMax=new int[height.length];
        leftMax[0]=0;
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i-1]);
        }
        return leftMax;
    }


    static int OptimisedWay(int[] height){
        int left=0;
        int right=height.length-1;

        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        int totalWater=0;
        while(left<=right) {

            if (height[left] <= height[right]) {
                if (leftMax > height[left]) {
                    totalWater = totalWater + (leftMax - height[left]);
                } else {
                    leftMax = Math.max(leftMax, height[left]);
                }
                left++;
            }else{
                if(rightMax>height[right]){
                    totalWater=totalWater + (rightMax - height[right]);
                }else{
                    rightMax = Math.max(rightMax,height[right]);
                }
                right--;
            }
        }

        return totalWater;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(OptimisedWay(arr));
    }
}
