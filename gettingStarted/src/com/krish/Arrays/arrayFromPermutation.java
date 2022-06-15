package com.krish.Arrays;

public class arrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        nums = buildArray(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
