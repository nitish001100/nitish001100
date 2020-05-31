package com.geeksOfGeeks.april.sorting;

public class InsertionSorting {
    public static void main(String[] args) {
        int[]arr = {2,4,7,1,5,3};
        insertionSorting(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void insertionSorting(int[] arr){
        for (int itr = 1; itr < arr.length; itr++) {
            int baseElement = arr[itr];
            int j = itr-1;
            while (j>=0 && arr[j] > baseElement){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = baseElement;
        }


    }
}
