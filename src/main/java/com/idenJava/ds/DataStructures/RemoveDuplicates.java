package com.idenJava.ds.DataStructures;

public class RemoveDuplicates {

    static int[] arr;

    static int[] removeDuplicates(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    arr = removeValue(arr, j);
            }
        }
        return arr;
    }

    static int[] removeValue(int[] arr, int index) {
        int[] bufferArr = new int[arr.length - 1];
        for (int i = 0; i < bufferArr.length; i++) {
            if (i != index) {
                bufferArr[i] = arr[i];
            }else {
                bufferArr[i] = arr[i+1];
            }
        }
        return bufferArr;
    }


    public static void main(String[] args) {
        arr = new int[]{3, 3, 5};
        int[] result = removeDuplicates();

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

    }
}
