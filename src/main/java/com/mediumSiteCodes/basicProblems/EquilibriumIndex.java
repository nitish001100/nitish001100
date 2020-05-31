package com.mediumSiteCodes.basicProblems;

import java.util.HashMap;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {0, -3, 5, -4, -2, 3, 1, 0};
        findEquilbIndex(arr);
        findEqIndex(arr);
    }


    /**
     *
     *  0 -3 2 -2 -4 -1 0 0
     *  0 -> 0
     *  -3 -> 1
     *  2 -> 2
     *  -2 -> 3
     *  -4 -> 4
     *  -1 ->
     *
     */
    public static void findEqIndex(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++)
            total += arr[i];

        int right = 0;
        for (int i = arr.length - 1; i >= 0; i--)
        {
            // LOGIC EXPLAINED:

            // You have to understand that why we have done,
            // <<<<<<
            // right = total - (right + current element)
            // >>>>>>>>>>>

            // reason  -   i = equilibrium index then              left...  i ... right
            // which means left = right then i is eq index... left value  = right value.. so that's y
            // right =  (total - (right + arr[i] )..



            if (right == total - (arr[i] + right)) {
                System.out.println("Equilibrium Index found at " + i);
            }
            right += arr[i];
        }
    }

    // O(n2) time complexity.
    public static void findEquilbIndex(int[] arr) {
        int len = arr.length - 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (checkEquality(arr, 0, i - 1, i + 1, len) == true) {
                System.out.println("Equilibrium Index of Array is: " + i + " in O(n2) time complexity.");
            }
        }
    }

    public static boolean checkEquality(int[] arr,
                                        int leftSideLeftPtr,
                                        int leftSideRightPtr,
                                        int rightSideLeftPtr,
                                        int rightSideRightPtr) {

        int sumLeftSide = 0;
        int sumRightSide = 0;

        for (int i = leftSideLeftPtr; i <= leftSideRightPtr; i++)
            sumLeftSide += arr[i];

        for (int i = rightSideLeftPtr; i <= rightSideRightPtr; i++)
            sumRightSide += arr[i];

        if (sumLeftSide == sumRightSide)
            return true;

        return false;
    }
}
