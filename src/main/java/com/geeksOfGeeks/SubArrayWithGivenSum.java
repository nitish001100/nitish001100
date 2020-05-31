package com.geeksOfGeeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Sub Array with given sum.
 */

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int sum = 9;
        int count;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                count = count + arr[j];
                if (count == sum) {
                    map.put(String.valueOf(i) + "-" + String.valueOf(j), ((j - i) + 1));
                }
            }
        }
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        }
        System.out.println(maxEntry.getKey() + " " + maxEntry.getValue());
    }
}