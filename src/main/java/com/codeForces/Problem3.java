package com.codeForces;

import java.util.Scanner;

public class Problem3 {
    /**
     A. Even Subset Sum Problem
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();

        while (noOfTestCases --> 0){
            int k = scanner.nextInt();
            int[] arr = new int[k];
            String str  = scanner.nextLine();
            String[] strArr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if((arr[i]+arr[j])%2 == 0)
                        count = count+1;
                }
            }
            System.out.println(count);
        }
    }
}
