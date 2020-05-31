package com.mediumSiteCodes.basicProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author nitishsa
 */

public class LargestSubArray {
    public static void main(String[] args) {


        // http://www.techiedelight.com/find-largest-sub-array-formed-by-consecutive-integers/

        // Code is mine.

        /** Main Logic behind this is :-
         *
         1: Suppose all elements are unique, in which you can do this.
         Take the sub array and find the max and min value and then subtract the value (max - min ) == (j - i)

         2: Suppose there are duplicate elements then use the hash set to store the values while iterating and the when you find the element is already present
         in hash set then break it and clear the hash set.

         See the code:- Code is simple don't be afraid.

         */

        int[] arr = {2, 0, 2, 1, 4, 3, 1, 0};

        // Kadane Algorithm.
        System.out.println(findLargestSubArraySum(arr));

        int[] arr0 = {2, 0, 2, 1, 4, 3, 1, 0};
        findLargestSubArray(arr0);
    }

    static String max = "max";
    static String min = "min";

    public static void findLargestSubArray(int[] arr) {

        int maxSize = Integer.MIN_VALUE;
        int left = 0, right = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (hs.contains((int) arr[j])) {
                    break;
                } else {
                    hs.add((int) arr[j]);
                }
                if ((findMaxAndMin(arr, i, j).get(1) - findMaxAndMin(arr, i, j).get(0)) == ((j - i))) {
                    int value = (j - i) + 1;
                    if (maxSize < value) {
                        maxSize = value;
                        left = i;
                        right = j;
                    }
                }
            }
            hs.clear();
        }
        print(arr, left, right);
    }

    public static void print(int[] arr, int i, int j) {
        for (int k = i; k <= j; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static List<Integer> findMaxAndMin(int[] arr, int i, int j) {

        // var = max || min

        List<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int k = i; k <= j; k++) {
            if (max < arr[k]) {
                max = arr[k];
            }

            if (min > arr[k]) {
                min = arr[k];
            }
        }
        al.add(min);
        al.add(max);

        return al;
    }


    public static int findLargestSubArraySum(int[] arr) {
        int[] buffer = new int[arr.length];

        buffer[0] = arr[0];

        int sum = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], (currentMax + arr[i]));
            sum = Math.max(sum, currentMax);
        }

        System.out.println(sum);
        return sum;
    }
}
