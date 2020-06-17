package com.byteByByte;

public class MedianArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        median(arr1, arr2);
    }

    public static void median(int[] arr1, int[] arr2) {
        int mid1 = arr1.length / 2, mid2 = arr2.length / 2, median = 0;

        if (arr1.length % 2 == 0) {
            median += (arr1[mid1 - 1] + arr1[mid1]) / 2;
        } else if (arr1.length % 2 != 0) {
            median += arr1[mid1] / 2;
        }


        if (arr2.length % 2 == 0) {
            median += (arr2[mid2 - 1] + arr2[mid2]) / 2;
        } else if (arr2.length % 2 != 0) {
            median += arr2[mid2] / 2;
        }

        System.out.println(median);
    }

    public static void precisionCompute(int x, int y, int n) {
        if (y == 0) {
            System.out.print("Infinite");
            return;
        }
        if (x == 0) {
            System.out.print("0");
            return;
        }
        if (n <= 0) {
            System.out.print(x / y);
            return;
        }

        if (((x > 0) && (y < 0)) || ((x < 0) && (y > 0))) {
            System.out.print("-");
            x = x > 0 ? x : -x;
            y = y > 0 ? y : -y;
        }
        int d = x / y;
        for (int i = 0; i <= n; i++) {
            System.out.print(d);
            x = x - (y * d);
            if (x == 0)
                break;
            x = x * 10;
            d = x / y;
            if (i == 0)
                System.out.print(".");
        }
    }

}
