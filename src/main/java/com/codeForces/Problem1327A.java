package com.codeForces;

public class Problem1327A {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 10;
        int n = 2;



        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if ((arr[i] + arr[k]) == sum) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
            System.out.println();
        }
    }
}