package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class KthSmallestAndLargestNumber {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        kthSmallestAndLargestNumber(arr, k);
    }

    public static void kthSmallestAndLargestNumber(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Largest Number = " + arr[(0 + k)-1]);
        System.out.println("Smallest Number = " +arr[(arr.length - k)]);
    }
}
