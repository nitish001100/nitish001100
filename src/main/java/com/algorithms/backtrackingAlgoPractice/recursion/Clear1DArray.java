package com.algorithms.backtrackingAlgoPractice.recursion;

public class Clear1DArray {
    static int len = 5;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        clear(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] clear(int[] arr, int index) {
        if (index == arr.length && arr.length == 0) {
            return arr;
        } else {
            int[] temp = new int[( len - index)];

            int counter = 0;
            for (int i = index; i < len; i++) {
                temp[counter] = arr[i];
                counter+=1;
            }

            clear(temp, index + 1);

        }

        return null;
    }
}
