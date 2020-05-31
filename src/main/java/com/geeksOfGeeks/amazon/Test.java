package com.geeksOfGeeks.amazon;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        int num = 100;
        getDigit(num);
    }

    static void getDigit(int num) {
        int number = num;
        LinkedList<Integer> stack = new LinkedList<>();
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
