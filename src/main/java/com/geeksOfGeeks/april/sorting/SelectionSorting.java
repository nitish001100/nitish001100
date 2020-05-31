package com.geeksOfGeeks.april.sorting;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        selectionSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(!(arr[i]<arr[j])){
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

// Time Complexity: O(n2)


