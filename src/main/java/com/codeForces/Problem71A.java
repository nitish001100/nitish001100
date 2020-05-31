package com.codeForces;

import java.util.Scanner;

public class Problem71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            String str = scanner.next();
            if(str.length()>10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.charAt(0));
                stringBuilder.append(str.length() - 2);
                stringBuilder.append(str.charAt(str.length() - 1));
                System.out.println(stringBuilder.toString());
            }else {
                System.out.println(str);
            }
        }
    }
}
