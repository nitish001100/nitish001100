package com.mediumSiteCodes.basicProblems;

public class PrintSortedOrderFromBothArrays {
    public static void main(String[] args) {
        int x[] = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int y[] = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        printSortedArray(x, y);
    }

    public static void printSortedArray(int[] arr1, int[] arr2) {
        
        int ptr1 = 0, ptr2 = 0, n = arr1.length, m = arr2.length;

        while (ptr1 < n && ptr2 < m) {
            if (arr1[ptr1] < arr2[ptr2]) {
                System.out.print(arr1[ptr1] + " ");
                ptr1+=1;
            } else if (arr2[ptr2] < arr1[ptr1]) {
                System.out.print(arr2[ptr2] + " ");
                ptr2+=1;
            } else {
                System.out.print(arr1[ptr1] + " ");
                ptr1+=1;
                ptr2+=1;
            }
        }


        while (ptr1 < n){
            System.out.print(arr1[ptr1]+" ");
            ptr1+=1;
        }

        while (ptr2 < m){
            System.out.print(arr2[ptr2]+" ");
            ptr2+=1;
        }
    }
}
