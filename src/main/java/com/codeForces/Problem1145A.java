package com.codeForces;

public class Problem1145A {
    public static void main(String[] args) {
        // Thanos Sort

        int[] arr = {7, 6, 5, 4};

        int snap = 0;
        for (int i = 0; i < arr.length; i++) {
                for (int i1 = 0; i1 < arr.length%2 -1; i1++) {
                    if(arr[i1]>arr[(arr.length-1)-i1]){
                        int temp = 0;
                        temp = arr[i1];
                        arr[i1] = arr[(arr.length-1)-i1];
                        arr[(arr.length-1)-i1] = temp;
                        snap = snap+1;
                    }
                }
        }
        System.out.println(arr[1]);
    }
}
