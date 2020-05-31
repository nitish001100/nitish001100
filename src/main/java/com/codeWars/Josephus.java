package com.codeWars;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static List<Integer> josephusPermutation(final List<Integer> items, final int k) {
        ArrayList<Integer> al = new ArrayList<>();

        int counter = 1;
        int ptr = 0;
        while (items.size() > 0) {
            if (counter == k) {
                al.add(items.get(ptr));
                int i = items.remove(ptr);
                counter = 1;
            } else {
                if (((ptr + 1) == items.size())) {
                    ptr = 0;
                } else {
                    ptr += 1;
                }
                counter += 1;
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> al = new ArrayList<>();

        for (int itr = 0; itr < arr.length; itr++)
            al.add(arr[itr]);

        List<Integer> al0 = josephusPermutation(al, 3);

        for (int i = 0; i < al0.size(); i++) {
            System.out.print(al0.get(i)+" ");
        }
    }

}