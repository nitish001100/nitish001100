package com.mediumSiteCodes.basicProblems;

import java.util.Arrays;

public class MergeTwoArrayBySatisfyingConstraints {
    public static void main(String[] args) {
        int x[] = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int y[] = {1, 8, 9, 10, 15};

        mergeTwoArrayBySatisfyingConstraints(x, y);
    }

    public static void mergeTwoArrayBySatisfyingConstraints(int[] x, int[] y) {
        int left = 0, right = x.length - 1;
        while (left < right) {
            if (x[left] == 0) {
                if (x[right] == 0) {
                    right -= 1;
                } else if (x[right] != 0) {
                    swap(x, left, right);
                    right -= 1;
                }
            } else {
                left += 1;
            }
        }
        //6 2 5 3 0 0 0 0 0
        //1, 8, 9, 10, 15

        int m = x.length, n = y.length;
        int k = m + n + 1;

        // run till x[] or y[] has elements left
        while (m >= 0 && n >= 0) {
            // put next greater element in next free position in x[] from end
            if (x[m] > y[n]) {
                x[k--] = x[m--];
            } else {
                x[k--] = y[n--];
            }
        }

        while (n >= 0) {
            x[k--] = y[n--];
        }

        Arrays.fill(y, 0);

        print(x);
        print(y);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void swap(int[] x, int left, int right) {
        int temp = x[left];
        x[left] = x[right];
        x[right] = temp;
    }
}
