package com.geeksOfGeeks;

public class SortedArraySquare {
    public static void main(String[] args) {

        int[] arr = new int[]{-10, -7, -3, 1, 4, 5};

        System.out.println("Input Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        double[] output = new double[arr.length];

        int lastPtr = arr.length - 1;

        int index = arr.length - 1;
        for (int ptr = 0; ptr < arr.length; ) {
            if (ptr <= lastPtr) {
                if (Math.pow(arr[ptr], 2) > Math.pow(arr[lastPtr], 2)) {
                    output[index] = Math.pow(arr[ptr], 2);
                    ptr = ptr + 1;
                } else {

                    output[index] = Math.pow(arr[lastPtr], 2);
                    lastPtr = lastPtr - 1;
                }
                index = index - 1;
            }else {
                break;
            }
        }

        System.out.println("\nSorted Array : ");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }
    }
}
