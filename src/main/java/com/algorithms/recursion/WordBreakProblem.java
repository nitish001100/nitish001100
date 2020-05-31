package com.algorithms.recursion;

import java.util.HashSet;
import java.util.Set;

// https://www.geeksforgeeks.org/word-break-problem-dp-32/

public class WordBreakProblem {

    private static Set<String> dictionary = new HashSet<>();

    public static void main(String[] args) {
        String temp_dictionary[] = {"mobile", "samsung", "sam", "sung",
                "man", "mango", "icecream", "and",
                "go", "i", "like", "ice", "cream"};
        for (String temp : temp_dictionary)
            dictionary.add(temp);

        System.out.println(wordBreak("ilikesamsung"));
    }



    public static boolean wordBreak(String str) {
        int size = str.length();
        if (size == 0) {
            return true;
        } else {
            for (int i = 1; i <= str.length(); i++) {
                String prefix = str.substring(0, i);
                String suffix = str.substring(i, size);

                if(dictionary.contains(prefix) && wordBreak(suffix) == true)
                    return true;
            }
        }
        return false;
    }

}