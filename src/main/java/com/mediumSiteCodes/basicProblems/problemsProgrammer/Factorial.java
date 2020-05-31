package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class Factorial {
    public static void main(String[] args) {
        int result = fact(4);
        System.out.println(result);
        factIterative(4);
    }

    // factorial recursive solution
    public static int fact(int num) {
        if (num == 1) {
            return 1;
        } else {
            num = num * fact(num - 1);
        }
        return num;
    }

    // factorial iterative solution
    public static void factIterative(int num) {
        int result = 1;
        while (num > 0) {
            result = result * num;
            num -= 1;
        }
        System.out.println(result);
    }
}
