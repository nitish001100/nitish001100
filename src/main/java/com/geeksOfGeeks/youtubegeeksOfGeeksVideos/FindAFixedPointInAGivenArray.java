package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class FindAFixedPointInAGivenArray {
    public static void main(String[] args) {
        int arr[] = {-10, -5, 0, 3, 7};
        int num = findAFixedPointInAGivenArrayN(arr);
        printArray(num);
        int num1 = findAFixedPointInAGivenArrayLogN(arr);
        printArray(num1);
    }

    private static void printArray(int num) {
        if (num == -1)
            System.out.println("No Fixed Point.");
        else
            System.out.println("Fixed Point: " + num);
    }

    //Time Complexity - O(N) -- Linear Search
    private static int findAFixedPointInAGivenArrayN(int[] arr) {
        for (int itr = 0; itr < arr.length; itr++) {
            if (itr == arr[itr])
                return itr;
        }

        return -1;
    }

    //Time Complexity : O(logn) -- Binary Search -- Divide and Conquer.

    private static int findAFixedPointInAGivenArrayLogN(int[] arr) {
        int mid = arr.length / 2;
        if (arr[mid] == mid) {
            return mid;
        } else if (arr[mid] > mid) {
            // left side.
            for (int itr = 0; itr < mid; itr++) {
                if (arr[itr] == itr)
                    return itr;
            }
        } else {
            // right side.
            for (int itr = mid + 1; itr < arr.length; itr++) {
                if (arr[itr] == itr)
                    return itr;
            }
        }
        return -1;
    }
}
