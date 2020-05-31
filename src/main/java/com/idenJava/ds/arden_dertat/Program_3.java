package com.idenJava.ds.arden_dertat;

//Largest Continuous Sum

public class Program_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int k = 1; k < arr.length; k++) {
                int bufferMax = arr[i] + arr[k];
                if (arr[i] != arr[k]) {
                    if (!(maxSum > bufferMax)) {
                        maxSum = bufferMax;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
