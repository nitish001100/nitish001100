package com.geeksOfGeeks.amazon;

public class Count2 {
    public static void main(String[] args) {
        int[] arr = new int[101];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i;


        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] / 10 == 2)
                count = count + 1;

            if (arr[i] % 10 == 2)
                count = count + 1;

        }


        System.out.println(count);
    }
}
