package com.algorithms.backtrackingAlgoPractice;

public class KnightTourProblem {
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
                matrix[row][col] = 0;
            }
        }

        int move = 0;
        matrix[0][0] = 1;
        move += 1;
        knightTourProblem(matrix, 0, 0, visited, move);
    }


    private static boolean knightTourProblem(int[][] matrix, int row, int col, int[][] visited, int move) {
        if (move == 64) {
            for (int itr1 = 0; itr1 < N; itr1++) {
                for (int itr2 = 0; itr2 < N; itr2++) {
                    System.out.format("%5s", matrix[itr1][itr2] + " ");
                }
                System.out.println();
            }

            return true;
        } else {
            for (int index = 0; index < 8; index++) {

                int rowNew = row + path1[index];
                int colNew = col + path2[index];

                if (isSafe(visited, rowNew, colNew) == true) {
                    move += 1;
                    visited[rowNew][colNew] = 1;
                    matrix[rowNew][colNew] = move;
                    if (knightTourProblem(matrix, rowNew, colNew, visited, move) == true)
                        return true;
                    move -= 1;
                    visited[rowNew][colNew] = 0;
                    matrix[rowNew][colNew] = move;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] visited, int rowNew, int colNew) {
        if (rowNew >= 0 && colNew >= 0 && rowNew < N && colNew < N && visited[rowNew][colNew] == 0)
            return true;
        return false;
    }
}
