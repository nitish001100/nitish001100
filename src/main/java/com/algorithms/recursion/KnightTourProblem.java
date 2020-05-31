package com.algorithms.recursion;

public class KnightTourProblem {

    static int[] path1 = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] path2 = {1, 2, 2, 1, -1, -2, -2, -1};
    static int N = 8;

    public static void main(String[] args) {
        int[][] res = new int[N][N];
        int[][] visited = new int[N][N];

        for (int row = 0; row < visited.length; row++) {
            for (int col = 0; col < visited.length; col++) {
                visited[row][col] = 0;
            }
        }

        int srcRow = 0, srcCol = 0, move = 0;
        visited[srcRow][srcCol] = 1;
        move += 1;
        res[srcRow][srcCol] = move;

        knightTourProblemSolution(res, visited, srcRow, srcCol, move);

    }


    private static boolean knightTourProblemSolution(int[][] res, int[][] visited, int row, int col, int move) {

        if (move == 64) {
            for (int row1 = 0; row1 < res.length; row1++) {
                for (int col1 = 0; col1 < res.length; col1++) {
                    System.out.format("%5s",res[row1][col1] + " ");
                }
                System.out.println();
            }
            return true;
        } else {
            for (int i = 0; i < 8; i++) {

                int rowNew = row + path1[i];

                int colNew = col + path2[i];

                if (isValid(visited, rowNew, colNew) == true) {
                    visited[rowNew][colNew] = 1;
                    move += 1;
                    res[rowNew][colNew] = move;

                    if (knightTourProblemSolution(res, visited, rowNew, colNew, move) == true)
                        return true;

                    visited[rowNew][colNew] = 0;
                    move -= 1;
                    res[rowNew][colNew] = 0;
                }

            }
        }

        return false;
    }

    private static boolean isValid(int[][] visited, int rowNew, int colNew) {
        if (rowNew >= 0 && colNew >= 0 && rowNew < N && colNew < N && visited[rowNew][colNew] == 0)
            return true;
        return false;
    }
}
