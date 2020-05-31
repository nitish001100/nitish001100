package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;


// TODO
public class MinimumCostPath {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        int[][] matrix = {{1, 3, 4, 7, 8}, {2, 4, 3, 8, 9}, {3, 4, 5, 1, 2}, {4, 7, 8, 1, 0}};
        printArray(matrix, m, n);

        int xCoordinate = 3, yCoordinate = 3;


        /*  1 3 4 7 8
            2 4 3 8 9
            3 4 5 1 2
            4 7 8 1 0           */

        minimumCostPath(matrix, m, n, xCoordinate, yCoordinate);
    }

    //https://www.youtube.com/watch?v=8dzfZNUnvJ8&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=100
    private static void minimumCostPath(int[][] matrix, int rowLen, int colLen, int xCoordinate, int yCoordinate) {

    }

    private static void printArray(int[][] matrix, int m, int n) {
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
