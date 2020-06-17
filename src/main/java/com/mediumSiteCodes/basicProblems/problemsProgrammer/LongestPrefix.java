package com.mediumSiteCodes.basicProblems.problemsProgrammer;

import java.util.ArrayList;
import java.util.List;

public class LongestPrefix {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ape");
        list.add("april");

        longestPrefix(list);
    }

    public static void longestPrefix(List<String> stringList) {
        String prefix = "";
        int characterPtr = 0;
        boolean conditionToBreak = false;

        while (true) {
            for (int i = 0; i < stringList.size(); i++) {
                String str = stringList.get(i);
                char[] charArray = str.toCharArray();
                if (prefix.equals("")) {
                    prefix += charArray[characterPtr];
                } else if (!prefix.equals("")) {
                    if (prefix.equals(String.valueOf(charArray[characterPtr]))) {
                        continue;
                    } else {
                        conditionToBreak = true;
                        break;
                    }
                }
            }

            if (conditionToBreak)
                break;

            characterPtr += 1;
            System.out.print(prefix);
            prefix = "";
        }
    }


    public static boolean isValid(String str, int characterPtr) {
        if (characterPtr < str.length())
            return true;
        return false;
    }
}
