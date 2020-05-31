package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.Arrays;
import java.util.HashSet;

public class CheckPairSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int sum = -2;
        checkPairSum(arr, sum);
        anotherMethod(arr, sum);
        thruHashing(arr, sum);
    }


    //TC: o(n)
    private static void thruHashing(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();

        for (int itr = 0; itr < arr.length; itr++) {
            int temp = sum - arr[itr];

            if (hs.contains((int) temp))
                System.out.println("Result from 3rd Method: " + arr[itr] + "," + temp);
            else
                hs.add(arr[itr]);
        }
    }

    // worst case TC: nlogn + n
    private static void anotherMethod(int[] arr, int sum) {
        Arrays.sort(arr); //nlogn //    -3 -1 0 1 2
        int leftPtr = 0, rightPtr = arr.length - 1;
        // If a+b > sum ? decrement right ptr : increment left ptr

        // n
        while (leftPtr < rightPtr) {
            if ((arr[leftPtr] + arr[rightPtr]) > sum)
                rightPtr -= 1;

            if ((arr[leftPtr] + arr[rightPtr]) < sum)
                leftPtr += 1;

            if ((arr[leftPtr] + arr[rightPtr]) == sum) {
                System.out.println("Result from 2nd Method: " + arr[leftPtr] + "," + arr[rightPtr]);
                break;
            }
        }
    }

    // TC - O(n2)
    private static void checkPairSum(int[] arr, int sum) {
        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                if ((arr[itr1] + arr[itr2]) == sum)
                    System.out.println("Result from 1st Method:" + arr[itr1] + "," + arr[itr2]);
            }
        }
    }
}
