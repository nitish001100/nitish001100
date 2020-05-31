package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        leadersInAnArray(arr);
        System.out.println();
        leadersInAnArrayWithComplexityN(arr);
    }

    // Time Complexity : O(n) -- Nice Logic - Just iterate it from Right.
    private static void leadersInAnArrayWithComplexityN(int[] arr) {
        int sum = arr[arr.length - 1];
        System.out.print(sum + " ");

        int len = arr.length - 2;
        int counter = len;
        while (counter > 0) {
            if (arr[counter] > sum) {
                sum = arr[counter];
                System.out.print(sum + " ");
            }
            counter -= 1;
        }
    }

    // Time Complexity : O(n2)
    private static void leadersInAnArray(int[] arr) {
        System.out.print("Leaders in an Array is : ");
        for (int itr = 0; itr < arr.length; itr++) {
            int currentMax = findMaxElement(arr, itr);
            if (!(currentMax > arr[itr])) {
                System.out.print(arr[itr] + " ");
            }
        }
    }

    private static int findMaxElement(int[] arr, int index) {
        int max = 0;
        for (int itr = index; itr < arr.length; itr++) {
            if (arr[itr] > max)
                max = arr[itr];
        }
        return max;
    }
}

