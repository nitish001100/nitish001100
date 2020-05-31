package com.geeksOfGeeks.amazon;

public class important_maxProductOfIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 0};
        System.out.println(findProduct(arr));
    }

    public static int findProduct(int[] arr) {

        int first = 0, second = 0;

        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] > first) {
                second = first;
                first = arr[itr];
            } else {
                if (arr[itr] > second && arr[itr] != first)
                    second = arr[itr];
            }
        }

        return first * second;
    }
}
