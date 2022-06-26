package com.krish.DailyChallenges;

public class Sort012s {

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 1, 0, 2, 1, 0};
        sort(nums);

    }

    static void sort(int[] nums) {
        int increment = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                int temp = nums[increment];
                nums[increment] = nums[i];
                nums[i] = temp;
                increment++;
            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                int temp = nums[increment];
                nums[increment] = nums[i];
                nums[i] = temp;
                increment++;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
