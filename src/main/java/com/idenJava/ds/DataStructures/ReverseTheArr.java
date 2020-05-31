package com.idenJava.ds.DataStructures;


class ReverseTheArrLogic {
    int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int bucketVariable;
            bucketVariable = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = bucketVariable;
        }
        return arr;
    }
}

public class ReverseTheArr {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 13, 5, 10, 11, 100};
        System.out.println("Original array " );
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        ReverseTheArrLogic reverseTheArrLogic = new ReverseTheArrLogic();
        System.out.println();
        System.out.println("After Reverse array ");
        for (int i : reverseTheArrLogic.reverse(arr)) {
            System.out.print(i+" ");
        }

    }
}
