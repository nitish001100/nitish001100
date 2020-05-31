package com.mediumSiteCodes.basicProblems;

public class PartitionProblem {
    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 2, 2, 1};
        partitionProblem(arr);
        reverseAString("NITISH");
    }

    private static void partitionProblem(int[] arr) {

    }

    private static void reverseAString(String str) {
        char[] chArray = str.toCharArray();

        int left = 0, right = chArray.length - 1;

        while (left <= right) {
            char buffer = ' ';
            buffer = chArray[left];
            chArray[left] = chArray[right];
            chArray[right] = buffer;

            left += 1;
            right -= 1;
        }

        for (int i = 0; i < chArray.length; i++)
            System.out.print(chArray[i]);
    }
}
