package com.codeWars;

import java.util.Arrays;

public class Kata2 {
    public static void main(String[] args) {
        System.out.println(Kata3.encryptThis(""));
    }
}

class Kata3 {
    public static String encryptThis(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = text.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].toCharArray().length; i1++) {
                if (i1 == 0)
                    stringBuilder.append((int) arr[i].charAt(i1));
                else if (i1 == 1) {
                    arr = swap(arr, i, i1);
                    stringBuilder.append(arr[i].charAt(i1));
                } else {
                    stringBuilder.append(arr[i].charAt(i1));
                }
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static String[] swap(String[] arr, int i, int i1) {
        String str = arr[i];
        char[] chArray  = str.toCharArray();

        char buffer;

        buffer = chArray[1];
        chArray[1] = chArray[chArray.length-1];
        chArray[chArray.length-1] = buffer;

        String[] str0 = new String[chArray.length];

        for (int i2 = 0; i2 < chArray.length; i2++)
            str0[i2] = String.valueOf(chArray[i2]);
        arr[i] = Arrays.toString(str0)
                .substring(1, Arrays.toString(str0).length()-1).replace(",","")
                .replaceAll("\\s", "");

        return arr;
    }
}
