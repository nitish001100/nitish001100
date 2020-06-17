package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class QueryRange {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        int query[][] = {{0, 4}, {1, 3}, {2, 4}};
        queryRange(arr, query);
    }


    public static void queryRange(int[] arr, int[][] query) {
        for (int j = 0; j < query.length; j++) {
            int sum = 0;
            for (int i = query[j][0]; i <= query[j][1]; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
