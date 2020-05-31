package com.mediumSiteCodes.basicProblems;

//impByNitish http://www.techiedelight.com/find-minimum-sum-subarray-given-size-k/

public class MinimumSumSubArrayGivenK {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 5, 6, 3, 8, 1};
        int window = 3;
        minimumSumSubArrayGivenK(arr, window);
    }

    public static void minimumSumSubArrayGivenK(int[] arr, int window) {
        int sum = 0, minSum = Integer.MAX_VALUE, ptr = 0, leftPtr = 0, rightPtr = 0;

        for (int i = 0; i <= arr.length - window; i++) {
            while (ptr < window) {
                sum = sum + arr[i + ptr];
                ptr += 1;
            }
            if (minSum > sum) {
                minSum = sum;
                leftPtr = i;
                rightPtr = ptr;
            }
            ptr = 0;
            sum = 0;
        }

        System.out.println("(" + leftPtr + "," + rightPtr + ") = " + minSum);
    }
}
