package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class ShortestPathInGrid {

    static int N = 5;

    public static void main(String[] args) {

        int[][] grid = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {1, 0, 0, 1, 1},
                {0, 1, 0, 1, 1},
                {0, 0, 0, 0, 1},
        };

        int[][] visited = new int[N][N];
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited.length; j++) {
                visited[i][j] = 0;

            }
        }

        int srcRow = 0, srcCol = 0, destRow = N - 1, destCol = N - 1;
        findPathInGrid(grid, visited, srcRow, srcCol, destRow, destCol);

        for (int row = 0; row < visited.length; row++) {
            for (int col = 0; col < visited.length; col++) {
                System.out.print(visited[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] matrix, int i, int j) {
        if (i >= 0 && i < N && j >= 0 && j < N && matrix[i][j] == 1)
            return true;
        return false;
    }

    public static boolean findPathInGrid(int[][] grid, int[][] visited, int srcRow, int srcCol, int destRow, int destCol) {

        if (srcRow == destRow && srcCol == destCol) {
            visited[srcRow][srcCol] = 1;
            return true;
        }

        if (isSafe(grid, srcRow, srcCol) == true) {
            visited[srcRow][srcCol] = 1;
            if (findPathInGrid(grid, visited, srcRow + 1, srcCol, destRow, destCol) == true) {
                return true;
            }

            if (findPathInGrid(grid, visited, srcRow, srcCol + 1, destRow, destCol) == true) {
                return true;
            }

            visited[srcRow][srcCol] = 0;
            return false;
        }

        return false;
    }
}
