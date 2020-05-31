package com.geeksOfGeeks.amazon;

public class SumOfNumbersInAString {
    public static void main(String[] args) {
        String str = "1abc23";
        char[] arr = str.toCharArray();

        int sum = 0;

        int[] outputArr = new int[100];

        for (int itr = 0; itr < arr.length; itr++) {
            if (Character.getNumericValue(arr[itr]) > 0 && (Character.getNumericValue(arr[itr]) < 9)) {
                while (Character.getNumericValue(arr[itr+1]) > 0 && (Character.getNumericValue(arr[itr+1]) < 9))
                outputArr[itr] = arr[itr];
            }

        }
        System.out.println(sum);
    }
}
