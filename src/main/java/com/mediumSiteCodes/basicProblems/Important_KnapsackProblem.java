package com.mediumSiteCodes.basicProblems;

/**
 * Below is Knapsack problem. Please have a look
 */

//@ impByNitish
public class Important_KnapsackProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 7, 4};
        int[] weightArr = {20, 5, 10, 40, 15, 25};
        int sum = 10;
        subProblem(arr, weightArr, sum);
    }


    private static void subProblem(int[] arr, int[] weightArray, int sum) {
        int buffer = Integer.MIN_VALUE;
        int value1 = 0, value2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i]+arr[j]) < sum){
                    if(buffer < (Math.abs(arr[i]-arr[j]))){
                        buffer = Math.abs(arr[i]-arr[j]);
                        value1 = i;
                        value2 = j;
                    }
                }
            }
        }
        System.out.println(weightArray[value1]+weightArray[value2]);
    }
}
