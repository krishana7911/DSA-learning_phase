package com.krish.Arrays.Sorting;

import java.util.Arrays;

//Note that cyclic sort should only be used when it's 1 to N values and in "normal cyclic sort" no value should be missing
public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4, 7, 9, 6, 8};
        cyclicSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            /* We are taking index here for example if nums[i] is rightly placed for the
            first value then nums[0] will be 1 and 1 - 1 = 0. therefore in next if statement there won't be any swap since nums[i] and nums[correct]
            will have index value of 0. otherwise there will be swapping until the condition is met. In this swap the element at nums[0] will be
            placed at it's right position since we are swapping nums[0] with nums(the element at that position - 1 ) */
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
    }

    //what's happening with for loop is we are incrementing i with only one comparison what should we do so that it doesn't increment without comparing all values
    static void withForLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1){    // if we are to use while inside the for loop again then is it of any use  but the code is working though
                int correct = nums[i] - 1;
                swap(nums, i, correct);
            }
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
