package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class Seggregate0And1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate0And1(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int itr = 0; itr < arr.length; itr++)
            System.out.print(arr[itr] + " ");
    }

    //TC - O(n)
    private static void segregate0And1(int[] arr) {
        int leftPtr = 0;
        int rightPtr = arr.length - 1;

        while (leftPtr < rightPtr) {
            while (arr[leftPtr] == 0)
                leftPtr++;

            while (arr[rightPtr] == 1)
                rightPtr--;

            if (leftPtr < rightPtr) {
                arr[leftPtr] = 0;
                arr[rightPtr] = 1;
                leftPtr++;
                rightPtr--;
            }

        }
    }
}
