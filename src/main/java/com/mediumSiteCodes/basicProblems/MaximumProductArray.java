package com.mediumSiteCodes.basicProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumProductArray {
    public static void main(String[] args) {
        int[] arr = {-10, -3, 5, 6, -2};
        System.out.println("Maximum Product of an array is: " + maxAndMinFirst(arr) + " in O(n2) time.");
        System.out.println("Maximum Product of an array is: " + maxAndMinSecond(arr) + " in O(nlogn) time.");
        System.out.println("Maximum Product of an array is: " + maxAndMinThird(arr) + " in O(n) time.");

    }

    // O(n)
    private static int maxAndMinThird(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        return max * secondMax;
    }

    // O(n2)
    private static int maxAndMinFirst(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] * arr[j]) > max)
                    max = Math.abs((arr[i] * arr[j]));
            }
        }
        return max;
    }

    // O(nlogn)
    private static int maxAndMinSecond(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1] * arr[arr.length - 2];
        int min = arr[0] * arr[1];
        return max;
    }

}
