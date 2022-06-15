package com.krish.Arrays;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverse(list);
        System.out.println(Arrays.toString(list));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {

        if(arr.length == 0) {
            System.out.println("The array is empty");
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
