package com.mediumSiteCodes.basicProblems;

import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};


        // O(n)
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i]))
                hs.add(arr[i]);
            else
                System.out.println(arr[i]);
        }

    }
}
