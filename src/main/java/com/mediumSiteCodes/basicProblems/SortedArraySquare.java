package com.mediumSiteCodes.basicProblems;

/**
 * Given a sorted array, You have to provide sorted square array as output.
 */

public class SortedArraySquare {
    public static void main(String[] args) {
        int[] arr = {-5, -3, -1, 0, 4, 7};
        int[] result = sortedArraySquare(arr);
        print(result);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static int[] sortedArraySquare(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Math.abs(arr[left]) > arr[right]) {
                result[i] = (int) Math.pow(arr[left], 2);
                left += 1;
            } else {
                result[i] = (int) Math.pow(arr[right], 2);
                right -= 1;
            }
        }
        return result;

    }
}