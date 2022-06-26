package com.krish.DailyChallenges;

public class PascalTriangle {

        public static void main(String[] args) {
            int n = 7;
            pascal(n);
        }

        static void pascal(int n) {
            int[][] arr = new int[7][7];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0 || j == i) {
                        arr[i][j] = 1;
                    }
                }

                for (int j = 1; j < i; j++) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }


            for (int i = 0; i < n; i ++) {
                for (int j = 0; j < i + 1; j ++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
        }
}
