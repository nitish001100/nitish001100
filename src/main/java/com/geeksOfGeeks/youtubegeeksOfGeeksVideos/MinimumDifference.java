package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 19, 18, 25};
        int num = minDifference(arr);
        System.out.println(num);
        int num1 = minDifferenceNLognPlusM(arr);
        System.out.println(num1);
    }

    // Time Complexity - n2
    private static int minDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                if (Math.abs(arr[itr1] - arr[itr2]) < minDiff)
                    minDiff = Math.abs(arr[itr1] - arr[itr2]);
            }
        }
        return minDiff;
    }

    //TC - nlogn + n
    private static int minDifferenceNLognPlusM(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int itr = 0; itr < arr.length - 1; itr++) {
            if (Math.abs(arr[itr] - arr[itr + 1]) < minDiff) {
                minDiff = Math.abs(arr[itr] - arr[itr + 1]);
            }
        }
        return minDiff;
    }
}
