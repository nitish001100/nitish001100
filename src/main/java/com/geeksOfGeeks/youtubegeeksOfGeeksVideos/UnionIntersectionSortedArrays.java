package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionIntersectionSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        printUnion(arr1, arr2, arr1.length, arr2.length);
        List<Integer> intersections = printIntersection(arr1, arr2, arr1.length, arr2.length);
        intersections.stream().forEach(ele -> System.out.print("\n"+ele+" "));
    }

    private static void printUnion(int[] arr1, int[] arr2, int arr1Len, int arr2Len) {

        int itr1 = 0, itr2 = 0;

        while (itr1 < arr1Len && itr2 < arr2Len) {
            if (arr1[itr1] < arr2[itr2]) {
                System.out.print(arr1[itr1] + " ");
                itr1 += 1;
            } else if (arr1[itr1] > arr2[itr2]) {
                System.out.print(arr2[itr2] + " ");
                itr2 += 1;
            } else {
                System.out.print(arr1[itr1] + " ");
                System.out.print(arr2[itr2] + " ");
                itr1 += 1;
                itr2 += 1;
            }
        }

        // Print remaining elements of an array.

        while (itr1 < arr1Len) {
            System.out.print(arr1[itr1] + " ");
            itr1 += 1;
        }

        while (itr2 < arr2Len) {
            System.out.print(arr2[itr2] + " ");
            itr2 += 1;
        }
    }

    private static List<Integer> printIntersection(int[] arr1, int[] arr2, int arr1Len, int arr2Len) {
        List<Integer> intersectedPoints = new ArrayList<Integer>();

        HashSet<Integer> hashSet = new HashSet<>();

        for (int itr = 0; itr < arr2.length; itr++)
            hashSet.add(arr2[itr]);


        for (int itr = 0; itr < arr1.length; itr++) {
            if (hashSet.contains((int) arr1[itr])) {
                intersectedPoints.add(arr1[itr]);
            }
        }
        return intersectedPoints;
    }
}

