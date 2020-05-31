package com.geeksOfGeeks.april.sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[]arr =  {64, 34, 25, 12, 22, 11, 90};
        bubbleSorting(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (!(arr[j] < arr[j + 1])) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

/** Worst Time Complexity: n2 ( when array is reverse sorted.)
 Best Time Complexity: n ( when array is sorted.) **/



