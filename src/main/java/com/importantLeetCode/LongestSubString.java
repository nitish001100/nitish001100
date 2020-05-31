package com.importantLeetCode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        findLongestSubString(str);
        findLongestSubStringInLinearTime(str);
    }

    // Linear Time O(N)
    private static void findLongestSubStringInLinearTime(String str) {

        int left = 0;
        char[] charArray = str.toCharArray();

        HashSet<Character> hs = new HashSet<>();
        int len = 0;
        int finalLen = Integer.MIN_VALUE;

        while (left < charArray.length) {
            if (!hs.contains(charArray[left])) {
                hs.add(charArray[left]);
                len += 1;
                left += 1;
            } else {
                if (finalLen < len) {
                    finalLen = len;
                    len = 0;
                }
                hs.clear();
            }
        }
        System.out.println(finalLen);
    }

    // O(N2) - Check for all substring having non repetitive characters and also store the len and every time compare the len.

    private static void findLongestSubString(String str) {
        HashSet<Character> hs = new HashSet<>();

        char[] chArray = str.toCharArray();
        int maxCount = Integer.MIN_VALUE;
        int startingIndex = 0;
        int endIndex = 0;


        for (int itr1 = 0; itr1 < chArray.length; itr1++) {
            int count = 0;
            int endValue = 0;
            hs.add(chArray[itr1]);
            count += 1;
            for (int itr2 = itr1 + 1; itr2 < chArray.length; itr2++) {
                if (!hs.contains((char) chArray[itr2])) {
                    hs.add(chArray[itr2]);
                    count += 1;
                } else {
                    endValue = itr2;
                    break;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                startingIndex = itr1;
                endIndex = endValue - 1;
            }
            count = 0;
            hs.clear();
        }

        System.out.println(maxCount);
    }
}
