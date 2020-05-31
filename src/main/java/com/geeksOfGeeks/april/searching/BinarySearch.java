package com.geeksOfGeeks.april.searching;

public class BinarySearch {

    static int arr[] = {1, 3, 4, 10, 40, 79};

    public static void main(String[] args) {
        int x = 10;
        int index = binarySearch(arr, x);
        if(index == -1)
            System.out.println("");
        else
            System.out.println(index);
    }

    static int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    /** Time complexity = logn = Let's say n=4, so logn = 0.602 **/
}
