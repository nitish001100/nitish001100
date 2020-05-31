package com.payPal;

public class MatrixTransversal {
    private static void printMatrix(int mat[][], int m, int n, int i, int j, int path[], int idx) {
        path[idx] = mat[i][j];
        if (i == m - 1) {
            for (int k = j + 1; k < n; k++) {
                path[idx + k - j] = mat[i][k];
            }
            for (int l = 0; l < idx + n - j; l++) {
                System.out.print(path[l] + " ");
            }
            System.out.println();
            return;
        }
        if (j == n - 1) {
            for (int k = i + 1; k < m; k++) {
                path[idx + k - i] = mat[k][j];
            }
            for (int l = 0; l < idx + m - i; l++) {
                System.out.print(path[l] + " ");
            }
            System.out.println();
            return;
        }
        printMatrix(mat, m, n, i + 1, j, path, idx + 1);
        printMatrix(mat, m, n, i, j + 1, path, idx + 1);
    }

    public static void main(String[] args) {
        int m = 4;
        int n = 2;
        int mat[][] = {
                {100, 20}, {30, 59}, {71,81}, {9,200}};
        int maxLengthOfPath = m + n - 1;
        printMatrix(mat, m, n, 0, 0, new int[maxLengthOfPath], 0);
    }
}
