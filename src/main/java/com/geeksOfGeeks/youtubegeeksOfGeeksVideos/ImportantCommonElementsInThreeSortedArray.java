package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class ImportantCommonElementsInThreeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        commonElements(arr1, arr2, arr3);

    }

    private static void commonElements(int[] ar1, int[] ar2, int[] ar3) {
        /**
         If x, y and z are same, we can simply print any of them as common element and move ahead in all three arrays.
         Else If x < y, we can move ahead in ar1[] as x cannot be a common element.
         Else If x > z and y > z), we can simply move ahead in ar3[] as z cannot be a common element.
         */

        int i = 0, j = 0, k = 0;

        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
            {   System.out.print(ar1[i]+" ");   i++; j++; k++; }
            //x < y
            else if (ar1[i] < ar2[j])
                i++;
                // y < z
            else if (ar2[j] < ar3[k])
                j++;
                // We reach here when x > y and z < y, i.e., z is smallest
            else
                k++;
        }
    }
}
