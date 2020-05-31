package com.mediumSiteCodes.basicProblems;

public class MaximumLengthSubArrayHavingSum {
    public static void main(String[] args) {
        int[] arr = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int sum = 8;
        /*
            3 8
         */
        System.out.println("Length of sub array is: " + maximumLengthSubArrayHavingSum(arr, sum));
    }

    public static int maximumLengthSubArrayHavingSum(int[] arr, int sum) {
        int len = Integer.MIN_VALUE;
        int subSum = 0;

        for (int i = 0; i < arr.length; i++) {
            subSum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                subSum += arr[j];
                if (subSum < sum) {
                    continue;
                } else if (subSum == sum) {
                    if (len < (j - i)+1) {
                        len = (j - i)+1;
                        print(arr, i, j);
                    }
                } else {
                    subSum = 0;
                    break;
                }
            }
        }
        return len;
    }

    private static void print(int[] arr, int i, int j) {
        for (int i1 = i; i1 <= j; i1++)
            System.out.print(arr[i1] + " ");
        System.out.println();
    }
}
