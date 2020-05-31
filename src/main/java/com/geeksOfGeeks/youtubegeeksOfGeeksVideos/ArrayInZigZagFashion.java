package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;


public class ArrayInZigZagFashion {
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        convertArrayInZigZagFashion(arr);
        printArray(arr);
    }

    private static void printArray(int[]arr){
        for (int itr = 0; itr < arr.length; itr++)
            System.out.print(arr[itr]+" ");
    }

    // Time Complexity - O(n)
    private static void convertArrayInZigZagFashion(int[] arr) {

        for (int itr = 0; itr < arr.length-1; itr++) {
            if (itr % 2 == 0) {
                if (arr[itr] > arr[itr + 1]) {
                    int temp = 0;
                    temp = arr[itr];
                    arr[itr] = arr[itr + 1];
                    arr[itr + 1] = temp;
                }
            } else {
                if (arr[itr] < arr[itr + 1]) {
                    int temp = 0;
                    temp = arr[itr];
                    arr[itr] = arr[itr + 1];
                    arr[itr + 1] = temp;
                }
            }
        }
    }
}


