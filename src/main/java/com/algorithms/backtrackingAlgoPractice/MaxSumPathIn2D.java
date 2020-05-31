package com.algorithms.backtrackingAlgoPractice;

public class MaxSumPathIn2D {
    static int N = 3;

    static int srcRow = 0;
    static int srcCol = 0;
    static int destRow = 2;
    static int destCol = 2;
    static int[] path1 = {0, 1, 0};
    static int[] path2 = {1, 0, 1};
    static int sum = Integer.MIN_VALUE;
    static int tempSum = 0;

    public static void main(String[] args) {
        int mat[][] = {
                {100, -350, -200},
                {-100, -300, 700}
        };

        int[][] visited = new int[N][N];
        for (int itr1 = 0; itr1 < visited.length; itr1++) {
            for (int itr2 = 0; itr2 < visited.length; itr2++) {
                visited[itr1][itr2] = 0;
            }
        }

        tempSum += mat[srcRow][srcCol];

        maxSumPathIn2D(mat, visited, srcRow, srcCol);

        System.out.println(sum);
    }

    private static boolean maxSumPathIn2D(int[][] mat, int[][] visited, int row, int col) {
        if (row == destRow && col == destCol) {
            if (sum < tempSum)
                sum = tempSum;
        } else {
            for (int i = 0; i < 3; i++) {
                int rowNew = row + path1[i];
                int colNew = col + path2[i];

                if (isValid(rowNew, colNew, visited) == true) {
                    visited[rowNew][colNew] = 1;
                    tempSum += mat[rowNew][colNew];
                    if (maxSumPathIn2D(mat, visited, rowNew, colNew) == true)
                        return true;
                    visited[rowNew][colNew] = 0;
                    tempSum -= mat[rowNew][colNew];
                }
            }
        }
        return false;
    }

    private static boolean isValid(int rowNew, int colNew, int[][] visited) {
        if (rowNew >= 0 && colNew >= 0 && rowNew < N && colNew < N && visited[rowNew][colNew] == 0)
            return true;
        return false;
    }
}

