package org.code.blind75.arrays;


import java.util.Arrays;

/*
121. Best Time to Buy and Sell Stock
Solved
Easy
Topics
premium lock icon
Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.



 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
          int minIndex=0;
          for(int i=1;i<prices.length;i++){
              if(prices[i]<prices[minIndex]){
                  minIndex=i;
              }
          }

          int maxIndex=minIndex;
          for(int i=minIndex+1;i<prices.length;i++){
              if(prices[minIndex] < prices[i] && prices[i]>prices[maxIndex]){
                  maxIndex=i;
              }
          }

          return  prices[maxIndex]-prices[minIndex];
    }

    public static int maxProfitOptimised(int[] prices) {
        // Initialize the buy price to the first day's price
        int buy = prices[0];

        // Variable to store the current profit for each day
        int currentProfit = 0;

        // Variable to store the maximum profit found so far
        int maxProfit = 0;

        // Start looping from the second day since the first day is already considered as buy
        for (int i = 1; i < prices.length; i++) {

            // If the current price is less than the previous buy price,
            // update the buy price (find a lower price to buy)
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                // Otherwise, calculate the profit if we sell at current price
                currentProfit = prices[i] - buy;

                // Update the maximum profit if current profit is higher
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }

        // Return the maximum profit that could be made by buying and selling once
        return maxProfit;
    }

    // practicing on 12-09-25
    //Above also same solution, this one is easy to understand
    static int check(int[] arr){
        int i=0;
        int min=Integer.MAX_VALUE;
        int profit=0;
        while(i<arr.length){
            int currentProfit=0;

            if(min>arr[i]){
                min=arr[i];
            }else{
                currentProfit=arr[i]-min;
                profit=Math.max(currentProfit,profit);
            }

            i++;
        }

        return profit;
    }





    public static void main(String[] args) {
        int[] arr={7,6,4,3,1,2,5,8,9};
//        System.out.println(maxProfitOptimised(arr));
        //findIndex(arr);
    }


}
