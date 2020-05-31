package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 6, 40};
        pairSum(arr);
    }

    // Tc : O(n)
    private static void pairSum(int[] arr) {
        int maxSum = 0;
        int secondMaxSum = 0;

        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] > maxSum) {
                secondMaxSum = maxSum;
                maxSum = arr[itr];
            }
        }

        System.out.println(secondMaxSum + maxSum);
    }

}
