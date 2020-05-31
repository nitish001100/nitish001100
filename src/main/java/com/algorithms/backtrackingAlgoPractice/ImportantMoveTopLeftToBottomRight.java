package com.algorithms.backtrackingAlgoPractice;

public class ImportantMoveTopLeftToBottomRight {
    static int N = 5;
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {1, 0, 0, 1, 1},
                {0, 1, 0, 1, 1},
                {0, 0, 0, 0, 1},
        };
        int[][] sol = new int[N][N];
        for (int row = 0; row < sol.length; row++) {
            for (int col = 0; col < sol.length; col++) {
                sol[row][col] = 0;
            }
        }
        solveMazeUtil(matrix, 0, 0, sol);

        for (int row = 0; row < sol.length; row++) {
            for (int col = 0; col < sol.length; col++) {
                System.out.print(sol[row][col]+" ");
            }
            System.out.println();
        }
    }
    private static boolean isSafe(int[][] matrix, int i, int j) {
        if (i >= 0 && i < N && j >= 0 && j < N && matrix[i][j] == 1)
            return true;
        return false;
    }
    private static boolean solveMazeUtil(int[][] matrix, int i, int j, int[][] sol) {
        // base case.
        if (i == N - 1 && j == N - 1) {
            sol[i][j] = 1;
            return true;
        }
        if (isSafe(matrix, i, j) == true) {
            sol[i][j] = 1;
            if (solveMazeUtil(matrix, i + 1, j, sol) == true) {
                return true;
            }
            if (solveMazeUtil(matrix, i, j + 1, sol) == true) {
                return true;
            }
            sol[i][j] = 0;
            return false;
        }
        return false;
    }
}
