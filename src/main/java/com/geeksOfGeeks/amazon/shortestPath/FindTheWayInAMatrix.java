package com.geeksOfGeeks.amazon.shortestPath;

public class FindTheWayInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        /*
         1 2 3
         4 5 6
         7 8 9
         */

        int row = 0, col = 0, n = 3, m = 3;
        int eleToBeFind = 9;
        boolean[][] vistedArr = new boolean[n][m];

        while (row < n && col < m) {
            if (matrix[row][col] == eleToBeFind)
                System.out.println("row:" + row + " col:" + col);

            if (!(vistedArr[row][col] == true))
                vistedArr[row][col] = true;
            row = row + 1;
            col = col + 1;
        }
    }

}
