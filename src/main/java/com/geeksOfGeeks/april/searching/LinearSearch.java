package com.geeksOfGeeks.april.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int x = 110;

        System.out.println(linearSearching(arr, x));
    }

    static public int linearSearching(int[] arr, int toBeFind){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == toBeFind){
                return i;
            }
        }
        return -1;
    }
    /** Time complexity = n = Let's say n = 4, so n = 4 **/
}

