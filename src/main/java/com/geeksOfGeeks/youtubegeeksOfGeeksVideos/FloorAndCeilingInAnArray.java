package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class FloorAndCeilingInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x1 = 0;
        int x2 = 1;
        int x3 = 5;
        int x4 = 20;
        printFloorAndCeilingInAnArray(arr, x1);
        printFloorAndCeilingInAnArray(arr, x2);
        printFloorAndCeilingInAnArray(arr, x3);
        printFloorAndCeilingInAnArray(arr, x4);
    }

    // Linear Search - O(n)
    private static void printFloorAndCeilingInAnArray(int[] arr, int num) {

        if (num < arr[0]) {
            System.out.println("Floor doesn't exist in array for num " + num);
            System.out.println("Ceiling is for " + num + " is: " + arr[0]);
        }

        if (num > arr[arr.length - 1]) {
            System.out.println("Floor for " + num + " is: " + arr[arr.length - 1]);
            System.out.println("Ceiling doesn't exist in array for " + num);
        }

        for (int itr = 1; itr < arr.length - 2; itr++) {
            if (arr[itr] < num && num < arr[itr + 1]) {
                System.out.println("Floor in an Array for " + num + " is " + arr[itr]);
                System.out.println("Ceiling in an Array for " + num + " is " + arr[itr + 1]);
                break;
            }else {
                break;
            }
        }
    }
}
