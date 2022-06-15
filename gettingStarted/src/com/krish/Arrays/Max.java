package com.krish.Arrays;

public class Max {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int[] numList = {1, 3, 4, 16, 9, 7, 11};
        System.out.println("The max in the list is " + max(numList, 4, numList.length -1));

    }

    //finding max in a range.
    static int max(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for(int i = start; i <= end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //finding max int in a passed array.
    static int max(int[] arr) {
        int maxVal = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
