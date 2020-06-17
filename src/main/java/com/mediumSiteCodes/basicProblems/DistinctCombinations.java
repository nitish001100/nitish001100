package com.mediumSiteCodes.basicProblems;


public class DistinctCombinations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 2;
        String str = "";
        distinctCombinations(arr, str, 0, k);
        System.out.println();
        distinctWithRepetitionCombinations(arr, str, 0, k);
    }

    public static void distinctCombinations(int[] arr, String value, int i, int k) {
        if (k > arr.length)
            return;

        if (k == 0) {
            System.out.println(value);
            return;
        }

        for (int j = i; j < arr.length; j++)
            distinctCombinations(arr, value + " " + arr[j], j, k - 1);

    }

    public static void distinctWithRepetitionCombinations(int[] arr, String value, int i, int k) {
        if (k > arr.length)
            return;

        if (k == 0) {
            System.out.println(value);
            return;
        }

        for (int j = i; j < arr.length; j++)
            distinctWithRepetitionCombinations(arr, value + " " + arr[j], j, k - 1);
    }
}

