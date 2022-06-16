package com.krish.Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 7, 5, 9, 4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    //Bubble sort also known as sinking sort/ exchange sort.
    static void bubbleSort(int[] arr) {

        boolean swapped;
        //number of cycles to be looped
        for(int i = 0; i < arr.length; i++) {

            swapped = false;
            // max item is placed at the respective last index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]  < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            //breaks when no swap occurs for particular value of i
            if (!swapped) {
                break;
            }
        }


    }

}
