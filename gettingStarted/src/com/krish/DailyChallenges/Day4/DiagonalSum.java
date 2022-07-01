package com.krish.DailyChallenges.Day4;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 1, 2},
                {1, 2, 1,},
                {2, 1, 2}
        };

        int ans = diagonalSum(matrix);
        System.out.println(ans);
    }

    static int diagonalSum(int[][] matrix) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || j == matrix.length - 1 - i) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}
