package com.geeksOfGeeks.april.dynamicProgramming;

public class kadaneAlgorithm_MaxContagiousSum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSumWithN3 = contagiousSumWithN3(arr);
        System.out.println("Time Complexity is: n3 and output is: " + maxSumWithN3);
        System.out.println("Time Complexity is: n2 and output is: " + contagiousSumWithTcN2(arr));
        System.out.println("Time Complexity is: n and output is: " + contagiousSumWithKadaneAlgorithm(arr));
    }

    //Brute Force Solution - Time Complexity - n3.

    public static int contagiousSumWithN3(int[] arr) {
        int sum = 0;
        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = 0; itr2 < arr.length; itr2++) {
                int tempSum = 0;
                for (int itr3 = itr1; itr3 <= itr2; itr3++) {
                    tempSum += arr[itr3];
                }
                if (sum < tempSum)
                    sum = tempSum;
            }
        }
        return sum;
    }

    //Time Complexity - n2.
    public static int contagiousSumWithTcN2(int[] arr) {
        int sum = 0;
        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            int tempSum = 0;
            for (int itr2 = itr1 + 1; itr2 < arr.length - itr1; itr2++) {
                tempSum += arr[itr2];
                if (sum < tempSum)
                    sum = tempSum;
            }
        }
        return sum;
    }

    // Kadane Algorithm.
    public static int contagiousSumWithKadaneAlgorithm(int[] arr) {
        int sum = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], (currentMax + arr[i]));
            sum = Math.max(sum, currentMax);
        }
        return sum;
    }
}
