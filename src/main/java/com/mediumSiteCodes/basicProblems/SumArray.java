package com.mediumSiteCodes.basicProblems;

import java.util.HashSet;

public class SumArray {
    public static void main(String[] args) {

        // O(n)
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(Math.abs((int) (sum - arr[i])))) {
                System.out.print(arr[i] + "," + (sum - arr[i]));
                System.out.println();
            }
            else
                hs.add(arr[i]);
        }
    }
}
