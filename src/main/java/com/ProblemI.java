package com;

import java.util.Arrays;


//
public class ProblemI {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};
        sol(arr);
    }

    public static boolean sol(int[] arr) {

        if (checkArrayIsSortedOrNot(arr) == true)
            return false;
        else {

            int[] buffer = new int[arr.length];

            Arrays.fill(buffer, 0);

            int ptr = 0;

            while (ptr < buffer.length) {
                if (buffer[ptr] < arr[ptr]) {
                    int temp = 0;
                    temp = arr[ptr];
                    arr[ptr] = buffer[ptr];
                    buffer[ptr] = temp;
                }
                ptr += 1;
            }

            for (int itr = 0; itr < buffer.length; itr++)
                System.out.print(buffer[itr]+" ");

            return true;
        }
    }

    private static boolean checkArrayIsSortedOrNot(int[] arr) {
        int x = arr[0];
        boolean flag = false;

        for (int itr = 1; itr < arr.length; itr++) {
            if (x < arr[itr])
                flag = true;
            else
                flag = false;
        }
        return flag;
    }
}
