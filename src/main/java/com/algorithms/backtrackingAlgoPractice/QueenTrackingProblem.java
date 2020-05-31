package com.algorithms.backtrackingAlgoPractice;

public class QueenTrackingProblem {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        for (int itr1 = 0; itr1 < board.length; itr1++) {
            for (int itr2 = 0; itr2 < board.length; itr2++) {
                board[itr1][itr2] = false;
            }
        }
        NQueen(board, 4, -1);
    }

    static public boolean NQueen(boolean[][] board, int size, int row) {
        if (row == size - 1) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.format("%5s", board[i][j] + " ");
                }
                System.out.println();
            }
            return true;
        } else {
            for (int col = 0; col < size; col++) {
                int rowNew = row + 1;
                if (IFValidCell(board, rowNew, col, size)) {
                    board[rowNew][col] = true;
                    if (NQueen(board, size, rowNew)) {
                        return true;
                    }
                    board[rowNew][col] = false;
                }
            }
            return false;
        }
    }

    static boolean IFValidCell(boolean[][] board, int rowNew, int colNew, int size) {

        boolean valid = true;

        for (int i = 0; i < size; i++) {
            if (board[i][colNew]) {
                valid = false;
            }
        }

        for (int i = rowNew, j = colNew; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                valid = false;
            }
        }

        for (int i = rowNew, j = colNew; i >= 0 && j < size; i--, j++) {
            if (board[i][j]) {
                {
                    valid = false;
                }
            }
        }
        return valid;
    }
}
