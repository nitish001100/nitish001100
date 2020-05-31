package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class CountNumberOfOccurrences {
    static int count = 0;

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int x = 2;
        System.out.println(countNumberOfOccurrencesUsingLinear(arr, x));

        int left = 0;
        int right = 0;

        countNumberOfOccurrencesUsingBinary(arr, x, left, right);
        System.out.println(CountNumberOfOccurrences.count);
    }

    // Using Linear Approach.
    private static int countNumberOfOccurrencesUsingLinear(int[] arr, int x) {
        int count = 0;
        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] == x)
                count += 1;
        }

        return count;
    }


    //Using Binary Search
    private static void countNumberOfOccurrencesUsingBinary(int[] arr, int x, int left, int right) {

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] == x)
                count += 1;

            if (arr[mid] > x) {
                countNumberOfOccurrencesUsingBinary(arr, x, left, mid);
            } else {
                countNumberOfOccurrencesUsingBinary(arr, x, mid + 1, right);
            }
        }
    }
}
