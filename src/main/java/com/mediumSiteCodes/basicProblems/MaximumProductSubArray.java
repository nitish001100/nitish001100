package com.mediumSiteCodes.basicProblems;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {-6, 4, -5, 8, -10, 0, 8};
//        maximumProductArray(arr);
        maxProductArray(arr);
    }

    public static void maxProductArray(int[] arr) {
        int current_Max_Sum = 1, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            current_Max_Sum *= arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                current_Max_Sum *= arr[j];

            }
            if (max < current_Max_Sum)
                max = current_Max_Sum;
            else
                break;
            current_Max_Sum = 1;
        }
    }


    // Below code works fine if all values in array will be positive and if any value in the array will be negative then the result be wrong.

    public static void maximumProductArray(int[] arr) {
        int actual_Max_Sum = Integer.MIN_VALUE, max_Sum = 1;

        for (int i = 0; i < arr.length; i++) {
            max_Sum *= arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (max_Sum > max_Sum * arr[j])
                    break;
                else
                    max_Sum *= arr[j];
            }
            if (actual_Max_Sum < max_Sum)
                actual_Max_Sum = max_Sum;
            max_Sum = 1;
        }

        System.out.println(actual_Max_Sum);
    }

}
