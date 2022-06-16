package com.krish.Arrays;

public class RichestCustomer {

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {2, 1, 4},
                {1, 2, 1},
                {1, 34, 21, 2}
        };
        int ans = richestWealth(accounts);
        System.out.println("The wealth of richest person is: " + ans);
    }

    static int richestWealth(int[][] arr) {
        int wealth = 0;

        for (int i = 0; i < arr.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < arr[i].length; j++) {
                totalWealth = totalWealth + arr[i][j];
            }

            if (totalWealth > wealth) {
                wealth = totalWealth;
            }
        }
        return wealth;
    }
}
