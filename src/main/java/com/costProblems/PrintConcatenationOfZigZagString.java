package com.costProblems;

public class PrintConcatenationOfZigZagString {
    public static void main(String[] args) {
        /*String str = "ABCDEFGH";
        int n = 2;*/

        String str = "GEEKSFORGEEKS";
        int n = 3;
        printConcatenationOfZigZagString(str, n);

    }

    private static void printConcatenationOfZigZagString(String str, int n) {

        char[] charArray = str.toCharArray();

        if (n % 2 == 0) {
            //include
            int forEven = n;
            int counter = 0;
            while (forEven > 0) {
                while (counter < charArray.length) {
                    System.out.print(charArray[counter]);
                    counter += forEven;
                }
                counter = 1;
                forEven -= 1;
            }
        } else {
            //exclude
            int forOdd = n+1;
            int counter = 0;
            while (forOdd > 0) {
                while (counter < charArray.length) {
                    System.out.print(charArray[counter]);
                    counter = counter+(forOdd);
                }
                counter = 1;
                forOdd -= 1;
            }
        }
    }
}
