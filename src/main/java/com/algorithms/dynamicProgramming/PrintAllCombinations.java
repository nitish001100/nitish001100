package com.algorithms.dynamicProgramming;

public class PrintAllCombinations {
    public static void main(String[] args) {

        String str = "abb";

        allCombinations(str, "");
    }

    private static void allCombinations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            allCombinations(ros, ans + ch);
        }

    }
}
