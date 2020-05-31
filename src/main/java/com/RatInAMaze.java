package com;

public class RatInAMaze {
    static int N = 4;
    static int srcRowIndex = 0;
    static int srcColIndex = 0;
    static int destRowIndex = 3;
    static int destColIndex = 3;

    static int[] pathRow1 = {1, 0, 0, -1};
    static int[] pathRow2 = {0, 1, -1, 0};

    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 1}
        };


        int[][] visitedArray = new int[N][N];
        for (int itr1 = 0; itr1 < visitedArray.length; itr1++) {
            for (int itr2 = 0; itr2 < visitedArray.length; itr2++) {
                visitedArray[itr1][itr2] = 0;
            }
        }

        ratInAMazeSolution(maze, srcRowIndex, srcColIndex, visitedArray);

    }

    private static boolean ratInAMazeSolution(int[][] maze, int row, int col, int[][] visitedArray) {

        if (row == destRowIndex && col == destColIndex) {
            visitedArray[row][col] = 1;
            for (int itr1 = 0; itr1 < visitedArray.length; itr1++) {
                for (int itr2 = 0; itr2 < visitedArray.length; itr2++) {
                    System.out.print(visitedArray[itr1][itr2] + " ");
                }
                System.out.println();
            }

        } else {

            for (int index = 0; index < 4; index++) {

                int rowNew = row + pathRow1[index];
                int colNew = col + pathRow2[index];

                if (isSafe(maze, rowNew, colNew, visitedArray)) {

                    visitedArray[rowNew][colNew] = 1;
                    if (ratInAMazeSolution(maze, rowNew, colNew, visitedArray) == true)
                        return true;

                    visitedArray[row][col] = 0;

                    return false;
                }
            }

        }

        return false;
    }

    private static boolean isSafe(int[][] maze, int row, int col, int[][] visitedArray) {
        if (row >= 0 && row < N && col >= 0 && col < N && maze[row][col] == 1 && visitedArray[row][col] == 0)
            return true;
        return false;
    }
}
