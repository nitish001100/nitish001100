package com.mediumSiteCodes.basicProblems;

//impByNitish
public class BitonicSubArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4};
        findBitonicSubarray(arr);
    }

    public static int findBitonicSubarray(int[] A) {
        // I[i] stores the length of the longest increasing sub-array
        // ending at A[i]
        int[] I = new int[A.length];
        I[0] = 1;
        for (int i = 1; i < A.length; i++) {
            I[i] = 1;
            if (A[i - 1] < A[i]) {
                I[i] = I[i - 1] + 1;
            }
        }

        // D[i] stores the length of the longest decreasing sub-array
        // starting with A[i]
        int[] D = new int[A.length];
        D[A.length - 1] = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            D[i] = 1;
            if (A[i] > A[i + 1]) {
                D[i] = D[i + 1] + 1;
            }
        }

        // consider each element as peak and calculate LBS
        int lbs_len = 1;
        int beg = 0, end = 0;

        for (int i = 0; i < A.length; i++) {
            if (lbs_len < I[i] + D[i] - 1) {
                lbs_len = I[i] + D[i] - 1;
                beg = i - I[i] + 1;
                end = i + D[i] - 1;
            }
        }

        // print longest bitonic sub-array
        System.out.println("The length of longest bitonic subarray is " + lbs_len);
        System.out.println("The longest bitonic subarray is [" + beg + "," + end + "]");

        return lbs_len;
    }
}
