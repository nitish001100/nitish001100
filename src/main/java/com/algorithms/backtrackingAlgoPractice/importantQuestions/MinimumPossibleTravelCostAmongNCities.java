package com.algorithms.backtrackingAlgoPractice.importantQuestions;

public class MinimumPossibleTravelCostAmongNCities {
    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 3, 4};
        int sum = minimumPossibleTravelCostAmongNCities(arr);
        System.out.println(sum);
    }

    private static int minimumPossibleTravelCostAmongNCities(int[] arr) {
        int min = Integer.MAX_VALUE;
        int itr = 0, sum = 0;
        while (itr < arr.length) {
            if (arr[itr] < min)
                min = arr[itr];
            sum+=min;
            itr += 1;
        }
        return sum;
    }
}
