package com.geeksOfGeeks.amazon;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }


}

/**
                 10 20 30 40
                 15 25 35 45
                 27 29 37 48
                 32 33 39 50
 */
