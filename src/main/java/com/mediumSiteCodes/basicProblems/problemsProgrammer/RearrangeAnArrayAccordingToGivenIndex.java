package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class RearrangeAnArrayAccordingToGivenIndex {
    public static void main(String[] args) {
        int arr[] = {50, 40, 70, 60, 90};
        int index[] = {3, 0, 4, 1, 2};
        rearrangeAnArrayAccordingToGivenIndex(arr, index);
        print(arr);
        print(index);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void rearrangeAnArrayAccordingToGivenIndex(int[] arr, int[] index) {
        for (int i = 0; i < index.length; i++) {
            int bufferValue = arr[i];
            int in = index[i];
            arr[i] = arr[in];
            arr[in] = bufferValue;

            int bufferIndex = index[index[i]];
            index[index[i]] = index[i];
            index[i] = bufferIndex;

        }
    }
}
