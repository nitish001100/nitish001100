package com.googleKickStart;

import java.io.IOException;
import java.util.Scanner;

/**
 * There are N houses for sale. The i-th house costs Ai dollars to buy. You have a budget of B dollars to spend.
 * <p>
 * What is the maximum number of houses you can buy?
 */


import java.io.*;

public class Houses {



    static int solve(int[] arr, int dollars) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if ((arr[i] + arr[j]) < dollars) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCasesCount = Integer.parseInt(bufferedReader.readLine().trim());

        while (testCasesCount --> 0){
            Scanner scanner = new Scanner(System.in);
            String secondRow   = scanner.nextLine();
            String[] str = secondRow.split(" ");
            int dollars = Integer.parseInt(str[1]);
            String[] strArr = scanner.nextLine().split(" ");
            int[] arr = new int[strArr.length];

            for (int i = 0; i < strArr.length; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }

            int result = Houses.solve(arr, dollars);
            System.out.println(result);
        }

        bufferedReader.close();

    }
}