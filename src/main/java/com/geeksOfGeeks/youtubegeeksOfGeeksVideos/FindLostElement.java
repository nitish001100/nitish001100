package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class FindLostElement {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 5, 7, 9};
        int arr2[] = {4, 5, 7, 9};

        System.out.println(findLostElement(arr1, arr2));
    }

    //Tc - O(N + M)
    private static int findLostElement(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;

        for (int itr = 0; itr < arr1.length; itr++)
            sumArr1 = sumArr1 + arr1[itr];

        for (int itr = 0; itr < arr2.length; itr++) {
            sumArr2 = sumArr2 + arr2[itr];
        }

        return sumArr1 - sumArr2;
    }
}
