package com.idenJava.ds.DataStructures;

public class PairNos {
    void pairNo(int[]arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if((arr[i]+arr[j])==sum){
                    System.out.print("Sum = "+sum+ " pair use -" + arr[i] +","+arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[]arr = new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        PairNos pairNos = new PairNos();
        pairNos.pairNo(arr,6);

    }
}
