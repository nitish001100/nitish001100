package com.idenJava.hackerRank.VisitedStuffs;

import java.util.Arrays;

public class Visited {

    static  int[] logic(int abc){
        boolean[] b = new boolean[10];


 /*       for (int i = 0; i < b.length; i++)
            b[i] = false;*/
        Arrays.fill(b,false);

        int[] arr = new int[10];

        for (int i = abc; i < arr.length; i++) {
            arr[i] = i;
            b[i] = true;
        }

        int [] notVisted = new int[5];

        for (int i = 0; i < b.length; i++) {
            if(b[i] == false){
                notVisted[i] = i;
            }
        }

        return notVisted;
    }

    public static void main(String[] args) {
        int[] o = logic(5);

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }
    }
}
