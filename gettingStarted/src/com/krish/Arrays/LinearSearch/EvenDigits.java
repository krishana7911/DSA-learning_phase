package com.krish.Arrays.LinearSearch;

public class EvenDigits {

    public static void main(String[] args) {
        int[] numList = {12, 3, 45, 567, 4536, 321, 23, 45, -17};
        System.out.println(evenCounter(numList));
    }

    //Count the occurrence of even numbers and returns it.
    static int evenCounter(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    //check whether a num is even or not based on digits returned by digits().
    static boolean even(int nums){
        return (digits(nums) % 2 == 0);
    }

    //counts the number of digits
    static int digits(int numsDigits){
        int noOfDigits = 0;

        if(numsDigits < 0){
            numsDigits = numsDigits * -1;  //to include the negative numbers.
        }

        while(numsDigits > 0) {
            noOfDigits++;
            numsDigits = numsDigits /10;
        }
        return noOfDigits;
    }
}
