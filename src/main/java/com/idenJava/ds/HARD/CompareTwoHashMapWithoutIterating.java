package com.idenJava.ds.HARD;

import java.util.HashMap;

public class CompareTwoHashMapWithoutIterating {

    public static void main(String[] args) {
        HashMap<Integer, String> h1 = new HashMap<>();
        h1.put(1,"A");
        h1.put(2,"B");
        h1.put(3,"C");
        h1.put(4,"D");
        h1.put(5,"E");

        HashMap<Integer, String> h2 = new HashMap<>();
        h2.put(1,"A");
        h2.put(2,"B");
        h2.put(3,"C");
        h2.put(4,"D");
        h2.put(5,"F");

        // equals - compare the two objects.
        System.out.println(h1.equals(h2) ? true : false);




    }
}
