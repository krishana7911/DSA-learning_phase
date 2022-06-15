package com.krish.Arrays.LinearSearch;

public class findMinMax {

    public static void main(String[] args) {
        int[] numList = {2, 4, 5, 7, -12, 9, 11, -14, 50};

        System.out.println(min(numList));
        System.out.println(max(numList));

    }

    static int min(int[] arr) {
        int minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        return minVal;
    }

    static int max(int[] arr) {
        int maxVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}
