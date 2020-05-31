package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class ReplaceEveryElementWithTheGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        replaceEveryElementWithTheGreatestElementOnRightSideN2(arr, arr.length);
        printArray(arr);
        System.out.println();
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        replaceEveryElementWithTheGreatestElementOnRightSideN(arr1);
    }


    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Time Complexity: N2
    private static void replaceEveryElementWithTheGreatestElementOnRightSideN2(int[] arr, int arrayLen) {
        for (int itr = 0; itr < arrayLen; itr++) {
            int currentMax = 0;
            for (int itr1 = itr + 1; itr1 < arrayLen; itr1++) {
                if (currentMax < arr[itr1]) {
                    currentMax = arr[itr1];
                }
            }
            if (!(itr == arr.length - 1))
                arr[itr] = currentMax;
            else
                arr[itr] = -1;
        }
    }

    //Time Complexity: O(N)
    private static void replaceEveryElementWithTheGreatestElementOnRightSideN(int[] arr) {

        System.out.print(-1 + " ");
        int forNowMax = arr[arr.length - 1];
        System.out.print(forNowMax + " ");
        for (int itr = arr.length - 2; itr > 0; itr--) {
            if (!(arr[itr] < forNowMax))
                forNowMax = arr[itr];
            System.out.print(forNowMax + " ");
        }
    }
}
