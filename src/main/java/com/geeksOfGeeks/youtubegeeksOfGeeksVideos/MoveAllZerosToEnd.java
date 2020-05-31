package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
//        int[] arr = {1, 2, 0, 0, 0, 3, 6};
        moveAllZerosToEnd(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int itr = 0; itr < arr.length; itr++) {
            System.out.print(arr[itr] + " ");
        }
    }

    private static void moveAllZerosToEnd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            if (arr[left] == 0 && arr[right] != 0) {
                int temp = 0;
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            if (arr[left] != 0) {
                left += 1;
            }

            if (arr[right] == 0) {
                right -= 1;
            }
        }

    }
}
