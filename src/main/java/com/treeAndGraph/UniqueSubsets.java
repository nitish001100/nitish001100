package com.treeAndGraph;

import java.util.HashSet;

public class UniqueSubsets {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3};
        int sum = 6;
        uniqueSubsets(arr, sum);
    }

    private static void uniqueSubsets(int[] arr, int sum) {

        HashSet<Integer> hs = new HashSet<>();

        for (int itr = 0; itr < arr.length; itr++)
            hs.add(arr[itr]);

        for (int itr = 0; itr < arr.length; itr++) {

            if (sum % 2 == 0) {
                int toFind = sum / arr[itr];
                if (hs.contains((int) toFind)) {
                    for (int i = 0; i < toFind; i++) {
                        System.out.print(arr[itr]+" "+"\n");
                    }
                }
            }

            if(hs.contains((int)(sum-arr[itr])))
                System.out.print(arr[itr]+" "+(sum-arr[itr])+"\n");

        }
    }
}