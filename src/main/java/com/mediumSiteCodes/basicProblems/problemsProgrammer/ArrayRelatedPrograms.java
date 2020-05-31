package com.mediumSiteCodes.basicProblems.problemsProgrammer;

import java.util.HashSet;

public class ArrayRelatedPrograms {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5, 6, 7};
        System.out.println("Find Duplicates = ");
        findDuplicateNumber(arr);
        System.out.println("Find Largest and smallest Number = ");
        findLargestAndSmallestNumber(arr);
        System.out.println("Find pairs which equals to given sum = ");
        int sum = 6;
        findPairs(arr, sum);
    }

    private static void findPairs(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains((int) (sum - arr[i]))) {
                hs.add(arr[i]);
            } else {
                System.out.println(arr[i] + "," + (sum - arr[i]));
            }
        }
    }

    private static void findLargestAndSmallestNumber(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(min + "," + max);
    }

    public static void findDuplicateNumber(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains((int) arr[i])) {
                System.out.println(arr[i]);
            } else {
                hs.add(arr[i]);
            }
        }
    }
}
