package com.geeksOfGeeks.amazon;

public class DiagnaolSumInBinaryTree {
    public static void main(String[] args) {

        int row = 3; int col = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int initialPtrBreak = (row*col)/row;
        int usedPtrBreak = (row*col)/row;

        for (int itr = 0; itr < arr.length; itr++) {
            System.out.print(arr[usedPtrBreak]);
            usedPtrBreak = usedPtrBreak+3;
        }


        /**
         *
         3 6 9
         2 5 8
         1 4 7
         
         */
    }
}
