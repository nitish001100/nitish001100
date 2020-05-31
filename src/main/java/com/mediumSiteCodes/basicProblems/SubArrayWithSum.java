package com.mediumSiteCodes.basicProblems;

public class SubArrayWithSum {
    public static void main(String[] args) {
        int sum = 15;
//        int[] arr = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        int[] arr = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10};
        subArrayWithSum(arr, sum);
    }

    public static void subArrayWithSum(int[] arr, int checkSum) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0, ptr = i;
            while (ptr < arr.length && sum < checkSum) {
                sum += arr[ptr];
                ptr += 1;
            }

            if (sum == checkSum)
                System.out.println("Index's are: " + i + "," + (ptr - 1));

            if (sum > maxSum)
                maxSum = sum;

        }
    }
}
