package com.mediumSiteCodes.basicProblems;

public class MaxDiffBetweenTwoElements {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 1, 3, 5};
        maxDiffBetweenTwoElements(arr);
    }

    //impByNitish
    public static void maxDiffBetweenTwoElements(int[] arr) {
        int min = Integer.MAX_VALUE,
                minIndex = 0,
                maxIndex = 0,
                max = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                if (i < maxIndex) {
                    min = arr[i];
                    minIndex = i;
                }
            }
        }

        System.out.println("Pair is (" + max + "," + minIndex + ")" + " and difference is = " + (max - min));

    }

}
