package com.krish.DailyChallenges;

public class ExtraCandies {
    public static void main(String[] args) {
        int[] candies = {2, 4, 5, 1, 3};
        int extraCandies = 1;
        boolean[] ans = maxCandies(candies, extraCandies);

        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static boolean[] maxCandies(int[] candies, int extraCandies) {
        //we need a variable to store the max number of candies
        boolean[] trueOrNot = new boolean[candies.length];

        int maxNoCandie = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (maxNoCandie < candies[i]) {
                maxNoCandie = candies[i];
            }
        }

        for (int j = 0; j < candies.length; j++) {
            candies[j] += extraCandies;
            if (candies[j] >= maxNoCandie) {
                trueOrNot[j] = true;
            }
        }

        return trueOrNot;
    }
}