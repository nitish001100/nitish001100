package com.geeksOfGeeks;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] outputArr = new int[arr.length];

        int arrLen = arr.length - 1;
        int outputPtr = 0;
        int leftPtr = 0;
        int rightPtr = arrLen;


        if (arr.length % 2 == 0) {
            while (leftPtr < rightPtr) {
                outputArr[outputPtr] = arr[rightPtr--];
                outputArr[outputPtr + 1] = arr[leftPtr++];
                outputPtr = outputPtr + 2;
            }
        } else {
            while (leftPtr < rightPtr) {
                outputArr[outputPtr] = arr[rightPtr--];
                outputArr[outputPtr + 1] = arr[leftPtr++];
                outputPtr = outputPtr + 2;
            }

            outputArr[outputArr.length - 1] = arr[leftPtr];
        }


        for (int i = 0; i < outputArr.length; i++) {
            System.out.print(outputArr[i] + " ");
        }
    }
}
