package com.algorithms.backtrackingAlgoPractice;

public class ImportantKnightTourProblem {

    static int[] path1 = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] path2 = {1, 2, 2, 1, -1, -2, -2, -1};
    static int N = 8;

    public static void main(String[] args) {
        int[][] visitedArray = new int[N][N];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                visitedArray[row][col] = 0;
            }
        }
        visitedArray[0][0] = 1;
        int move = 1;
        knightProblem(visitedArray, 0, 0, move);
    }

    private static boolean knightProblem(int[][] visitedArray, int row, int col, int move) {

        if (move == 64) {
            for (int itr1 = 0; itr1 < visitedArray.length; itr1++) {
                for (int itr2 = 0; itr2 < visitedArray.length; itr2++) {
                    System.out.format("%5s", visitedArray[itr1][itr2] + " ");
                }
                System.out.println();
            }
            return true;
        } else {
            for (int index = 0; index < N; index++) {
                int rowNew = row + path1[index];
                int colNew = col + path2[index];

                if (isSafe(visitedArray, rowNew, colNew) == true) {
                    move += 1;
                    visitedArray[rowNew][colNew] = move;
                    if (knightProblem(visitedArray, rowNew, colNew, move) == true)
                        return true;
                    move -= 1;
                    visitedArray[rowNew][colNew] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] visitedArray, int rowNew, int colNew) {
        if (rowNew >= 0 && colNew >= 0 && rowNew < N && colNew < N && visitedArray[rowNew][colNew] == 0)
            return true;
        return false;
    }
}
