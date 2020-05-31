package com.mediumSiteCodes.basicProblems;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class PlayWithArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4};
        howManySubSetPossible(arr);

        int sum = 10;
        findSum(arr, sum);
    }

    public static void findSum(int[] arr, int findSum) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum < findSum)
                    continue;
                else if (sum == findSum) {
                    System.out.println(i + "," + j + " = " + sum);
                    break;
                } else if (sum > findSum)
                    break;
            }
            sum = 0;
        }
    }

    public static void howManySubSetPossible(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else if (hm.containsKey(arr[i])) {
                Integer value = hm.get(arr[i]);
                value = value + 1;
                hm.remove(arr[i]);
                hm.put(arr[i], value);
            }
        }

        AtomicInteger minCount = new AtomicInteger();
        minCount.set(Integer.MAX_VALUE);

        hm.entrySet().stream().forEach(keyValue -> {
            if (keyValue.getValue() < minCount.get()) {
                minCount.set(keyValue.getValue());
            }
        });

        System.out.println("Min possible subsets are: " + minCount.get());
    }
}
