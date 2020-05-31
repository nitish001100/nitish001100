package com.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class BoogleBoard {

    static int N = 3;
    static int[] path1 = {-1, -1, -1, 0, 1, 0, 1, 1};
    static int[] path2 = {-1, 1, 0, -1, -1, 1, 0, 1};

    static List<String> dict = new ArrayList<>();
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        dict.add("GEEKS");
        dict.add("QUIZ");
        dict.add("FOR");
        dict.add("GO");

        int[][] visited = new int[N][N];

        for (int row = 0; row < visited.length; row++) {
            for (int col = 0; col < visited.length; col++) {
                visited[row][col] = 0;
            }
        }

        char[][] board = {
                {'G', 'I', 'Z'},
                {'U', 'E', 'K',},
                {'Q', 'S', 'E'}
        };

        String str = "";

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                visited[row][col] = 1;
                boogleBoard(str + board[row][col], board, visited, 0, 0);
                visited[row][col] = 0;
            }
        }

    }
    private static void boogleBoard(String str, char[][] board, int[][] visited, int row, int col) {
        if (dict.contains((String) str)) {
            list.add(str);
            System.out.println(str);
        }

        if (board.length == str.length()) {
            return;
        } else {
            for (int i = 0; i < 8; i++) {

                int rowNew = row + path1[i];
                int colNew = col + path2[i];

                if (isValid(visited, rowNew, colNew) == true) {
                    visited[rowNew][colNew] = 1;
                    boogleBoard(str + board[rowNew][colNew], board, visited, rowNew, colNew);
                    visited[rowNew][colNew] = 0;
                }
            }
        }
    }

    private static boolean isValid(int[][] visited, int rowNew, int colNew) {
        if (rowNew >= 0 && colNew >= 0 && rowNew < N && colNew < N && visited[rowNew][colNew] == 0)
            return true;
        return false;
    }
}
