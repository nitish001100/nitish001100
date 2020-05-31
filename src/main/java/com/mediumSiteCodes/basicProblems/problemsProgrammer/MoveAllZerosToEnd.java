package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 4, 5, 0};
        moveAllZerosToEnd(arr);
    }

    private static void moveAllZerosToEnd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != 0) {
                left += 1;
            } else if (arr[left] == 0) {
                if (arr[right] != 0) {
                    swap(arr, left, right);
                } else {
                    right -= 1;
                }
            }
        }
        print(arr);
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
