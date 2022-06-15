package com.krish.Arrays.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = {1, 3, 2, 5, 7, 11, 9, 8};
        //taking the num to be found as input from the user.
        System.out.print("Enter the number to be searched: ");
        int num = in.nextInt();

        //calling the function which returns the index value and storing it in a var.
        int ans = linearSearch(arr, num);
        System.out.println("The num is located at index: " + ans);
    }

    static int linearSearch(int[] arr, int num) {

        int index = -1;  // initializing here so that it doesn't go out of scope

        if (arr.length == 0) {
            return index;
        }

        for (index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == num) {
                return index;
            }
        }
        return -1;
        // -1, if the num doesn't exist in the array.
    }
}
