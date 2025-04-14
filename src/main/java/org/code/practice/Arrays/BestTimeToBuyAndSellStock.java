package org.code.practice.Arrays;


/*
121. Best Time to Buy and Sell Stock
Easy
Topics
Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimeToBuyAndSellStock {


    public static int maxProfit(int[] prices) {
     int minIndex=findMinIndex(prices);

     int maxIndex=minIndex;

     for(int i=maxIndex+1;i<prices.length;i++){
         if(prices[i]>prices[maxIndex]){
             maxIndex=i;
         }
     }

     return prices[maxIndex]-prices[minIndex];
    }

    private static int findMinIndex(int[] prices) {
        int min=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[min]){
                min=i;
            }
        }
        return min;
    }



    static  int maxProfitNikil(int[] prices){
        if(prices.length<=1)
            return 0;


        int buy=prices[0];

        int currentProfit=0;
        int maxProfit=0;

        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else{
                currentProfit=prices[i]-buy;
                maxProfit=Math.max(maxProfit,currentProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        System.out.println(maxProfitNikil(arr));
    }
}
