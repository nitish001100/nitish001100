package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.HashSet;

public class DuplicatesInArray {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 1, 3, 6, 6};
        int arr[] = {1, 6, 3, 1, 3, 6, 6};
        duplicatesInArrayN2(arr);
        duplicatesInArrayInNPlusM(arr);
    }

    // Tc : O(N2) + N
    private static void duplicatesInArrayN2(int[] arr) {

        boolean[] flag = new boolean[arr.length];
        for (int i = 0; i < flag.length; i++)
            flag[i] = false;

        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                if (arr[itr1] == arr[itr2] && flag[itr1] == false && flag[itr2] == false) {
                    System.out.print(arr[itr1] + " ");
                    flag[itr1] = flag[itr2] = true;
                }
            }
        }
    }

    // Tc : O(N+M)
    private static void duplicatesInArrayInNPlusM(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int itr = 0; itr < arr.length; itr++) {
            if (hs.contains((int) arr[itr]))
                System.out.print(arr[itr] + " ");
            else
                hs.add(arr[itr]);
        }
    }
}
