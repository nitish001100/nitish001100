package com.idenJava.ds.DataStructures;

/**
 Step 1: Traverse the array
 Step 2: Match the key element with array element
 Step 3: If key element is found, return the index position of the array element
 Step 4: If key element is not found, return -1.
 */
public class LinearSearch {
    int search(int[] arr, int data){
        int searchKeyIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data){
                searchKeyIndex = i;
            }
        }
        return searchKeyIndex;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,13,5,10};
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.search(arr, 3));

    }
}
