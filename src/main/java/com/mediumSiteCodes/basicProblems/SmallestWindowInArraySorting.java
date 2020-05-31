package com.mediumSiteCodes.basicProblems;

public class SmallestWindowInArraySorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5, 6, 4, 8};
//        int[] arr = {1, 3, 2, 7, 5, 6, 4, 8};
        smallestWindowInArraySorting(arr);
    }

    //O(n).

    private static void smallestWindowInArraySorting(int[] arr) {

        int firstIndex = Integer.MAX_VALUE, lastIndex = -1;

        for (int i = 1; i < arr.length; i++) {

            if (!(arr[i - 1] < arr[i])) {

                if (firstIndex > (i - 1))
                    firstIndex = (i - 1);

                int latestIndex = find(arr, i);

                if (lastIndex < latestIndex)
                    lastIndex = latestIndex;

            }
        }

        System.out.println(firstIndex+","+lastIndex);
    }

    private static int find(int[] arr, int i) {
        int min = Integer.MAX_VALUE, minIndex = 0;
        for (int j = i; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                minIndex = j;
            }
        }

        return minIndex;
    }
}
