package com.idenJava.ds.DataStructures;

public class AddMatrix {

    int[][] sumMatrix(int[][]firstMatrix, int[][]secondMatrix){
        int sum[][] = new int[firstMatrix.length][secondMatrix.length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int firstMatrix[][]={{1,3,4},{2,4,3},{3,4,5}};
        int secondMatrix[][]={{1,3,4},{2,4,3},{1,2,4}};

        AddMatrix addMatrix = new AddMatrix();
        int[][] result = addMatrix.sumMatrix(firstMatrix, secondMatrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j]+",");
            }
            System.out.println();
        }


    }
}
