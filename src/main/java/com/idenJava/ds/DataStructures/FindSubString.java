package com.idenJava.ds.DataStructures;

public class FindSubString {
    static int isSubstring(String s1, String s2) {
        int M = s1.length(); //3
        int N = s2.length(); //13
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;
            if (j == M)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "for";
        String s2 = "geeksforgeeks";
        int res = isSubstring(s1, s2);
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index "
                    + res);

    }
}
