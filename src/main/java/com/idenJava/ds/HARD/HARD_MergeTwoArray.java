package com.idenJava.ds.HARD;

public class HARD_MergeTwoArray {

    public static void sortedMerge(int a[], int b[], int res[], int n, int m)
    {
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i += 1;
            } else {
                res[k] = b[j];
                j += 1;
            }
            k += 1;
        }

        while (i < n) {
            res[k] = a[i];
            i += 1;
            k += 1;
        }
        while (j < m) {
            res[k] = b[j];
            j += 1;
            k += 1;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,5};
        int[] b = new int[]{2,4,6,7};
        int[] c = new int[a.length+b.length];

        sortedMerge(a,b,c, a.length, b.length);
    }
}
