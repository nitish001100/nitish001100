package com.mediumSiteCodes.basicProblems;

import java.util.HashMap;

public class DuplicateRowsInBinaryMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 1, 0, 0}
        };

        HashMap<Integer, HashMap<Integer, Integer>> hm = duplicateRowsInBinaryMatrix(matrix);

        System.out.println(hm);
    }

    static int zero = 0;
    static int one = 1;

    public static HashMap<Integer, HashMap<Integer, Integer>> duplicateRowsInBinaryMatrix(int[][] matrix) {
        HashMap<Integer, HashMap<Integer, Integer>> hm = new HashMap<>();

        HashMap<Integer, Integer> subHm = new HashMap<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == zero) {
                    if (!subHm.containsKey(zero)) {
                        subHm.put(zero, 1);
                    } else if (subHm.containsKey(zero)) {
                        Integer value = subHm.get(zero);
                        value += 1;
                        subHm.remove(zero);
                        subHm.put(zero, value);
                    }
                }

                if (matrix[row][col] == one) {
                    if (!subHm.containsKey(one)) {
                        subHm.put(one, 1);
                    } else if (subHm.containsKey(one)) {
                        Integer value = subHm.get(one);
                        value += 1;
                        subHm.remove(one);
                        subHm.put(one, value);
                    }
                }
            }
            hm.put(row, subHm);
        }
        return hm;
    }
}
