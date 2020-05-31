package com.idenJava.ds.DataStructures;

public class InsertionSorting {

    void insertionSorting(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int bufferVar = 0;
                    bufferVar = arr[i];
                    arr[i] = arr[j];
                    arr[j] = bufferVar;
                }
            }
        }
        System.out.println("After Sorting - ");
        display(arr);
    }

    void display(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[]arr = new int[]{ 12, 11, 13, 5, 6 };
        InsertionSorting insertionSorting = new InsertionSorting();
        insertionSorting.insertionSorting(arr);



    }
}
