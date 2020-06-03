package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class FindPath {

    static int[] path1 = {-1, 1, 0, 0};
    static int[] path2 = {0, 0, -1, 1};
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

        if (findPath(grid, visited, srcRow, srcCol, destRow, destCol) == true) {
            for (int row = 0; row < visited.length; row++) {
                for (int col = 0; col < visited.length; col++) {
                    System.out.print(visited[row][col] + " ");
                }
                System.out.println();
            }
        }

    }


    public static boolean findPath(int[][] grid, int[][] visited, int srcRow, int srcCol, int destRow, int destCol) {
        if (srcRow == destRow && srcCol == destCol) {
            visited[srcRow][srcCol] = 1;
            return true;
        } else {
            for (int ptr = 0; ptr < 4; ptr++) {
                int srcRowNew = srcRow + path1[ptr];
                int srcColNew = srcCol + path2[ptr];

                if (isSafe(grid, visited, srcRowNew, srcColNew) == true) {
                    visited[srcRowNew][srcColNew] = 1;
                    if (findPath(grid, visited, srcRowNew, srcColNew, destRow, destCol) == true) {
                        return true;
                    }
                    visited[srcRowNew][srcColNew] = 0;
                }
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] grid, int[][] visited, int srcRowNew, int srcColNew) {
        if (srcRowNew >= 0 && srcRowNew < N && srcColNew >= 0 && srcColNew < N && visited[srcRowNew][srcColNew] == 0 && grid[srcRowNew][srcColNew] != 0)
            return true;
        return false;
    }
}
