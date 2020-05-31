package com.importantLeetCode;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String str = "a";
        longestPalindromicSubString(str);
    }

    private static void longestPalindromicSubString(String str) {
        char[] charArray = str.toCharArray();
        int max = Integer.MIN_VALUE;
        int startingIndex = 0;
        int endIndex = 0;

        for (int itr1 = 0; itr1 < charArray.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < charArray.length; itr2++) {
                if (palindromicFunction(str, itr1, itr2)) {
                    if (max < ((itr2 - itr1) + 1)) {
                        max = (itr2 - itr1) + 1;
                        startingIndex = itr1;
                        endIndex = itr2+1;
                    }
                }
            }
        }
        System.out.println(str.substring(startingIndex, endIndex));
    }

    private static boolean palindromicFunction(String str, int itr1, int itr2) {
        int left = itr1;
        int right = itr2;
        boolean flag = false;

        while (left < right) {

            if (str.charAt(left) == ' ')
                left += 1;

            if (str.charAt(right) == ' ')
                right -= 1;

            if (str.charAt(left) == str.charAt(right)) {
                left += 1;
                right -= 1;
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        if (flag)
            return true;
        else
            return false;
    }
}
