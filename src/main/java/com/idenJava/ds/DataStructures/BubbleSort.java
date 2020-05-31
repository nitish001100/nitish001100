package com.idenJava.ds.DataStructures;

// 34 15 29  8
public class BubbleSort {

    int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int buffer;
                    buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
        return arr;
    }


    int bubbleSortModified(int[] arr) {
        int flag =0;
        for (int i = 0; i < arr.length; i++) {
            if (flag == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int buffer;
                        buffer = arr[i];
                        arr[i] = arr[j];
                        arr[j] = buffer;
                        flag = 1;
                    }
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 15, 29, -1};
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.bubbleSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();

        int[] arr0 = new int[]{8, 15};
        System.out.println(bubbleSort.bubbleSortModified(arr0) == 0 ? "Already Sorted" : "Sorting Needed");
        int[] arr2 = new int[]{8, 15, 29, 8};
        System.out.println(bubbleSort.bubbleSortModified(arr2) == 0 ? "Already Sorted" : "Sorting Needed");
    }
}
/**
 * Time Complexity - O(n2)
 * <p>
 * How to make bubble sort more efficient.
 *
 * bubbleSortModified(int[]arr)
 */

