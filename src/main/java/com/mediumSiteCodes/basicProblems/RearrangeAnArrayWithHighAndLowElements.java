package com.mediumSiteCodes.basicProblems;

import java.util.Arrays;

public class RearrangeAnArrayWithHighAndLowElements {
    public static void main(String[] args) {
        int[] arr0 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = {9, 6, 8, 3, 7};
        int[] arr2 = {6, 9, 2, 5, 1, 4};

        rearrangeAnArrayWithHighAndLowElements(arr0);

        rearrangeAnArrayWithHighAndLowElements(arr1);

        rearrangeAnArrayWithHighAndLowElements(arr2);

        rearrangeAnArrayWithHighAndLowElementsInN(arr0);

        rearrangeAnArrayWithHighAndLowElementsInN(arr1);

        rearrangeAnArrayWithHighAndLowElementsInN(arr2);

    }

    public static void rearrangeAnArrayWithHighAndLowElementsInN(int[] arr) {
        for (int i = 1; i < arr.length - 1; i += 2) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                continue;
            } else {
                if (arr[i - 1] > arr[i])
                    swap(arr, (i - 1), i);

                if (i + 1 < arr.length && arr[i + 1] > arr[i])
                    swap(arr, i + 1, i);
            }
        }
        System.out.println();
        print(arr);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // {{ O(nlogn) + n }} = O(nlogn)
    public static void rearrangeAnArrayWithHighAndLowElements(int[] arr) {
        Arrays.sort(arr);

        int[] buffer = new int[arr.length];
        int bufferItr = arr.length / 2;
        int bufferPtr = 1;
        int right = arr.length - 1;
        while (bufferItr > 0) {
            buffer[bufferPtr] = arr[right];
            right -= 1;
            bufferPtr += 2;
            bufferItr -= 1;
        }

        int bufPtr = 0, arrPtr = 0;
        while (right >= 0) {
            buffer[bufPtr] = arr[arrPtr];
            bufPtr += 2;
            arrPtr += 1;
            right -= 1;
        }

        print(buffer);
        System.out.println();
    }

    private static void print(int[] buffer) {
        for (int i = 0; i < buffer.length; i++)
            System.out.print(buffer[i] + " ");
    }
}
