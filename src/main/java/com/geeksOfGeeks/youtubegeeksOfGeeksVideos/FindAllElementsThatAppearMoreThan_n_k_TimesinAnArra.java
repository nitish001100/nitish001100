package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.HashMap;

public class FindAllElementsThatAppearMoreThan_n_k_TimesinAnArra {
    public static void main(String[] args) {
        // FindAllElementsThatAppearMoreThan_n/k_TimesinAnArray
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        int checkFor = arr.length / k;
        findAllElementsThatAppearMoreThan_n_k_TimesinAnArrayInNPlusM(arr, checkFor);
    }

    //1         // O(n+n)
    private static void findAllElementsThatAppearMoreThan_n_k_TimesinAnArrayInNPlusM(int[] arr, int checkFor) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int itr = 0; itr < arr.length; itr++) {
            if (hm.containsKey((int) arr[itr])) {
                int value = hm.get((int) arr[itr]);
                hm.put(arr[itr], value + 1);
            } else {
                hm.put(arr[itr], 1);
            }
        }

        hm.entrySet().forEach(keyValue -> {
            if (keyValue.getValue() > checkFor)
                System.out.print(keyValue.getKey()+" ");
        });

    }

    //2         // Using sorting technique O(nlogn)+O(n)


}
