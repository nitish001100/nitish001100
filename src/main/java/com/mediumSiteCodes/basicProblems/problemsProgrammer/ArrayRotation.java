package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int shift = 2;
        arrayRotation(arr, shift);
    }

    public static void arrayRotation(int[] arr, int shift) {
        int[] buffer = new int[shift];

        for (int i = 0; i < buffer.length; i++)
            buffer[i] = arr[i];


        for (int i = shift; i < arr.length; i++)
            arr[i - shift] = arr[i];


        int ptr = shift;
        for (int i = 0; i < buffer.length; i++) {
            arr[arr.length - ptr] = buffer[i];
            ptr -= 1;
        }

        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
