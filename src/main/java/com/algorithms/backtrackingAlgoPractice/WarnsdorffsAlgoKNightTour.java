package com.algorithms.backtrackingAlgoPractice;

public class WarnsdorffsAlgoKNightTour {

    static int N = 8;
    static int[] path1 = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] path2 = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {

        int[][] matrix = new int[N][N];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = 0;
            }
        }

        int[][] visited = new int[N][N];

        for (int row = 0; row < visited.length; row++) {
            for (int col = 0; col < visited.length; col++) {
                visited[row][col] = 0;
            }
        }
        int move = 0;
        matrix[0][0] = 1;
        move += 1;
        knightTourProblem(matrix, visited, move, 0, 0);

    }

    private static boolean knightTourProblem(int[][] matrix, int[][] visited, int move, int row, int col) {
        if (move == 64) {
            for (int itr1 = 0; itr1 < matrix.length; itr1++) {
                for (int itr2 = 0; itr2 < matrix.length; itr2++) {
                    System.out.format("%5s", matrix[itr1][itr2]+" ");
                }
                System.out.println();
            }
            return true;
        } else {

            for (int i = 0; i < N; i++) {
                int rowNew = row + path1[i];
                int colNew = col + path2[i];

                if (isSafe(matrix, rowNew, colNew, visited)) {
                    visited[rowNew][colNew] = 1;
                    move += 1;
                    matrix[rowNew][colNew] = move;
                    if (knightTourProblem(matrix, visited, move, rowNew, colNew) == true) {
                        return true;
                    }
                    matrix[rowNew][colNew] = 0;
                    move -= 1;
                    visited[rowNew][colNew] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] matrix, int rowNew, int colNew, int[][] visited) {
        if (rowNew >= 0 && colNew >= 0 && rowNew < N && colNew < N && visited[rowNew][colNew] == 0 && matrix[rowNew][colNew] == 0)
            return true;
        return false;
    }
}
