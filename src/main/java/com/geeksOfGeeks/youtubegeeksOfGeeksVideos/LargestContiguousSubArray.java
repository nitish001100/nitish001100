package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class LargestContiguousSubArray {
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};

        int sum = largestContiguousSubArray(array);
        System.out.println(sum);
    }

    //Apply Kadane Algorithm.
    private static int largestContiguousSubArray(int[] arr) {
        int sum = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], (currentMax + arr[i]));
            sum = Math.max(sum, currentMax);
        }
        return sum;

    }
}
