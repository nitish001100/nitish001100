package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        /*
    An Array and an integer k.
    Problem : Find the maximum for each and every contagious subArray of size k.  */

        int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k = 4;
        slidingWindowMaximum(arr, k);
    }

    // Time Complexity - O(n*k) -- n = num of elements and k - sliding window.
    private static void slidingWindowMaximum(int[] arr, int k) {
        int len = arr.length;
        for (int itr = 0; itr < (len - k)+1; itr++) {
            int max = findMax(arr, itr, itr + k);
            System.out.print(max + " ");
        }
    }

    private static int findMax(int[] arr, int lowerBound, int upperBound) {
        int sum = Integer.MIN_VALUE;
        for (int itr = lowerBound; itr < upperBound; itr++) {
            if (arr[itr] > sum)
                sum = arr[itr];
        }
        return sum;
    }

    //TODO
    // Time complexity - O(n) By Using Queue, https://www.youtube.com/watch?v=m-Dqu7csdJk&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=102


}
