package com.krish.DailyChallenges;

import java.util.ArrayList;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr1 = {2};
        ArrayList<Integer> kadaneList = new ArrayList<>();

        //Also passing the array list we want to store the start and end index of range
        int ans = kadane(arr, kadaneList);
        System.out.println(ans);

        //printing the range of which the max sum is calculated
        for(int i = kadaneList.get(0); i <= kadaneList.get(1); i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int kadane(int[] arr, ArrayList<Integer> kadaneList) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            for(int j = i; j < arr.length; j++) {
                //clearing sum so that the previous values are added to it
                int sum = 0;

                //three loops making sure all the combinations are covered
                for (int k = i; k <= j; k++) {

                    sum = sum + arr[k];
                    if (sum > max) {
                        kadaneList.clear();
                        max = sum;
                        kadaneList.add(i);
                        kadaneList.add(j);
                    }
                }
            }
        }

        return max;
    }
}
