package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class MoveAllZerosToEndInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        moveAllZerosToEnd(arr);
    }

    public static void moveAllZerosToEnd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != 0) {
                left += 1;
            } else if (arr[left] == 0) {
                if (arr[right] != 0) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left += 1;
                    right -= 1;
                } else if (arr[right] == 0) {
                    right -= 1;
                }
            }
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}