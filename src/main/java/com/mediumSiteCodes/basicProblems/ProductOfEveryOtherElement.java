package com.mediumSiteCodes.basicProblems;

public class ProductOfEveryOtherElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        productOfEveryOtherElement(arr);
        findProduct(arr);
    }


    //TC O(n)
    //impByNitish
    public static void findProduct(int[] A) {
        int n = A.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // O(N)
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = A[i - 1] * left[i - 1];
        }

        // O(N)
        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = A[j + 1] * right[j + 1];
        }

        // O(N)
        for (int i = 0; i < n; i++) {
            A[i] = left[i] * right[i];
        }
    }

    public static void productOfEveryOtherElement(int[] arr) {

        int[] buffer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int value = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j)
                    value = value * arr[j];
            }
            buffer[i] = value;
        }

        print(buffer);
    }


    private static void print(int[] buffer) {
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] + " ");
        }
    }
}
