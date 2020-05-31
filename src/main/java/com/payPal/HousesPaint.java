package com.payPal;

public class HousesPaint {
    public static void main(String[] args) {
        int[][] cm = {
                {2, 5},
                {1, 6},
                {2, 7},
                {4, 3}
        };

        int[][] tcm = {
                {0, 0},
                {0, 0},
                {0, 0},
                {0, 0}
        };

        compute_min_total_cost(cm, tcm, cm.length, cm[0].length);
    }

    private static void compute_min_total_cost(int[][] cm, int[][] tcm, int num_houses, int num_colors) {
        for (int i = 0; i < num_houses; i++) {
            if (i == 0) {
                for (int j = 0; j < num_colors; j++) {
                    tcm[i][j] = cm[i][j];
                }
            } else {
                for (int j = 0; j < num_colors; j++) {
                    int cost_house_ij = cm[i][j];
                    tcm[i][j] = cost_house_ij + min_cost_prior_houses(tcm[i - 1], j);
                }
            }
        }

        System.out.println(minValueInArray(tcm[tcm.length - 1]));
    }

    private static int minValueInArray(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int itr = 0; itr < array.length; itr++) {
            if (min > array[itr])
                min = array[itr];
        }
        return min;
    }

    private static int min_cost_prior_houses(int[] tcm, int j) {
        int min = Integer.MAX_VALUE;

        for (int itr = 0; itr < tcm.length; itr++) {
            if (itr != j)
                if (min > tcm[itr])
                    min = tcm[itr];
        }
        return min;
    }
}
