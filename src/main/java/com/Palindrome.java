package com;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str = "adskassda";
        int maxLen = Integer.MIN_VALUE;

        int var0 = 0;
        int var1 = 0;
        for (int itr1 = 0; itr1 < str.length(); itr1++) {
            for (int itr2 = str.length() - 1; itr2 > 0; itr2--) {
                if (checkPalaindrome(str, itr1, itr2)) {
                    if ((itr2 - itr1) > maxLen) {
                        maxLen = (itr2 - itr1);
                        var0 = itr1;
                        var1 = itr2;
                    }
                }
            }
        }
        System.out.println(str.substring(var0, var1 + 1));
    }

    private static boolean checkPalaindrome(String str, int itr1, int itr2) {
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
