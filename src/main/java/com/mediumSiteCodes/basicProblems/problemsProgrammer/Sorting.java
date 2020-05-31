package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        bubbleSorting(arr);
        insertionSorting(arr);
    }

    private static void insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] > arr[j]) {
                        int temp = 0;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println("\nInsertion Sorting = ");
        print(arr);
    }

    public static void bubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    continue;
                } else if (arr[j] < arr[i]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Bubble Sorting = ");
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
