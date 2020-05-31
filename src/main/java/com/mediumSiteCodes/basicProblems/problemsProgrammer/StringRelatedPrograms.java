package com.mediumSiteCodes.basicProblems.problemsProgrammer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class StringRelatedPrograms {
    public static void main(String[] args) {
        System.out.print("Duplicate characters present in String are = ");
        findDuplicatesInAString("abcdefghabcd");
        System.out.print("\nCheck Anagram = ");
        checkAnagram("listen", "silent");
        System.out.print("\nFirst Non Repeated Character from a String = ");
        firstNonRepeatedCharacterFromString("abcdefghabcd");
        System.out.print("\nReverse a String");
        reverseAString("nitish");
        System.out.print("String contains only digits.\n");
        stringContainsOnlyDigits("nitish001100");
        System.out.println("Count a number of vowels and consonants in a given string = ");
        countNumberOfVowelsAndConsonants("abcdefghabcd");
    }

    private static void countNumberOfVowelsAndConsonants(String str) {

        int sum = 0;
        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == 'a'
                    ||
                    chArray[i] == 'e'
                    ||
                    chArray[i] == 'i'
                    ||
                    chArray[i] == 'o'
                    ||
                    chArray[i] == 'u')
                sum += 1;
        }
        System.out.println(sum);
    }

    private static void stringContainsOnlyDigits(String str) {
        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (!((int) chArray[i] >= 0 && (int) chArray[i] <= 9)) {
                System.out.println("Found a character in String.");
                break;
            }
        }
    }

    private static void reverseAString(String s) {
        char[] chArray = s.toCharArray();
        int left = 0, right = chArray.length - 1;
        while (left < right) {
            char ch = ' ';
            ch = chArray[left];
            chArray[left] = chArray[right];
            chArray[right] = ch;
            left += 1;
            right -= 1;
        }

        System.out.println(Arrays.toString(chArray));
    }

    private static void firstNonRepeatedCharacterFromString(String str) {
        HashSet<Character> hs = new HashSet<>();
        char[] chArray = str.toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            if (!hs.contains(chArray[i])) {
                hs.add(chArray[i]);
            } else {
                Iterator<Character> itr = hs.iterator();
                while (itr.hasNext())
                    System.out.print(itr.next().charValue() + " ");
                break;
            }
        }
    }

    private static void checkAnagram(String s1, String s2) {
        char[] chArray1 = s1.toCharArray();
        char[] chArray2 = s2.toCharArray();

        HashMap<Character, Integer> hashMap1 = new HashMap<>();

        for (int i = 0; i < chArray1.length; i++) {
            if (!hashMap1.containsKey(chArray1[i])) {
                hashMap1.put(chArray1[i], 1);
            } else {
                int value = hashMap1.get(chArray1[i]);
                value = value + 1;
                hashMap1.remove(chArray1[i]);
                hashMap1.put(chArray1[i], value);
            }
        }

        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < chArray2.length; i++) {
            if (!hashMap2.containsKey(chArray2[i])) {
                hashMap2.put(chArray2[i], 1);
            } else {
                int value = hashMap2.get(chArray2[i]);
                value = value + 1;
                hashMap2.remove(chArray2[i]);
                hashMap2.put(chArray2[i], value);
            }
        }

        if (hashMap1.equals(hashMap2))
            System.out.print("Anagram!!");
        else
            System.out.print("Not Anagram!!");

    }

    public static void findDuplicatesInAString(String str) {
        char[] chArray = str.toCharArray();
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < chArray.length; i++) {
            if (!hs.contains((Character) chArray[i]))
                hs.add(chArray[i]);
            else
                System.out.print(chArray[i] + " ");
        }
    }
}
