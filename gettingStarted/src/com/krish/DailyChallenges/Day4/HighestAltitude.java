package com.krish.DailyChallenges.Day4;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {52,-91,72};

        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    public static int largestAltitude(int[] gain) {

        int max_alt=0;
        int curr_alt=0;
        for(int i=0;i<gain.length;i++){
            curr_alt+=gain[i];
            max_alt=Math.max(curr_alt, max_alt);
        }
        return max_alt;
    }
}
