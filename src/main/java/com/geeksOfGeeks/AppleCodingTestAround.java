package com.geeksOfGeeks;

public class AppleCodingTestAround {

    /**
     * 1  4  5  7  8
     * 9  14 17 18 19
     * 20 22 25 27 30
     */
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 4, 5, 7, 8}, {9, 14, 17, 18, 19}, {20, 22, 25, 27, 30}};

        int ele = 17;


        for (int row = 0; row < arr.length; row++) {
            if ((arr[row][0] < ele || arr[row][0] == ele) && (arr[row][4] > ele || arr[row][4] == ele)) {
                int[] arrEle = new int[5];
                for (int i = 0; i < 5; i++) {
                    arrEle[i] = arr[row][i];
                }
                findEle(arrEle, ele);
                break;
            }
        }
    }

    static int findEle(int[] arr, int ele) {

        // 9 14 17 18 19
        if (arr[arr.length / 2] == ele || arr[arr.length / 2]-1 == ele)
            return ele;

        if (arr[arr.length / 2] >= ele) {
            //left Side.
                int[] leftSide = new int[3];
                for (int i = 0; i <= arr.length / 2; i++)
                    leftSide[i] = arr[i];
                findEle(leftSide, ele);
        } else {
            //right Side.
                int[] rightSide = new int[2];
                for (int i = arr.length / 2, j = 0; i < arr.length; i++) {
                    rightSide[j] = arr[i];
                    j = j + 1;
                }
                findEle(rightSide, ele);
            }
        return -1;
    }
}
