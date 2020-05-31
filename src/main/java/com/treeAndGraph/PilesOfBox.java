package com.treeAndGraph;

public class PilesOfBox {
    public static void main(String[] args) {
//        int[] arr = {5, 2, 1};
        int[] arr = {4, 5, 5, 2, 4};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int steps = 0;
        for (int ptr = 0; ptr < arr.length; ptr++) {
            int secondMax = findSecondMax(arr);
            int maxValueIndex = findMaxValue(arr);
            int value = arr[maxValueIndex] - secondMax;
            arr = deductSecondMaxValue(arr, ptr, secondMax, findMinValue(arr));
            steps += 1;
        }
        return steps;
    }

    private static int[] deductSecondMaxValue(int[] arr, int ptr, int secondMaxValue, int minValue) {
        for (int itr = 0; itr < arr.length-1; itr++) {
            if (arr[itr] != minValue) {
                arr[itr+1] = arr[itr+1] - (arr[findMaxValue(arr)] - secondMaxValue);
                break;
            }
        }
        return arr;
    }

    private static int findMaxValue(int[]arr){
        int maxValue = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
                index = i;
            }
        }
        return index;
    }
    private static int findMinValue(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] < minValue)
                minValue = arr[itr];
        }
        return minValue;
    }

    private static int findSecondMax(int[] arr) {
        int i, first, second;

        if (arr.length < 2) {
            return -1;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        return second;
    }
}
