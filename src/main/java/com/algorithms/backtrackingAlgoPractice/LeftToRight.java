package com.algorithms.backtrackingAlgoPractice;

public class LeftToRight {
    static int N = 5;

    public static void main(String[] args) {
/*        int[][] matrix = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {1, 0, 0, 1, 1},
                {0, 1, 0, 1, 1},
                {0, 0, 0, 0, 1},
        };*/

        int[][] matrix = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1},
        };

        int[][] sol = new int[N][N];

        for (int row = 0; row < sol.length; row++) {
            for (int col = 0; col < sol.length; col++) {
                sol[row][col] = 0;
            }
        }

        leftToRight(matrix, 0, 0, sol);

        for (int row = 0; row < sol.length; row++) {
            for (int col = 0; col < sol.length; col++) {
                System.out.print(sol[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static boolean leftToRight(int[][] matrix, int row, int col, int[][] sol) {
        if (row == N - 1 && col == N - 1) {
            sol[row][col] = 1;
            return true;
        } else {
            if (isSafe(matrix, row, col) == true) {

                sol[row][col] = 1;

                /**
                 *  Possible movement to move from left to right -
                 *  1: pos to right
                 *  2: pos to down
                 *  3: pos to diagonal.
                 */

                if (leftToRight(matrix, row + 1, col, sol) == true)
                    return true;

                if (leftToRight(matrix, row, col + 1, sol) == true)
                    return true;

                if(leftToRight(matrix, row+1, col+1, sol) == true)
                    return true;

                sol[row][col] = 0;

                return false;
            }
        }
        return false;
    }


    private static boolean isSafe(int[][] matrix, int row, int col) {
        if (row >= 0 && col >= 0 && row < N && col < N && matrix[row][col] == 1)
            return true;
        return false;
    }

}
