package com.idenJava.ds.DataStructures;


public class PrintLargestElement {

    void largestElement(int[]arr){
        int largetElement=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    largetElement = arr[j];
                }
            }
        }
        System.out.println(largetElement);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 5, 10, 11, 100};
        PrintLargestElement printLargestElement = new PrintLargestElement();
        printLargestElement.largestElement(arr);
    }
}
