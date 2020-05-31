package com.algorithms.backtrackingAlgoPractice;

public class SourceTODestination {
    static int N = 5;
    static int row = 0;
    static int col = 0;
    static int destRow = 4;
    static int destCol = 4;

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 1, 1},
        };

        int[][] visited = new int[N][N];

        for (int itr1 = 0; itr1 < visited.length; itr1++) {
            for (int itr2 = 0; itr2 < visited.length; itr2++) {
                visited[itr1][itr2] = 0;
            }
        }

        findAWay(maze, row, col, destRow, destCol, visited);
    }

    private static boolean findAWay(int[][] maze, int row, int col, int destRow, int destCol, int[][] visited) {
        if (row == destRow && col == destCol) {
            visited[destRow][destCol] = 1;
            for (int itr1 = 0; itr1 < visited.length; itr1++) {
                for (int itr2 = 0; itr2 < visited.length; itr2++) {
                    System.out.print(visited[itr1][itr2]);
                }
                System.out.println();
            }
            return true;
        } else {

            if (isValid(maze, row, col, visited) == true) {

                visited[row][col] = 1;

                if (findAWay(maze, row + 1, col, destRow, destCol, visited) == true)
                    return true;

                if (findAWay(maze, row, col + 1, destRow, destCol, visited) == true)
                    return true;

                visited[row][col] = 0;
            }
        }
        return false;
    }


    private static boolean isValid(int[][] maze, int row, int col, int[][] visited) {
        if (row >= 0 && col >= 0 && row < N && col < N && maze[row][col] == 1 && visited[row][col] == 0)
            return true;
        return false;
    }


}
