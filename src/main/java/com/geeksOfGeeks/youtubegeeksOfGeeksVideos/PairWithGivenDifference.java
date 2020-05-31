package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.HashSet;

public class PairWithGivenDifference {
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 50, 80};
        int value = 78;
        pairWithGivenDifference(arr, value);
    }

    // Tc : O(N+N) - n is the number of elements.
    private static void pairWithGivenDifference(int[] arr, int value) {
        HashSet<Integer> hs = new HashSet<>();

        for (int itr = 0; itr < arr.length; itr++)
            hs.add(arr[itr]);

        for (int itr = 0; itr < arr.length; itr++) {
            if (hs.contains((int) (value + arr[itr])))
                System.out.print("Pair Found : " + arr[itr] + " & " + (value + arr[itr]));
        }
    }
}
