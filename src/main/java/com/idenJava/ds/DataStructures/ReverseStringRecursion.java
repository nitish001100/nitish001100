package com.idenJava.ds.DataStructures;

public class ReverseStringRecursion {

    static char[] reverseString(String str){

        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length/2; i++) {
            char buffer ;
            buffer = charArr[i];
            charArr[i] = charArr[charArr.length-i-1];
            charArr[charArr.length-i-1] = buffer;
        }

        return charArr;
    }

    void recursion(String str){

    }

    public static void main(String[] args) {
        String str = "Nitish";

    }
}
