package com.mediumSiteCodes.basicProblems;

public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 2, 0, 0, 0, 0, 1};
        moveAllZerosToTheEnd(arr);
        System.out.println();
        int[] arr0 = {1, 0, 0, 1, 2, 0, 0, 0, 0, 1};
        moveAllZerosToEndInN(arr0);
    }


    // O(n) maintains the order as well.
    public static void moveAllZerosToEndInN(int[] arr) {

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j += 1;
            }
        }
        print(arr);
    }


    // time complexity - O(N) ===== One drawback is, Order is not Maintain.

    public static void moveAllZerosToTheEnd(int[] arr) {
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

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
