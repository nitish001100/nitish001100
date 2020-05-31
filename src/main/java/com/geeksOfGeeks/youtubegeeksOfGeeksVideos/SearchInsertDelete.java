package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class SearchInsertDelete {
    public static void main(String[] args) {

        /**
         Search: O(n)
         Insert: O(1)
         Delete: O(n)
         */

        int[] arr = {12, 34, 10, 6, 40};
        int key = 10;
        search(arr, key);
        delete(arr, key);
        insert(arr, key);
    }

    //Tc : O(n)
    private static void search(int[] arr, int key) {
        int counter = 0;

        while (counter < arr.length - 1) {
            if (arr[counter] == key) {
                System.out.print("Key found at " + counter + " index.");
                break;
            }
            counter += 1;
        }
    }

    //Tc : O(1)
    private static void insert(int[] arr, int key) {

        int[] newArray = new int[arr.length];

        for (int itr = 0; itr < arr.length; itr++)
            newArray[itr] = arr[itr];

        newArray[newArray.length - 1] = key;
    }

    //Tc : O(n)
    private static void delete(int[] arr, int key) {

        // int[] arr = {12, 34, 10, 6, 40};
        int counter = 0;
        int len = arr.length - 1;
        boolean flag = false;

        while (counter < len) {

            if (arr[counter] == key)
                flag = true;

            if (flag == true)
                arr[counter] = arr[counter + 1];

            counter += 1;

        }

        if (counter == len)
            arr[counter] = 0;

        System.out.println("Key got deleted from " + counter + " index.");
    }
}

