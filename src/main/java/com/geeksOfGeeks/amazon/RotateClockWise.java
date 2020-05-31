package com.geeksOfGeeks.amazon;

public class RotateClockWise {
    public static void main(String[] args) {
        int fromWhereRotate = 3;
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int[] outputArr = new int[arr.length];


        int outPtr = (arr.length)-fromWhereRotate;

        for (int itr = 0; itr < arr.length; itr++) {
             outputArr[outPtr++] = arr[itr];
             if(outPtr == outputArr.length)
                 outPtr = 0;
        }
        System.out.println(outputArr);
    }
}
