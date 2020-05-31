package com.idenJava.ds.DataStructures;

public class RemoveDuplicate {

    int[] removeDuplicate(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    for (int k = j; k < (arr.length-j)+1; k++) {
                        arr[k] = arr[k+1];
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 5, 10, -10, -10, 11};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] result = removeDuplicate.removeDuplicate(arr);

        for (int i = 0; i < result.length-1; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
