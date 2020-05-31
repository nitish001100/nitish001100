package com.treeAndGraph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumOfOverLappingElement {
    public static void main(String[] args) {
        int[] arr1 = {12, 13, 6, 10};
        int[] arr2 = {13, 10, 16, 15};

        HashSet<Integer> hs = new HashSet<>();
        for (int itr = 0; itr < arr1.length; itr++)
            hs.add(arr1[itr]);

        int sum = 0;
        for (int itr = 0; itr < arr2.length; itr++) {
            if (hs.contains((int) arr2[itr]))
                sum += (2*arr2[itr]);
        }

        System.out.println(sum);
    }
}
