package com.geeksOfGeeks.amazon;

public class ReplaceEveryElementWithGreatestElement {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] arrCpy = arr;

        for (int itr = 0; itr < arr.length; itr++) {
            arr[itr] = findLargestElement(arrayCutter(arrCpy, itr));
        }

        System.out.println(arr);
    }

    static int[] arrayCutter(int[] arr, int buffer) {
        int[] outputArr = new int[(arr.length - 1) - buffer];

        for (int ptr = 0; ptr < outputArr.length; ptr++)
            outputArr[ptr] = arr[ptr + 1];

        return outputArr;
    }

    static int findLargestElement(int[] arr) {
        int ele = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (!(arr[i] < arr[j])) {
                    if (ele < arr[i])
                        ele = arr[i];
                }
            }
        }

        return ele;
    }
}
