package com.idenJava.ds.DataStructures;


public class LargestAndSmallestElement {

    /**
     Below code is on assumption, that first index is smaller or larger,
     on behalf of that I will find the replace of smallestNo. and greatest Nos.
     */

    private int findSmallest(int[] arr) {
        int smallestNo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(smallestNo>arr[i])
                smallestNo = arr[i];
        }
        return smallestNo;
    }

    private int findLargest(int[] arr) {
        int greatestNos = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(greatestNos<arr[i])
                greatestNos = arr[i];
        }
        return greatestNos;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 12, 14, 10};
        LargestAndSmallestElement lse = new LargestAndSmallestElement();
        System.out.println(lse.findSmallest(arr));
        System.out.println(lse.findLargest(arr));
    }
}
