package com.algorithms.backtrackingAlgoPractice.importantQuestions;

import java.util.HashMap;

public class CountSubArraysExactlyK {
    public static void main(String[] args) {
        int K = 2;
        int arr[] = {2, 1, 2, 1, 6};
        /**
         * Approach: To directly count the subarrays with exactly K different integers is hard but to find the count of subarrays with at most K different integers is easy.
         * So the idea is to find the count of subarrays with at most K different integers, let it be C(K), and the count of subarrays with at most (K – 1) different integers,
         * let it be C(K – 1) and finally take their difference, C(K) – C(K – 1) which is the required answer.
         * Count of subarrays with at most K different elements can be easily calculated through the sliding window technique.
         * The idea is to keep expanding the right boundary of the window till the count of distinct elements in the window is less than or equal to K and
         * when the count of distinct elements inside the window becomes more than K, start shrinking the window from the left till the count becomes less than or equal to K.
         * Also for every expansion, keep counting the subarrays as right – left + 1 where right and left are the boundaries of the current window.
         */

        int n = arr.length;
        int k = 2;

        System.out.print(exactlyK(arr, n, k));

    }

    private static int exactlyK(int arr[], int n, int k) {
        return (atMostK(arr, n, k) - atMostK(arr, n, k - 1));
    }

    private static int atMostK(int arr[], int n, int k) {
        int count = 0;
        int left = 0;
        int right = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < n) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0)
                    map.remove(arr[left]);
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }

}
