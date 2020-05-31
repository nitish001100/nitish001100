package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.HashMap;

public class LongestSpanWithSameSum {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        // Using Hashing Technique.
        int max_len = usingHashingFindLongestSpan(arr1, arr2);
        System.out.println(max_len);
    }

    private static int usingHashingFindLongestSpan(int[] arr1, int[] arr2) {
        int len = arr1.length;
        int[] diffSubArray = new int[len];
        for (int itr = 0; itr < len; itr++)
            diffSubArray[itr] = arr1[itr] - arr2[itr];
        int sum = 0, max_len = 0;
        HashMap<Integer, Integer> hM = new HashMap<>();
        for (int i = 0; i < len; i++) {
            sum += diffSubArray[i];
            if (sum == 0)
                max_len = i + 1;
            if (hM.containsKey(sum))
                max_len = Math.max(max_len, i - hM.get(sum));
            else
                hM.put(sum, i);
        }
        return max_len;
    }

    private static int applyKadaneAlgorithm(int[] arr) {
        int max = arr[0], currentMax = arr[0];
        for (int itr = 1; itr < arr.length; itr++) {
            currentMax = Math.max(arr[itr], currentMax + arr[itr]);
            if (currentMax > max)
                max = currentMax;
        }

        return max;
    }
}
