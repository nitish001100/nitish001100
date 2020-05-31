package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.HashSet;

public class TripletsWithZeroSum {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        tripletsWithZeroSum(arr);
    }

    private static void tripletsWithZeroSum(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int itr = 0; itr < arr.length; itr++)
            hs.add(arr[itr]); // n

        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                if (hs.contains((int) (0 - (arr[itr1] + arr[itr2])))) {
                    System.out.println("(" + arr[itr1] + "," + arr[itr2] + "," + (arr[itr1] + arr[itr2]) + ")");
                }
            }
        }

    }
}
