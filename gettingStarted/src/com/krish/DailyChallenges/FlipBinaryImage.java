package com.krish.DailyChallenges;

public class FlipBinaryImage {
    public static void main(String[] args) {
        int[][] list = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        flipAndInvertImage(list);

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            reverse(image[i]);
            flip(image[i]);
        }

        return image;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void flip(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }


}
