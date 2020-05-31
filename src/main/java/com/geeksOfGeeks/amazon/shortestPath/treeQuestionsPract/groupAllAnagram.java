package com.geeksOfGeeks.amazon.shortestPath.treeQuestionsPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAllAnagram {
    public static void main(String[] args) {
        String[] strArr = {"car", "ape", "arc", "meal", "pea", "male", "lame", "dog"};

        boolean[] visitedCheck = new boolean[strArr.length];
        Arrays.fill(visitedCheck, false);

        List<String> list = new ArrayList<>();

        for (int itr1 = 0; itr1 < strArr.length; itr1++) {
            list.add(strArr[itr1]);
            for (int itr2 = itr1 + 1; itr2 < strArr.length; itr2++) {
                if (visitedCheck[itr2] == false && itr1 != itr2 && checkAnagram(strArr[itr1], strArr[itr2])) {
                    list.add(strArr[itr2]);
                    visitedCheck[itr2] = true;
                }
            }

            if (!(list.size() == 1)){
                printList(list);
                System.out.println();
            }

            list.clear();
        }

    }

    static void printList(List<String> list) {
        list.stream().forEach(element -> System.out.print(element + " "));
    }

    public static boolean checkAnagram(String str1, String str2) {
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for (int itr1 = 0; itr1 < chArr1.length; itr1++) {
            if (!hashMap1.containsKey(chArr1[itr1])) {
                hashMap1.put(chArr1[itr1], 1);
            } else {
                int value = (Integer) hashMap1.get(chArr1[itr1]);
                hashMap1.put(chArr1[itr1], value + 1);
            }
        }

        for (int itr2 = 0; itr2 < chArr2.length; itr2++) {
            if (!hashMap2.containsKey(chArr2[itr2])) {
                hashMap2.put(chArr2[itr2], 1);
            } else {
                int value = (Integer) hashMap1.get(chArr2[itr2]);
                hashMap2.put(chArr2[itr2], value + 1);
            }
        }

        if (hashMap1.equals(hashMap2))
            return true;
        else
            return false;
    }
}
