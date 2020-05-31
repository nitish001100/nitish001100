package com.mediumSiteCodes.basicProblems;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        majorityElementInAnArrayInN2(arr);
        majorityElementInAnArrayInNM(arr);

    }

    private static void majorityElementInAnArrayInNM(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // N Tc
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int value = hm.get(arr[i]);
                hm.put(arr[i], value + 1);
            } else
                hm.put(arr[i], 1);
        }

        AtomicInteger maxValue = new AtomicInteger();
        maxValue.set(Integer.MIN_VALUE);

        AtomicInteger value1 = new AtomicInteger();


        // M unique elements.
        hm.entrySet().stream().forEach(value -> {
            if (maxValue.get() < value.getValue()) {
                maxValue.set(value.getValue());
                value1.set(value.getKey());
            }
        });


        // Total: O(N) + O(M)
        System.out.println(maxValue.get() + " -- " + value1.get());
    }

    public static void majorityElementInAnArrayInN2(int[] arr) {
        int count = 0, maxCount = Integer.MIN_VALUE, value = 0;
        for (int i = 0; i < arr.length; i++) {
            count += 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count += 1;
            }
            if (count > maxCount) {
                maxCount = count;
                value = arr[i];
            }
            count = 0;
        }

        System.out.println("Maximum occurences of " + value + " is " + count);
    }
}
