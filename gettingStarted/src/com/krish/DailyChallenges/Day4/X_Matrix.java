package com.krish.DailyChallenges.Day4;

public class X_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 0, 0, 1},
                {0, 1, 1, 0},
                {1, 3, 1, 0},
                {4, 0, 0, 2}
        };

        boolean ans = xMatrix(matrix);
        System.out.println(ans);
    }

    static boolean xMatrix(int[][] matrix) {

        /* We can use below var but it would still run even after
         value is hit which is unnecessary after false is hit*/
        //boolean check = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || j == matrix.length - 1 - i) {
                    if (matrix[i][j] == 0) {
                        return false;
                    }
                } else if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
