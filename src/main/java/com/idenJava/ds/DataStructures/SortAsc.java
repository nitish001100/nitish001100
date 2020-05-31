package com.idenJava.ds.DataStructures;

public class SortAsc {

    int[] asc(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(!(arr[i] < arr[j])){
                    int buffer;
                    buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 5, 0, 11, -10};
        SortAsc sortAsc = new SortAsc();
        int[] result = sortAsc.asc(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
