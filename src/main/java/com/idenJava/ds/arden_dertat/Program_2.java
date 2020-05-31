package com.idenJava.ds.arden_dertat;


public class Program_2 {

    static int sub2DArray(int[][] matrix){
        int maxSum = 0;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int k = 0; k < matrix.length-1; k++) {
                if(matrix[i][k] == 1 &&  matrix[i+1][k] == 1 && matrix[i][k+1] ==1 && matrix[i+1][k+1] == 1){
                    maxSum = matrix[i][k] + matrix[i+1][k] + matrix[i][k+1] + matrix[i+1][k+1];
                }
            }
        }
        return maxSum;
    }


    static int subArray(int[][] matrix){

        int maxSum = 0, ver = 0, hor = 0;


        while (ver < matrix.length-1){
            while (hor < matrix.length-1){
                if(matrix[ver][hor]!=0){
                    if(matrix[ver][hor] == 1 &&  matrix[ver+1][hor] == 1 && matrix[ver][hor+1] ==1 && matrix[ver+1][hor+1] == 1){
                        maxSum = matrix[ver][hor] + matrix[ver+1][hor] + matrix[ver][hor+1] + matrix[ver+1][hor+1];
                    }
                }else {
                    hor = hor+1;
                }
            }
            ver = ver+1;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,1,1,1},
                {1,1,1,0,0},
                {0,1,0,1,1},
                {0,1,0,1,1},
                {0,1,0,1,1}
        };


        System.out.println("Given array is - ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Max Sum = " + sub2DArray(matrix));


        System.out.println(subArray(matrix));
    }
}
