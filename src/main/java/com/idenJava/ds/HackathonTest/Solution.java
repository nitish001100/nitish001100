package com.idenJava.ds.HackathonTest;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static com.idenJava.ds.HackathonTest.Result.funWithAnagrams;


class Result {

    /*
     * Complete the 'funWithAnagrams' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY text as parameter.
     */

    public static List<String> funWithAnagrams(List<String> text) {

        String[] strArr = new String[text.size()];
        for (int i = 0; i < text.size(); i++)
            strArr[i] = text.get(i);

        List<String> targetResult = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (areAnagram(strArr[i], strArr[j]) == true){
                    if(!targetResult.contains(strArr[i])) {
                        targetResult.add(strArr[i]);
                        for (int i1 = 0; i1 < targetResult.size(); i1++) {
                            for (int i2 = i1+1; i2 < targetResult.size(); i2++) {
                                if(areAnagram(targetResult.get(i1), targetResult.get(i2)) == true){
                                    targetResult.remove(targetResult.get(i2));
                                }
                            }
                        }
                    }
                }
            }
        }

        if(targetResult.size() == 0){
            for (int i = 0; i < strArr.length; i++) {
                targetResult.add(strArr[i]);
            }
        }

        List<String> result = sort(targetResult);
        return result;
    }


    static boolean areAnagram(String str1, String str2) {

        HashMap<Character, Integer> hmap1
                = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2
                = new HashMap<Character, Integer>();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        // Mapping first string
        for (int i = 0; i < arr1.length; i++) {

            if (hmap1.get(arr1[i]) == null) {

                hmap1.put(arr1[i], 1);
            } else {
                Integer c = (int) hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }

        // Mapping second String
        for (int j = 0; j < arr2.length; j++) {

            if (hmap2.get(arr2[j]) == null)
                hmap2.put(arr2[j], 1);
            else {

                Integer d = (int) hmap2.get(arr2[j]);
                hmap2.put(arr2[j], ++d);
            }
        }

        if (hmap1.equals(hmap2))
            return true;
        else
            return false;
    }

    static List<String> sort(List<String> targetSortedist){

        String[] str = new String[targetSortedist.size()];

        for (int i = 0; i < targetSortedist.size(); i++) {
            str[i] = targetSortedist.get(i);
        }

        for(int i = 0; i<str.length-1; i++) {
            for (int j = i+1; j<str.length; j++) {
                if(str[i].compareTo(str[j])>0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        return list;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<String> list =  new ArrayList<>();
        /*list.add("poke");
        list.add("pkoe");
        list.add("okpe");
        list.add("ekop");*/

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        List targetList = funWithAnagrams(list);
        System.out.println(funWithAnagrams(targetList));


    }
}
