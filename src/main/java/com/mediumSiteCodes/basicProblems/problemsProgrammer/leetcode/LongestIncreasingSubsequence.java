package com.mediumSiteCodes.basicProblems.problemsProgrammer.leetcode;


public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        longestIncreasingSubSequenceDynamicProgramming(arr);
    }


    /*
    Input  : arr[] = {3, 10, 2, 11}
    LIS[] = {1, 1, 1, 1} (initially)
    Iteration-wise simulation :

    arr[2] > arr[1] {LIS[2] = max(LIS [2], LIS[1]+1)=2}
    arr[3] < arr[1] {No change}
    arr[3] < arr[2] {No change}
    arr[4] > arr[1] {LIS[4] = max(LIS [4], LIS[1]+1)=2}
    arr[4] > arr[2] {LIS[4] = max(LIS [4], LIS[2]+1)=3}
    arr[4] > arr[3] {LIS[4] = max(LIS [4], LIS[3]+1)=3}

    */

    //TODO thru dynamic programming.
    public static void longestIncreasingSubSequenceDynamicProgramming(int[] arr) {

    }
}
