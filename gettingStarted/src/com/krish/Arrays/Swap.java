package com.krish.Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    //swapping any two given index of array.
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
