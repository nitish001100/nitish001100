package com.byteByByte;

public class FizzBuzzProblem {
    public static void main(String[] args) {
        int num = 14;
        check(num);
    }

    private static void check(int num) {
        if (num % 3 == 0)
            System.out.println("Fizz");
        else if (num % 5 == 0)
            System.out.println("Buzz");
        else if (num % 3 == 0 && num % 5 == 0)
            System.out.println("FizzBuzz");
        else
            System.out.println(num);
    }
}
