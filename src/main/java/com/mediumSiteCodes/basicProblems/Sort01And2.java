package com.mediumSiteCodes.basicProblems;

import java.util.Arrays;

public class Sort01And2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
        sort01And2(arr, arr.length - 1);
        System.out.print("Code thru online logic:- {");
        print(arr);
        System.out.print("\nCode thru my own logic:- {");
        int[] arr0 = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
        sort10And2(arr0);

    }

    // Dutch National Flag Algorithm //

    public static void sort10And2(int[] arr) {
        int left = 0, mid = 0, right = arr.length - 1, ptr = 0;

        int[] buffer = new int[arr.length];
        boolean[] filled = new boolean[arr.length];

        Arrays.fill(filled, false);

        while (ptr < arr.length) {
            /*if (arr[ptr] != 0) {
                if (arr[ptr] == 1) {
                    buffer[mid] = 1;
                    mid += 1;
                } else if (arr[ptr] == 2) {
                    buffer[right] = 2;
                    right -= 1;
                }
            } else if (arr[ptr] != 1) {
                if (arr[ptr] == 0) {
                    buffer[left] = 0;
                    left += 1;
                    mid += 1;
                } else if (arr[ptr] == 2) {
                    buffer[right] = 2;
                    right -= 1;
                }
            } else if (arr[ptr] != 2) {
                if (arr[ptr] == 0) {
                    buffer[left] = 0;
                    left += 1;
                    mid += 1;
                } else if (arr[ptr] == 1) {
                    buffer[mid] = 1;
                    mid += 1;
                }
            }*/

            if (arr[ptr] == 0) {
                if (filled[left] == true) {
                    buffer = shift(arr, buffer, filled, left);
                }
                buffer[left] = 0;
                left += 1;
                filled[left] = true;
                mid = left;
            } else if (arr[ptr] == 1) {
                if (filled[mid] == true) {
                    buffer = shift(arr, buffer, filled, mid);
                }
                buffer[mid] = 1;
                mid += 1;
                filled[mid] = true;
            } else if (arr[ptr] == 2) {
                buffer[right] = 2;
                right -= 1;
                filled[right] = true;
            }
            ptr += 1;
        }

        print(buffer);
    }

    private static int[] shift(int[] arr, int[] buffer, boolean[] filled, int left) {
        for (int i = left; i < arr.length; i++) {
            if (filled[i] == true) {
                buffer[i + 1] = buffer[i];
            } else {
                break;
            }
        }
        return buffer;
    }

    public static void sort01And2(int[] arr, int end) {

        int start = 0, mid = 0, pivot = 1;

        while (mid <= end) {
            if (arr[mid] < pivot) {           // current element is 0
                swap(arr, start, mid);
                ++start;
                ++mid;
            } else if (arr[mid] > pivot) {   // current element is 2
                swap(arr, mid, end);
                --end;
            } else                          // current element is 1
                ++mid;
        }
    }

    static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}