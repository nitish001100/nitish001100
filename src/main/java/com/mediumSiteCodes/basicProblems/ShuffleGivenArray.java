package com.mediumSiteCodes.basicProblems;

import java.util.Arrays;
import java.util.Random;

public class ShuffleGivenArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        suffleGivenArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void suffleGivenArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            int j = rand.nextInt(i + 1);
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
