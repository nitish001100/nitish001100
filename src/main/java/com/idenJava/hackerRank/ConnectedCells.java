package com.idenJava.hackerRank;

public class ConnectedCells {

    static int regionSize(int[][] matrix){
        int maxRegion = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if(matrix[row][column] == 1){
                    int size = getMaxSize(matrix, row, column);
                    maxRegion = Math.max(size,maxRegion);
                }
            }
        }
        return maxRegion;
    }

    private static int getMaxSize(int[][] matrix, int row, int column) {

        if( row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length)
            return 0;

        if(matrix[row][column] == 0)
            return 0;


        matrix[row][column] = 0;

        int size = 1;


        for(int r = row-1; r <= row+1 ; r++){
            for(int c =column -1 ; c <=column+1 ; c++){
                if(r!=row || c!=column){
                    size = size+getMaxSize(matrix, r, c);
                }

            }
        }

        return size;
    }

    public static void main(String[] args) {
        ConnectedCells connectedCells = new ConnectedCells();
    }
}
