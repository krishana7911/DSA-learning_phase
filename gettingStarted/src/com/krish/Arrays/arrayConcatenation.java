package com.krish.Arrays;

import java.util.Arrays;

public class arrayConcatenation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {

        int length = nums.length;
        int[] ans = new int[length * 2];  // creating an array of double the size

        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[length + i] = nums[i];  // example:here ans[4] = nums[1] and so on
        }
        return ans;
    }
}
