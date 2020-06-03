package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class DoubleTheFirstElementAndMoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 4, 0, 8};

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] != 0 && arr[i + 1] == arr[i]) {
                arr[i] *= 2;
                arr[i+1] = 0;
            }
        }

        doubleTheFirstElementAndMoveZeroToEnd(arr);

        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void doubleTheFirstElementAndMoveZeroToEnd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != 0) {
                left += 1;
            } else {
                if (arr[right] != 0) {
                    int buffer = arr[right];
                    arr[right] = arr[left];
                    arr[left] = buffer;
                } else {
                    right -= 1;
                }
            }
        }
    }
}
