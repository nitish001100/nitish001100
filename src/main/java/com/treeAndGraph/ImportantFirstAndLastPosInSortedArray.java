package com.treeAndGraph;

public class ImportantFirstAndLastPosInSortedArray {
    public static void main(String[] args) {
        int[] arr = {7, 7, 8, 9, 10, 11};
        int target = 8;
        int output = firstAndLastPosInSortedArray(arr, target);
        System.out.println(output);
    }

    private static int firstAndLastPosInSortedArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int returnResult = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                returnResult = mid;
                break;
            }
            if (target <= arr[mid]) {
                left = 0;
                right = mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
                right = arr.length - 1;
            }
        }
        if (returnResult == 0)
            return -1;
        else
            return returnResult;
    }
}
