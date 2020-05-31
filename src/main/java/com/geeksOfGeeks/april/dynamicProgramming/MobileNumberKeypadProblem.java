package com.geeksOfGeeks.april.dynamicProgramming;

public class MobileNumberKeypadProblem {
    public static void main(String[] args) {
        int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-0, 0, -0}};
        printKeypad(keypad);
        sumOnKeypad(keypad);
    }

    private static void sumOnKeypad(int[][] keypad) {

    }

    public static void printKeypad(int[][]keypad){
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                System.out.print(keypad[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
