package com.geeksOfGeeks.amazon;

public class countSubStringStartWith1 {
    public static void main(String[] args) {
        String str1 = "00100101";
        char[] ch = str1.toCharArray();
        int count = 0;
        for (int itr = 0; itr < ch.length; itr++) {
            if (ch[itr] == Character.valueOf('1')) {
                for (int itr1 = itr + 1; itr1 < ch.length; itr1++) {
                    if (ch[itr1] == Character.valueOf('1'))
                        count = count + 1;
                }
            }
        }
        System.out.println(count);

        // worst time complexity = O(n).
    }
}
