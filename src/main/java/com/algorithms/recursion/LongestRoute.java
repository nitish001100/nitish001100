package com.algorithms.recursion;

public class LongestRoute {

    static int N = 3;

    static int[] path1 = {0, -1, 0, 1};
    static int[] path2 = {-1, 0, 1, 0};

    static int destRow = 2, destCol = 2;

    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 1},
                {1, 1, 0},
                {0, 1, 1},
        };

        int[][] visited = new int[N][N];

        for (int row = 0; row < visited.length; row++) {
            for (int col = 0; col < visited.length; col++) {
                visited[row][col] = 0;
            }
        }

        int row = 0, col = 0, pathSum = 0;
        longestRoute(mat, visited, row, col, destRow, destCol, pathSum);

    }

    private static boolean longestRoute(int[][] mat, int[][] visited, int row, int col, int destRow, int destCol, int pathSum) {
        if (row == destRow && col == destCol) {
            System.out.println(pathSum);
            return true;
        } else {
            for (int i = 0; i < 4; i++) {
                int rowNew = row + path1[i];
                int colNew = col + path2[i];
                if (isValid(mat, visited, rowNew, colNew) == true) {
                    visited[rowNew][colNew] = 1;
                    pathSum+=1;
                    if (longestRoute(mat, visited, rowNew, colNew, destRow, destCol, pathSum) == true)
                        return true;
                    visited[rowNew][colNew] = 0;
                    pathSum-=1;
                }
            }
        }
        return false;
    }

    private static boolean isValid(int[][] matrix, int[][] visited, int rowNew, int colNew) {
        if (rowNew >= 0 && colNew >= 0 && rowNew < N && colNew < N && visited[rowNew][colNew] == 0 && matrix[rowNew][colNew] != 0)
            return true;
        return false;
    }
}
