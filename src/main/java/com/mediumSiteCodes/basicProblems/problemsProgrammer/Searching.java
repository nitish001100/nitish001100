package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99};
        int toSearch = 67;
        linearSearching(arr, toSearch);
        binarySearching(arr, toSearch);
        findPattern("ASAAABAAAAABAAAAAGAHUHDJKDDKSHAAJF", "AAABAAA");
    }

    public static void findPattern(String string, String pattern) {
        char[] chArrayString = string.toCharArray();
        char[] chArrayPattern = pattern.toCharArray();

        int ptrPatten = 0;

        for (int i = 0; i < chArrayString.length; i++) {
            if (chArrayString[i] == chArrayPattern[ptrPatten]) {
                ptrPatten += 1;
            } else if (chArrayString[i] != chArrayPattern[ptrPatten]) {
                ptrPatten = 0;
            }

            if (ptrPatten == chArrayPattern.length) {
                System.out.println("Found pattern.");
                break;
            }
        }
    }

    public static void linearSearching(int[] arr, int toSearch) {
        System.out.println("Linear Searching = ");
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toSearch)
                index = i;
        }

        if (index == -1)
            System.out.println("No such element found in provided array.");
        else
            System.out.println("Search element present at " + index + " index.");
    }

    public static void binarySearching(int[] arr, int toSearch) {

        Sorting.bubbleSorting(arr);

        int mid = 0, left = 0, right = arr.length - 1;

        while (left <= right) {

            mid = (left + right) / 2;

            if (arr[mid] == toSearch) {
                System.out.println("\nFound element at index = " + mid);
                break;
            } else if (arr[mid] < toSearch) {
                left = mid + 1;
            } else if (arr[mid] > toSearch) {
                right = mid - 1;
            }
        }
    }
}
