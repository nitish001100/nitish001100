package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int arr[] = {1, 14, 2, 16, 10, 20};
        thirdLargestElement(arr);
    }

    // Tc :  O(n)
    private static void thirdLargestElement(int[] arr) {
        int maxSum = 0;
        int secondMaxSum = 0;
        int thirdMaxSum = 0;

        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] > maxSum) {
                thirdMaxSum = secondMaxSum;
                secondMaxSum = maxSum;
                maxSum = arr[itr];
            } /* If arr[i] is in between first and second */
            else if (arr[itr] > secondMaxSum) {
                thirdMaxSum = secondMaxSum;
                secondMaxSum = arr[itr];
            } /* If arr[i] is in between second and third */
            else if (arr[itr] > thirdMaxSum) {
                thirdMaxSum = arr[itr];
            }
        }
    }
}
