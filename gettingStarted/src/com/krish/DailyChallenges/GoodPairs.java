package com.krish.DailyChallenges;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        int ans = goodPairs(nums);
        System.out.println(ans);
    }

    static int goodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
