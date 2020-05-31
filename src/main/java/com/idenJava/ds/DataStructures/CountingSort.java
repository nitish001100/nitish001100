package com.idenJava.ds.DataStructures;

//https://www.youtube.com/watch?v=bbUqXF5pSD0&list=PLsFNQxKNzefK_DAUwnQwBizOmcY7aDLoY&index=9

public class CountingSort {

    void countingSort(int[]arr0, int[]arr1, int N, int K){

        int[] arr2 = new int[K];

        //3
        for (int i = 0; i < K; i++)
            arr2[i] = 0;

        for (int j = 0; j < N ; j++)
            arr2[arr0[j]] = arr2[arr0[j]]+1;

        for (int i = 1; i < K; i++)
            arr2[i] = arr2[i]+arr2[i-1];

        for (int j = N-1; j >=0 ; j--) {
            arr1[arr2[arr0[j]]-1] = arr0[j];
            arr2[arr0[j]] = arr2[arr0[j]] - 1;
        }

    }

    public static void main(String[] args) {
        int[]arr0 = new int[]{ 2, 1, 3, 5, 6 ,8, 9, 7};
        //1
        int[]arr1 = new int[arr0.length];
        //2
        int[]arr2 = new int[9];

        CountingSort countingSort = new CountingSort();
        countingSort.countingSort(arr0,arr1, arr0.length, 9);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
