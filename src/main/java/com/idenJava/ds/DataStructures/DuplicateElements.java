package com.idenJava.ds.DataStructures;

public class DuplicateElements {

    void duplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element = " + arr[i] +" at index " + i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 5, 10, 11, 100};
        DuplicateElements duplicateElements = new DuplicateElements();
        duplicateElements.duplicate(arr);
    }
}
