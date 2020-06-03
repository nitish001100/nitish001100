package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {8, 9, 0, 1, 2, 0, 3};
        moveAllZerosToEndOfArray(arr);
    }

    public static void moveAllZerosToEndOfArray(int[] arr) {
        int leftPtr = 0, rightPtr = arr.length - 1, zeroPtr = arr.length - 1;

        while (leftPtr <= rightPtr) {
            if (arr[leftPtr] == 0) {
                while (zeroPtr > 0) {
                    if (arr[zeroPtr] != 0) {
                        int temp = arr[leftPtr];
                        arr[leftPtr] = arr[zeroPtr];
                        arr[zeroPtr] = temp;
                        break;
                    } else {
                        zeroPtr -= 1;
                    }
                }
            } else {
                leftPtr += 1;
            }

            if (arr[rightPtr] == 0) {
                while (zeroPtr > 0) {
                    if (arr[zeroPtr] != 0) {
                        int temp = arr[zeroPtr];
                        arr[zeroPtr] = arr[rightPtr];
                        arr[rightPtr] = temp;
                        break;
                    } else {
                        zeroPtr -= 1;
                    }
                }
            } else {
                rightPtr -= 1;
            }
        }

        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
