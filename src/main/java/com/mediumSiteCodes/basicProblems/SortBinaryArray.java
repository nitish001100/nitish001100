package com.mediumSiteCodes.basicProblems;

public class SortBinaryArray {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0};

        int k = 0;

        // O(n) and o(1)

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[k++] = 0;
        }

        for (int i = k; i < arr.length; i++)
            arr[k++] = 1;

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
