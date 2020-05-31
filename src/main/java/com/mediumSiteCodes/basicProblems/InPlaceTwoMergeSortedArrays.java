package com.mediumSiteCodes.basicProblems;


/** http://www.techiedelight.com/inplace-merge-two-sorted-arrays/ **/

public class InPlaceTwoMergeSortedArrays {
    public static void main(String[] args) {
        int[] x = {1, 4, 7, 8, 10};
        int[] y = {2, 3, 9};
        inPlaceTwoMergeSortedArrayInBufferArray(x, y);
        inPlaceTwoMergeSortedArrayInSameArray(x, y);

    }

    // This is Nice approach to do in TC: x.len * y.len.
    private static void inPlaceTwoMergeSortedArrayInSameArray(int[] x, int[] y) {
        int ptr2 = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > y[ptr2]) {
                swap(x, y, i, ptr2);
            }
            int first = y[0];
            int k;
            for (k = 1; k < y.length && y[k] < first; k++) {
                y[k - 1] = y[k];
            }
            y[k - 1] = first;
        }

        print(x);
        print(y);
    }

    private static void swap(int[] x, int[] y, int ptr1, int ptr2) {
        int temp;
        temp = x[ptr1];
        x[ptr1] = y[ptr2];
        y[ptr2] = temp;
    }

    private static void inPlaceTwoMergeSortedArrayInBufferArray(int[] x, int[] y) {
        int ptr1 = 0, ptr2 = 0, ptr3 = 0;
        int[] buffer = new int[x.length + y.length];
        while (ptr1 < x.length && ptr2 < y.length) {
            if (x[ptr1] < y[ptr2]) {
                buffer[ptr3] = x[ptr1];
                ptr1 += 1;
                ptr3 += 1;
            } else if (x[ptr1] > y[ptr2]) {
                buffer[ptr3] = y[ptr2];
                ptr2 += 1;
                ptr3 += 1;
            }
        }

        while (ptr1 < x.length) {
            buffer[ptr3] = x[ptr1];
            ptr1 += 1;
            ptr3 += 1;
        }

        while (ptr2 < y.length) {
            buffer[ptr3] = x[ptr2];
            ptr2 += 1;
            ptr3 += 1;
        }

        print(buffer);
    }

    private static void print(int[] buffer) {
        for (int i = 0; i < buffer.length; i++)
            System.out.print(buffer[i] + " ");
    }
}
