package com.mediumSiteCodes.basicProblems;

import java.util.ArrayList;

public class MaximumLengthSubArray1And0 {
    public static void main(String[] args) {
        int[] arr = {
                0, 0, 1, 0, 1, 0, 0
        };
        maximumLengthSubArray1And0(arr);
    }

    private static void maximumLengthSubArray1And0(int[] arr) {
        int zero = 0, one = 0, len = Integer.MIN_VALUE, leftPtr = 0, rightPtr = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero += 1;
            else if (arr[i] == 1)
                one += 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 0)
                    zero += 1;
                else if (arr[j] == 1)
                    one += 1;

                if (zero == one) {
                    if (len < (j - i) + 1) {
                        len = (j - i) + 1;
                        leftPtr = i;
                        rightPtr = j;
                    } else if (len == ((j - i) + 1)) {
                        print(arr, i, j);
                    }
                }
            }
            zero = 0;
            one = 0;
        }
        print(arr, leftPtr, rightPtr);
        return;
    }

    private static void print(int[] arr, int i, int j) {
        for (int k = i; k <= j; k++)
            System.out.print(arr[k] + " ");
        System.out.println();
    }
}
