package com.idenJava.ds.DataStructures;

public class Anagram {

    static String str1, str2;
    static char[] char1;
    static char[] char2;

    /**
     Checking Anagram -

     First Way:
        Sort the arrays and then compare the arrays.

     */
    static boolean isAnagram(String a, String b) {

        char1 = a.toLowerCase().toCharArray();
        char2 = b.toLowerCase().toCharArray();

        char1 = sort(char1);
        char2 = sort(char2);

        boolean flag = false;

        for (int i = 0; i < char1.length; i++) {
            for (int j = i; j < char2.length; j++) {
                if((int)char1[i] == (int)char2[j]) {
                    flag = true;
                    break;
                }else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    static char[] sort(char[] charArr) {
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length - 1; j++) {
                if (charArr[i] > charArr[j]) {
                    char buffer;
                    buffer = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = buffer;
                }
            }
        }
        return charArr;
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "margana";
        System.out.println(isAnagram(str1, str2));

    }
}
