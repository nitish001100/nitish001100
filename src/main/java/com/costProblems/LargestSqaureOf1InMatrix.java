package com.costProblems;

/** https://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
 */

public class LargestSqaureOf1InMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0, 1, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1}};
        int row = 4;
        int col = 5;
        printMatrix(matrix, row, col);
        findMaxSquareInMatrix(matrix, row, col);
    }

    /*
       1 1 0 1 0
       0 1 1 1 0
       1 1 1 1 0
       0 1 1 1 1
    */

    private static void findMaxSquareInMatrix(int[][] matrix, int n, int m) {

        int[][] S = new int[n][m];
        int i = 0, j = 0;
        for (i = 0; i < n; i++)
            S[i][0] = matrix[i][0];

        for (j = 0; j < m; j++)
            S[0][j] = matrix[0][j];


        for (i = 1; i < n; i++) {
            for (j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    S[i][j] = Math.min(S[i][j - 1],
                            Math.min(S[i - 1][j], S[i - 1][j - 1])) + 1;
                } else
                    S[i][j] = 0;
            }
        }

        int max = Integer.MIN_VALUE, iIndex = 0, jIndex = 0;

        for (int row = 0; row < S.length; row++) {
            for (int col = 0; col < S.length; col++) {
                if (S[row][col] > max) {
                    max = S[row][col];
                    iIndex = row;
                    jIndex = col;
                }
            }
        }

        System.out.println("Maximum size sub-matrix is: ");
        for (i = iIndex; i > iIndex - max; i--) {
            for (j = jIndex; j > jIndex - max; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void printMatrix(int[][] matrix, int rowLen, int colLen) {
        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
