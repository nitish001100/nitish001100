package com.geeksOfGeeks.amazon;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 10,0,-5,20,40};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(!(arr[i]<arr[j])){
                    //swap
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
