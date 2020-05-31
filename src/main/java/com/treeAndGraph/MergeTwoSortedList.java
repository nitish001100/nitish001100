package com.treeAndGraph;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 8};
        int[] arr2 = {3, 4, 5, 9, 12};
        int[] arr3 = new int[arr1.length + arr2.length];
        arr3 = mergeTwoSortedList(arr1, arr2);

        printArray(arr3);
    }

    private static void printArray(int[] arr) {
        for (int itr = 0; itr < arr.length; itr++)
            System.out.print("Sorted List : " + arr[itr] + " ");
    }

    private static int[] mergeTwoSortedList(int[] arr1, int[] arr2) {

        int n = 0, m = 0, counter = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        while (n < arr1.length && m < arr2.length) {
            if (arr1[n] < arr2[m]) {
                arr3[counter] = arr1[n];
                n += 1;
            } else if (arr2[m] < arr1[n]) {
                arr3[counter] = arr2[m];
                m += 1;
            } else if (arr1[n] == arr2[m]) {
                arr3[counter++] = arr1[n];
                arr3[counter] = arr2[m];
                n+=1;
                m+=1;
            }
            counter += 1;
        }

        while (n < arr1.length) {
            arr3[counter] = arr1[n];
            counter += 1;
            n += 1;
        }

        while (m < arr2.length) {
            arr3[counter] = arr2[m];
            counter += 1;
            m += 1;
        }

        return arr3;
    }
}
