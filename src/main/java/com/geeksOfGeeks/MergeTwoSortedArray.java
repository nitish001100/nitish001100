package com.geeksOfGeeks;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 10, 11};
        int[] arr2 = {0, 2, 6, 8};
        int[] arr3 = new int[arr1.length + arr2.length];

        int firstPtr = 0, secondPtr = 0, thirdPtr = 0;

        while (firstPtr < arr1.length && secondPtr < arr2.length) {
            if (arr1[firstPtr] < arr2[secondPtr]) {
                arr3[thirdPtr] = arr1[firstPtr];
                firstPtr = firstPtr + 1;
            } else {
                arr3[thirdPtr] = arr2[secondPtr];
                secondPtr = secondPtr + 1;
            }
            thirdPtr = thirdPtr + 1;
        }

        while (firstPtr < arr1.length)
            arr3[thirdPtr++] = arr1[firstPtr++];

        while (secondPtr < arr2.length)
            arr3[thirdPtr++] = arr2[secondPtr++];


        for (int outputPtr = 0; outputPtr < arr3.length; outputPtr++)
            System.out.print(arr3[outputPtr] + " ");
    }

}
