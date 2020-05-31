package com.mediumSiteCodes.basicProblems;

public class LongestContinousSubSequenceWithSameSum {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 1, 1, 1, 1};
        int[] arr2 = {0, 1, 1, 0, 1, 0};
        longestContinousSubSequenceWithSameSum(arr1, arr2);
    }

    private static void longestContinousSubSequenceWithSameSum(int[] arr1, int[] arr2) {

        int sum_x = 0, sum_y = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < 6 ; i++) {
            sum_x += arr1[i];
            sum_y += arr2[i];

            if (sum_x == sum_y) {
                if (max < sum_x) {
                    max = sum_x;
                }
            }
        }

        System.out.println(sum_x);
    }
}
