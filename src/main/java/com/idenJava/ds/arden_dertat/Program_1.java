package com.idenJava.ds.arden_dertat;


public class Program_1 {

    static void pairSum(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if((arr[i]+arr[j]) == sum){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }


    static void pairSum1(int[]arr, int sum){
        int left = 0;
        int right = arr.length-1;

        /** Algorithm:
         1: Put left ptr at 0 and right ptr at array length.
         2: Check for left == right if yes print and increment the left ptr.
         3: Check left + right < sum if yes increment the left ptr.
         4: Check left + right > sum if yes increment the right ptr.

         NOTE: Below code is much optimised, if the given input array is sorted.
         */


        while (left < right){
            if((arr[left] + arr[right]) == sum){
                System.out.println(arr[left]+" "+arr[right]);
                left =left+1;
            }else if ( (arr[left] + arr[right]) < sum){
                left = left+1;
            } else {
                right = right-1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        pairSum1(arr,5);
    }
}

// 1(l) 2 3(m) 4 5(r)