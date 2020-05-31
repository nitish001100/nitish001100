package com.treeAndGraph;

public class JumpGame {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 1, 1, 4};
        int[] arr = {3, 2, 1, 0, 4};
        jumpGame(arr);
    }

    private static void jumpGame(int[] arr) {
        int counter = 0;
        int alreadyJump = 0;
        boolean flag = false;

        while (counter < arr.length) {
            int toJump = arr[counter];
            if (alreadyJump != arr.length - 1) {
                alreadyJump += arr[counter];
            } else {
                flag = true;
            }
            if (arr[counter] == 0)
                break;
            else
                counter = counter + toJump;
        }

        if (flag)
            System.out.println("True!!");
        else
            System.out.println("False!!");
    }
}
