package com.idenJava.geeksOfGeeks;

import java.util.Arrays;

/**
 * Find a pair (n,r) in an integer array such that value of nPr is maximum
 * n!/(n-r)!
 */
public class Problem1 {

    static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    static int solution(int[] arr) {
        arr = sortArray(arr);
        int n = arr[arr.length-1];
        int r = arr[arr.length - 2];
        return factorial(n)/factorial(n-r);
    }

    static int factorial(int num) {
        int i, fact = 1;
        int number = num;//It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 0, 2, 3, 4, 1, 6, 8, 9 };
        System.out.println(solution(arr));
    }
}
