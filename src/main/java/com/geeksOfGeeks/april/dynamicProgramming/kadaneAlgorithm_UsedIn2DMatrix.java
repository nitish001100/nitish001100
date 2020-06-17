package com.geeksOfGeeks.april.dynamicProgramming;


/**
 * Maximum sum rectangle in a 2D matrix | DP-27
 **/

class Result {
    int maxSum, leftBound, rightBound, upBound, lowBound;

    public Result(int maxSum, int leftBound, int rightBound, int upBound, int lowBound) {
        this.maxSum = maxSum;
        this.leftBound = leftBound;
        this.rightBound = rightBound;
        this.upBound = upBound;
        this.lowBound = lowBound;
    }

    @Override
    public String toString() {
        return "Result{" +
                "maxSum=" + maxSum +
                ", leftBound=" + leftBound +
                ", rightBound=" + rightBound +
                ", upBound=" + upBound +
                ", lowBound=" + lowBound +
                '}';
    }
}
public class kadaneAlgorithm_UsedIn2DMatrix {
    public static void main(String[] args) {
        int numOfRows = 4, numOfCols = 5;
        int[][] matrix = {{2, 1, -3, -4, 5}, {0, 6, 3, 4, 1}, {2, -2, -1, 4, -5}, {-3, 3, 1, 0, 3}};
        Result maxSum = kadaneAlgorithm_UsedIn2DMatrix(matrix, numOfRows, numOfCols);
        System.out.println(maxSum.toString());
    }


    // Main Logic: See this video to understand the logic -

    /**
     https://www.youtube.com/watch?v=yCQN096CwWM
     https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/SubRectangularMatrixWithMaximumSum.java*/

    public static Result kadaneAlgorithm_UsedIn2DMatrix(int[][] matrix, int numOfRows, int numOfCols) {
        printMatrix(matrix, numOfRows, numOfCols);
        int rows = matrix.length;
        int cols = matrix[0].length;
        int temp[] = new int[rows];
        int maxSum = Integer.MIN_VALUE;
        int leftBound = Integer.MIN_VALUE;
        int rightBound = Integer.MIN_VALUE;
        int upBound = Integer.MIN_VALUE;
        int lowBound = Integer.MIN_VALUE;

        for (int left = 0; left < cols; left++) {
            for (int i = 0; i < rows; i++) {
                temp[i] = 0;
            }
            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }
                String subArrayResult = applyKadaneAlgorithm(temp);
                String[] strArr = subArrayResult.split(",");

                if (Integer.valueOf(strArr[0]) > maxSum) {
                    maxSum = Integer.valueOf(strArr[0]);
                    leftBound = left;
                    rightBound = right;
                    upBound = Integer.valueOf(strArr[1]);
                    lowBound = Integer.valueOf(strArr[2]);;
                }
            }
        }

        Result result = new Result(maxSum, leftBound, rightBound, upBound, lowBound);
        return result;
    }

    private static String applyKadaneAlgorithm(int[] subArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = subArray.length;
        int max_so_far = Integer.MIN_VALUE,
                max_ending_here = 0, start = 0,
                end = 0, s = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here += subArray[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        stringBuilder.append(max_so_far + ",");
        stringBuilder.append(start + ",");
        stringBuilder.append(end + ",");

        return stringBuilder.toString();
    }

    private static void printMatrix(int[][] matrix, int numOfRows, int numOfCols) {
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfCols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
