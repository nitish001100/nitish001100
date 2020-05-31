package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.HashSet;

public class CountTriplets {
    public static void main(String[] args) {
        int arr[] = {-2, 0, 1, 3};
        int sum = 2;

        int count = countTriplets(arr, sum);
        printCount(count);

        int countInN2Complexity = countTripletsInN2(arr, sum);
        printCount(countInN2Complexity);

    }

    private static void printCount(int count) {
        if (count == -1) {
            System.out.println("No Output!!");
        } else {
            System.out.println(count);
        }
    }

    //Tc : O(N2) Using Hashing Technique.
    private static int countTripletsInN2(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int itr = 0; itr < arr.length; itr++)
            hs.add(arr[itr]);

        int count = 0;

        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                if (hs.contains((int) sum - (arr[itr1] + arr[itr2])))
                    if (((int) sum - (arr[itr1] + arr[itr2])) != arr[itr1]
                            && ((int) sum - (arr[itr1] + arr[itr2])) != arr[itr2])
                        count += 1;
            }
        }
        return count;
    }

    // Tc = O(n3)
    private static int countTriplets(int[] arr, int sum) {
        int count = 0;

        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                for (int itr3 = itr2 + 1; itr3 < arr.length; itr3++) {
                    if ((arr[itr1] + arr[itr2] + arr[itr3]) < sum)
                        count += 1;
                }
            }
        }
        return count;
    }
}
