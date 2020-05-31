package com.codeForces;

import java.util.HashSet;
import java.util.Iterator;

public class Problem4 {

    static int result(int[] arr1, int[] arr2, int sum){

        HashSet<Integer> hashSet = new HashSet<>();

        // worst TC - n
        for (int i = 0; i < arr2.length; i++)
            hashSet.add(arr2[i]);

        // worst TC - m
        for (int i = 0; i < arr1.length; i++) {
            int req = sum - arr1[i];
            if(hashSet.contains((int)req)){
                Iterator<Integer> itr = hashSet.iterator();
                while (itr.hasNext()){
                    int currentInt = itr.next();
                    if(req == currentInt)
                        return currentInt;
                }
            }
        }
        return 0;

        // Total TC - n+m;
        // Brut force TC - n*m;
    }
    public static void main(String[] args) {
        int[]arr1 = {1,1,3,6};
        int[]arr2 = {2,5,9,9};
        int sum = 10;
        System.out.println(result(arr1, arr2, sum));
    }
}
