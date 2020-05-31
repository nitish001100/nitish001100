package com.payPal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Util {
    public static void printPath(List<Integer> path, int last) {
        for (int i : path) {
            System.out.print(i + " - ");
        }
        System.out.println(last);
    }

    public static void findPaths(int[][] mat, List<Integer> path, Map<List<Integer>, List<Integer>> indexes, int i, int j) {
        int M = mat.length;
        int N = mat[0].length;
        if (i == M - 1 && j == N - 1) {
            printPath(path, mat[i][j]);
            return;
        }
        path.add(mat[i][j]);
        List<Integer> srcDest = new ArrayList<>();
        srcDest.add(i);
        srcDest.add(j);
        indexes.put(path, srcDest);

        if ((i >= 0 && i < M && j + 1 >= 0 && j + 1 < N)) {
            findPaths(mat, path, indexes, i, j + 1);
        }
        if ((i + 1 >= 0 && i + 1 < M && j >= 0 && j < N)) {
            findPaths(mat, path, indexes, i + 1, j);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        List<Integer> path = new ArrayList<>();
        Map<List<Integer>, List<Integer>> indexes = new HashMap<>();
        int x = 0, y = 0;
        findPaths(mat, path, indexes, x, y);
    }
}
