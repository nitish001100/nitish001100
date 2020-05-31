package com.mediumSiteCodes.basicProblems;

public class SmallestSubArrayGreaterThanGivenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 40;
        smallestSubArrayGreaterThanGivenNumber(arr, k);
    }

    public static void smallestSubArrayGreaterThanGivenNumber(int[] arr, int k) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int len = 0, ptr = i, sum = 0;
            while (ptr < arr.length && sum < k) {
                sum += arr[ptr];
                len += 1;
                ptr += 1;
            }
            if (sum > k) {
                if (minLen > len) {
                    minLen = len;
                }
            }
        }

        if(minLen == Integer.MAX_VALUE)
            System.out.println("No sub-array exists.");
        else
            System.out.println(minLen);
    }
}
