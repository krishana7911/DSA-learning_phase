package com.krish.DailyChallenges;

import java.util.ArrayList;
import java.util.List;

public class ExtraCandies {
    public static void main(String[] args) {
        int[] candies = {2, 4, 5, 1, 3};
        int extraCandies = 1;
        List<Boolean> ans = maxCandies(candies, extraCandies);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    static List<Boolean> maxCandies(int[] candies, int extraCandies) {
        //we need a variable to store the max number of candies
        //boolean[] trueOrNot = new boolean[candies.length];
        List<Boolean> list = new ArrayList<Boolean>();

        int maxNoCandie = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (maxNoCandie < candies[i]) {
                maxNoCandie = candies[i];
            }
        }

        for (int j = 0; j < candies.length; j++) {
            candies[j] += extraCandies;
            if (candies[j] >= maxNoCandie) {
                //trueOrNot[j] = true;
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}