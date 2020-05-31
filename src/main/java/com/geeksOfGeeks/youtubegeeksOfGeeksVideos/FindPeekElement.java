package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class FindPeekElement {
    public static void main(String[] args) {
//        int arr[] = {5, 10, 20, 15};
        int arr[] = {10, 20, 15, 2, 23, 90, 67};
        int[] numArr = findPeekElement(arr);
        printArray(numArr);
    }

    private static void printArray(int[] numArr) {
        if (numArr.length == 0 || numArr == null)
            System.out.println("No Such Element.");
        else {
            for (int itr = 0; itr < numArr.length; itr++) {
                System.out.print(numArr[itr] + " ");
            }
        }
    }

    // Time Complexity - O(n)
    private static int[] findPeekElement(int[] arr) {
        int[] resultArray = new int[arr.length];
        int resultArrayCounter = 0;

        if (arr[0] > arr[1])
            resultArray[resultArrayCounter++] = arr[0];

        for (int itr = 1; itr < resultArray.length - 1; itr++) {
            if (arr[itr] > arr[itr - 1] && arr[itr] > arr[itr + 1])
                resultArray[resultArrayCounter++] = arr[itr];
        }

        if (arr[arr.length - 1] > arr[arr.length - 2])
            resultArray[resultArrayCounter] = arr[arr.length - 1];

        return resultArray;
    }
}
