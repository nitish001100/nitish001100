package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class FindMissingNumber {
    public static void main(String[] args) {
        int lastEle = 5;
        int[]arr = {1,2,3,5};
        int totalSum = lastEle * (lastEle + 1) / 2;
        int num = missingSum(arr, totalSum);
        System.out.println(num);
    }

    private static int missingSum(int[]arr, int totalSum){
        int currentSum = 0;
        for (int itr = 0; itr < arr.length; itr++)
            currentSum+=arr[itr];

        return totalSum-currentSum;
    }
}

/**
 Time Complexity: O(n)
 */
