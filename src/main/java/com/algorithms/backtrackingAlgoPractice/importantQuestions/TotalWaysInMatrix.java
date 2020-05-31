package com.algorithms.backtrackingAlgoPractice.importantQuestions;

public class TotalWaysInMatrix {

    static int rowNum = 4;
    static int colNum = 4;

    static int destRow = 2;
    static int destCol = 3;

    static int[] path1 = {1, 1, 0};
    static int[] path2 = {0, 1, 1};

    static int count = 0;

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        int[][] visited = new int[rowNum][colNum];

        count += 1; // Including the src point. 0,0 is included.
        totalWaysInMatrix(matrix, visited, 0, 0);
    }

    private static boolean totalWaysInMatrix(int[][] matrix, int[][] visited, int row, int col) {
        if (row == destRow && col == destCol) {
            System.out.println(count);
        } else {
            for (int i = 0; i < 3; i++) {
                int rowNew = row + path1[i];
                int colNew = col + path2[i];

                if (isValid(visited, rowNew, colNew) == true) {
                    visited[rowNew][colNew] = 1;
                    count += 1;
                    if (totalWaysInMatrix(matrix, visited, rowNew, colNew) == true)
                        return true;
                    visited[rowNew][colNew] = 0;
                    count -= 1;
                }

            }

        }
        return false;
    }

    private static boolean isValid(int[][] visited, int rowNew, int colNew) {
        if (rowNew >= 0 && rowNew < rowNum && colNew >= 0 && colNew < colNum && visited[rowNew][colNew] == 0)
            return true;
        return false;
    }
}
