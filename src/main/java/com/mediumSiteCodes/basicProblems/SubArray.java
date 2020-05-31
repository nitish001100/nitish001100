package com.mediumSiteCodes.basicProblems;

public class SubArray {
    public static void main(String[] args) {

        //O(n2)
        
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    print(arr, i, j);
                }
            }
            if (arr[i] == 0)
                System.out.print(arr[i]);
        }
    }

    static void print(int[] arr, int i, int j) {
        for (int k = i; k <= j; k++) {
            System.out.format("%5s", arr[k] + " ");
        }
        System.out.println();
    }
}
