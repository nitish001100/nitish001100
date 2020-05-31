package com.geeksOfGeeks;

import java.util.Arrays;

/**
 * Given an array of distinct integers.
 * The task is to count all the triplets such that sum of two elements equals the third element.
 */
public class CountTheTriplets {
    public static void main(String[] args) {
//      int[] arr = new int[]{1, 5, 3, 2};
        int[] arr = new int[]{3, 2, 7};
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j]) == arr[k]) {
                        count = count + 1;
                    }
                }
            }
        }

        if (count == 0)
            System.out.println(-1);
        else
            System.out.println(count);
    }
}
