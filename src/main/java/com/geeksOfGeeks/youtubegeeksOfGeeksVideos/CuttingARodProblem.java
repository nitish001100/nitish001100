package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class CuttingARodProblem {
    public static void main(String[] args) {
        int rodLen = 8;
        /*
           1 5 8 9 10 17 17 20
        */
        int[] arr = {1, 5, 8, 9, 10, 17, 17, 20};
        int maxSum = cuttingARodProblem(arr, rodLen);
        System.out.println(maxSum);
    }


    // Tc : O(N)
    private static int cuttingARodProblem(int[] arr, int rodLen) {
        int left = 0, right = arr.length - 1;

        int maxPairSum = Integer.MIN_VALUE;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if ((currentSum > maxPairSum) && (left + right + 2 == rodLen)) {
                maxPairSum = currentSum;
                left += 1;
            } else {
                right -= 1;
            }
        }

        return maxPairSum;
    }
}
