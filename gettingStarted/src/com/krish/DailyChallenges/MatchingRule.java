package com.krish.DailyChallenges;

import org.jetbrains.annotations.NotNull;

public class MatchingRule {
    public static void main(String[] args) {
        String[][] items = {
                {"computer", "blue", "pixel"},
                {"phone", "silver", "lenovo"},
                {"phone", "silver", "iphone"}
        };
        String ruleKey = "color";
        String ruleValue = "silver";

        int ans = countMatch(items, ruleKey, ruleValue);
        System.out.println(ans);
    }

    static int countMatch(String[][] items, @NotNull String ruleKey, String ruleValue) {
        int count = 0;
        int rule = -1;

        if (ruleKey.equals("type")) {
            rule = 0;
        } else if (ruleKey.equals("color")) {
            rule = 1;
        } else {
            rule = 2;
        }

        for (String[] item : items) {
            if (item[rule].equals(ruleValue)) {
                count++;
            }
        }

//Yet not familiar with internal workings of enhanced for loop. therefore for reference
/*        for (int i = 0; i < items.length; i++) {
            if (items[i][rule].equals(ruleValue)) {
                count++;
            }
        }*/

        return count;
    }
}

//Code submitted on leetcode
// I really need to learn to initialize  and add elements to 2D List<>
/*    static int countMatches(List<List<String>> items, String ruleKey,String ruleValue) {
        int rule = -1;
        int count = 0;

        if (ruleKey.equals("type")){
            rule = 0;
        }

        else if (ruleKey.equals("color")){
            rule = 1;
        }

        else {
            rule = 2;
        }

        for(List<String> i : items) {
            if(i.get(rule).equals(ruleValue)) {
                count += 1;
            }
        }

        return count;
    }*/
