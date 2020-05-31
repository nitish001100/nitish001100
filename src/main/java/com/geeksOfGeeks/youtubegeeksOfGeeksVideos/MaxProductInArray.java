package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.Arrays;

public class MaxProductInArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 6, 7, 0};
        maxProductArray(arr);
        maxProductArrayInNLogN(arr);
        maxProductArrayInN(arr);
    }

    /**
     * An Efficient Solution can solve the above problem in single traversal of input array.
     * The idea is to traverse the input array and keep track of following four values.
     *
     * a) Maximum positive value
     * b) Second maximum positive value
     * c) Maximum negative value i.e., a negative value with maximum absolute value
     * d) Second maximum negative value.
     *
     */
    private static void maxProductArrayInN(int[] arr) {
        int maxPositiveValue = 0;
        int secondMaxPositiveValue = 0;
        int negativeValue = 0;
        int secondNegativeValue = 0;

        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] > 0) {
                secondMaxPositiveValue = maxPositiveValue;
                if (arr[itr] > maxPositiveValue) {
                    maxPositiveValue = arr[itr];
                }
            } else {
                secondNegativeValue = negativeValue;
                if (arr[itr] < negativeValue) {
                    negativeValue = arr[itr];
                }
            }
        }

        System.out.println(Math.max((negativeValue * secondNegativeValue), (maxPositiveValue * secondMaxPositiveValue)));
    }

    private static void maxProductArrayInNLogN(int[] arr) {
        Arrays.sort(arr);

        boolean positiveFlag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positiveFlag = true;
            else {
                positiveFlag = false;
                break;
            }
        }

        if (positiveFlag == false)
            System.out.println(Math.max((arr[0] * arr[1]), (arr[arr.length - 1] * arr[arr.length - 2])));
        else
            System.out.println("Max product is -" + arr[arr.length - 1] * arr[arr.length - 2] +
                    " found by " +
                    arr[arr.length - 1] + "," + arr[arr.length - 2]);
    }

    // Tc : O(N2)
    private static void maxProductArray(int[] arr) {
        int maxProduct = Integer.MIN_VALUE;
        int value1 = 0;
        int value2 = 0;

        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                if ((arr[itr1] * arr[itr2]) > maxProduct) {
                    maxProduct = arr[itr1] * arr[itr2];
                    value1 = arr[itr1];
                    value2 = arr[itr2];
                }
            }
        }

        System.out.println("Max Product is " + maxProduct + ", found by - " + value1 + "," + value2);
    }
}
