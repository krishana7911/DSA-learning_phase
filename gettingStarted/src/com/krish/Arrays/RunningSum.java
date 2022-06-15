package com.krish.Arrays;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        runningSum(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] runningSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }
}
