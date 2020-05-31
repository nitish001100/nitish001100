package com.idenJava.hackerRank;

import java.util.*;

public class JavaStringReverse {

    static String findPalindrome(String s1) {
        String flag = "No";
        if (s1.length() % 2 == 0) {

            char[] charArr = s1.toCharArray();

            for (int i = 0; i < charArr.length / 2; i++) {
                if (!(charArr[i] == charArr[(charArr.length-1) - i])) {
                    flag = "No";
                }else {
                    flag = "Yes";
                }
            }
        }else {
            char[] charArr = s1.toCharArray();

            for (int i = 0; i < charArr.length / 2; i++) {
                if (!(charArr[i] == charArr[(charArr.length-1) - i])) {
                    flag = "No";
                }else {
                    flag = "Yes";
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        String A=sc.next();*/

        String s1 = "madam";
        System.out.println(findPalindrome(s1));

    }
}






