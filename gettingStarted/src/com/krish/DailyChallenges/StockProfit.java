package com.krish.DailyChallenges;

public class StockProfit {

    public static void main(String[] args) {
        int[] prices = {7, 5, 9, 3, 6, 44, 11};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    static int maxProfit(int[] prices){

        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            for(int j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];

                if (diff > profit) {
                    profit = diff;
                }
            }
        }

        return profit;
    }
}
