package com.krish.DailyChallenges;

public class SetMatrixZero {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setMatrixZero(arr);

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void setMatrixZero(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0) {

                    int ind = i - 1;
                    while (ind >= 0) {
                        arr[ind][j] = -1;
                        ind--;
                    }

                    ind = i + 1;
                    while (ind < arr.length) {
                        arr[ind][j] = -1;
                        ind++;
                    }

                    ind = j - 1;
                    while(ind >= 0) {
                        arr[i][ind] = -1;
                        ind--;
                    }

                    ind = j + 1;
                    while(ind< arr[i].length) {
                        arr[i][ind] = -1;
                        ind++;
                    }
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }

    }
}
