package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.Hashtable;

public class OddNumOfTimes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 1, 1, 2, 2, 13, 1, 1, 40, 40, 13, 13};
        oddNoOfTimes(arr);
    }

    private static void oddNoOfTimes(int[] arr) {

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int itr = 0; itr < arr.length; itr++) {
            if (ht.containsKey((int) arr[itr])) {
                int value = ht.get((int) arr[itr]);
                ht.put(arr[itr], value + 1);
            } else {
                ht.put(arr[itr], 1);
            }
        }

        ht.entrySet().stream().forEach(keyValue -> {
            if (!(keyValue.getValue() % 2 == 0))
                System.out.println("Number which occurred odd number of times is :" + keyValue.getKey());
        });
    }
}
