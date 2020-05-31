package com.geeksOfGeeks.amazon;

public class RepetitiveAdditionOfDigits {
    public static void main(String[] args) {
        int num = 1;

        boolean flag = false;
        int result = 0;

        while (!flag) {
            int a = num/10;
            int b = num%10;
            if ((a+b) < 9) {
                result = a+b;
                flag = true;
            } else
                num = a+b;
        }

        System.out.println(result);
    }
}