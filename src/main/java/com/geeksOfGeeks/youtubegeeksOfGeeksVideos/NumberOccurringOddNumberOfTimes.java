package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumberOccurringOddNumberOfTimes {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 7, 2, 2, 7};
        int num1 = numberOccurringOddNumberOfTimesN2(arr);
        output(num1);
        int num2 = numberOccurringOddNumberOfTimesNM(arr);
        output(num2);
        int num3 = numberOccurringOddNumberOfTimesN(arr);
        output(num3);
    }

    private static void output(int num) {
        if (num == -1)
            System.out.println("No such element");
        else
            System.out.println("Element which occurred odd num times is: " + num);
    }

    // Time Complexity - O(n2)
    private static int numberOccurringOddNumberOfTimesN2(int[] arr) {
        int totalCount = 0;
        int element = 0;
        for (int itr = 0; itr < arr.length; itr++) {
            int currentCount = 1;
            for (int itr1 = itr + 1; itr1 < arr.length; itr1++) {
                if (arr[itr] == arr[itr1])
                    currentCount += 1;
            }
            if (!(currentCount < totalCount)) {
                totalCount = currentCount;
                element = arr[itr];
            }
        }
        return element;
    }

    // Time Complexity: O(N+M)
    private static int numberOccurringOddNumberOfTimesNM(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int itr = 0; itr < arr.length; itr++) {
            if (hm.containsKey(arr[itr])) {
                int value = hm.get((int) arr[itr]);
                hm.put(arr[itr], value + 1);
            } else
                hm.put(arr[itr], 1);
        }

        Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> set = itr.next();
            int value = set.getValue();
            int key = set.getKey();
            if (value % 2 != 0)
                return key;
        }
        return -1;
    }

    private static int numberOccurringOddNumberOfTimesN(int[] arr) {
        int ar_size = arr.length;
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}

