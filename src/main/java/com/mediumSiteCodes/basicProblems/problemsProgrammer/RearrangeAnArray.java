package com.mediumSiteCodes.basicProblems.problemsProgrammer;

import java.util.HashSet;

public class RearrangeAnArray {
    public static void main(String[] args) {
        int[] arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        rearrangeArray(arr);


    }

    public static void rearrangeArray(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++)
            hs.add(arr[i]);

        for (int i = 0; i < arr.length; i++) {
            if(hs.contains((int)i)){
                System.out.print(i+" ");
            }else {
                System.out.print(-1+" ");
            }
        }
    }
}
