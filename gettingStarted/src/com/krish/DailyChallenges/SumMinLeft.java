package com.krish.DailyChallenges;

public class SumMinLeft {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 7};
        int ans = sumMin(arr);
        System.out.println(ans);
    }

    static int sumMin(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    sum = sum + arr[j];
                }
            }

            totalSum = totalSum + sum;
        }
       return totalSum;
    }
}
