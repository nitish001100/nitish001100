package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class MatrixInSpiralForm {
    static int row = 3;
    static int col = 6;

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};
        matrixInSpiralForm(3, 6, matrix);
    }

    private static void matrixInSpiralForm(int m, int n, int[][] a) {
        /*k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index*/

        int i, k = 0, l = 0;
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            // Print the last column from the remaining columns
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // Print the first column from the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
}
