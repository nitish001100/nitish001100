package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class RearrangeEvenOddNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 7, 6, 9, 10};
        rearrangeEvenOddNumbers(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void rearrangeEvenOddNumbers(int[] arr) {
        int slowPtr = 0, fastPtr = 0, len = arr.length - 1;

        while (fastPtr < len) {
            if (arr[slowPtr] % 2 != 0) {
                if (arr[fastPtr] % 2 == 0) {
                    int temp = arr[slowPtr];
                    arr[slowPtr] = arr[fastPtr];
                    arr[fastPtr] = temp;
                    slowPtr += 1;
                }
                fastPtr += 1;
            } else {
                slowPtr += 1;
                continue;
            }
        }

    }
}
