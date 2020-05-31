package com.algorithms.backtrackingAlgoPractice;

class CreateLongestPalindrome {
    static String findLongestPalindrome(String str) {
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        String beg = "", mid = "z", end = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (count[ch] % 2 == 1) {
                if (Character.getNumericValue(ch) < Character.getNumericValue(mid.toCharArray()[0])) {
                    mid = String.valueOf(ch);
                }
                count[ch--]--;
            } else {
                for (int i = 0; i < count[ch] / 2; i++) {
                    beg += ch;
                }
            }
        }
        end = beg;
        end = reverse(end);
        return beg + mid + end;
    }

    static String reverse(String str) {
        String ans = "";
        char[] try1 = str.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) {
            ans += try1[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "adskassda";
        System.out.println(System.currentTimeMillis());
        System.out.println(findLongestPalindrome(str));
        System.out.println(System.currentTimeMillis());
    }
}
