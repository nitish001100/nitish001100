package com.algorithms.backtrackingAlgoPractice.importantQuestions;


// Below code is with backtracking -

public class MinCostFromSrcToDest {
    static int srcRow = 0;
    static int srcCol = 0;
    static int destRow = 2;
    static int destCol = 3;

    static int numOfRow = 3;
    static int numOfCol = 4;

    static int[] path1 = {1, 0};
    static int[] path2 = {0, 1};

    static int sum = Integer.MAX_VALUE;
    static int minSum = 0;

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 8},
                {4, 2, 1, 7},
                {4, 3, 2, 3}
        };

        int[][] visitedArray = new int[numOfRow][numOfCol];

        minSum += matrix[0][0];

        minCostFromSrcToDest(matrix, visitedArray, srcRow, srcCol, destRow, destCol);

        System.out.println(sum);

    }

    private static boolean minCostFromSrcToDest(int[][] matrix, int[][] visitedArray, int row, int col, int destRow, int destCol) {

        if (row == destRow && col == destCol) {
            if(sum > minSum)
                sum = minSum;
        } else {
            for (int i = 0; i < 2; i++) {

                int rowNew = row + path1[i];
                int colNew = col + path2[i];

                if (isValid(visitedArray, rowNew, colNew) == true) {
                    visitedArray[rowNew][colNew] = 1;
                    minSum+=matrix[rowNew][colNew];
                    if(minCostFromSrcToDest(matrix, visitedArray, rowNew, colNew, destRow, destCol) == true){
                        return true;
                    }
                    visitedArray[rowNew][colNew] = 0;
                    minSum-=matrix[rowNew][colNew];
                }
            }
        }


        return false;
    }

    private static boolean isValid(int[][] visitedArray, int rowNew, int colNew) {
        if(rowNew>=0 && rowNew<3 && colNew >=0 && colNew<4 && visitedArray[rowNew][colNew] == 0)
            return true;
        return false;
    }
}
