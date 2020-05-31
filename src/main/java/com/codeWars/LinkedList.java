package com.codeWars;


import java.util.*;
import java.util.stream.Collectors;

public class LinkedList {

    static Node head;
    static Node tail;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    static void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public static String stringify(Node node) {
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.data + " -> ");
            node = node.next;
        }
        if (node == null)
            stringBuilder.append("null");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        add(40);
        add(50);
        System.out.println(stringify(head));

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Java", 10);
        hm.put("Ruby", 80);
        hm.put("Python", 65);

        List<String> list = myLanguages(hm);
        Collections.sort(list);


        list.stream().forEach(v -> System.out.println(v));

        int[] arr = monkeyCount(10);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println("Pangram: ");
        System.out.println(check("The quick brown fox jumps over the lazy dog."));



        /*String[] citiesVisited = {"Mexico City","Johannesburg","Stockholm,'Osaka','Saint Petersburg','London'];
        citiesOffered = ['Stockholm','Paris','Melbourne'];
*//*
        conferencePicker()
*/

        double[] arr0 = {1, 1, 1};
        arr0 = printTribbonaci(arr0, 10);

        for (int i = 0; i < arr0.length; i++)
            System.out.print(arr0[i] + " ");

        System.out.println("--------------------------------------");
        /**
         assertEquals(6, Kata.expressionsMatter(2, 1, 2));
         assertEquals(3, Kata.expressionsMatter(1, 1, 1));
         assertEquals(4, Kata.expressionsMatter(2, 1, 1));
         assertEquals(9, Kata.expressionsMatter(1, 2, 3));
         assertEquals(5, Kata.expressionsMatter(1, 3, 1));
         assertEquals(8, Kata.expressionsMatter(2, 2, 2));
         }

         @Test public void checkIntermediateValues() {
         assertEquals( 20, Kata.expressionsMatter(5, 1, 3));
         assertEquals(105, Kata.expressionsMatter(3, 5, 7));
         assertEquals( 35, Kata.expressionsMatter(5, 6, 1));
         assertEquals(  8, Kata.expressionsMatter(1, 6, 1));
         assertEquals( 14, Kata.expressionsMatter(2, 6, 1));
         assertEquals( 48, Kata.expressionsMatter(6, 7, 1));
         */

//        System.out.println(expressionsMatter(2, 1, 2));
//        System.out.println(expressionsMatter(1, 1, 1));
//        System.out.println(expressionsMatter(2, 1, 1));
//        System.out.println(expressionsMatter(1, 2, 3));
        System.out.println(expressionsMatter(1, 3, 1));
//        System.out.println(expressionsMatter(2, 2, 2));


        String[] str = {"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"};
        System.out.println(points(str));


        System.out.println(abbrevName("Ganesh Ch"));
    }


    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet()
                .stream()
                .filter(me -> me.getValue() >= 60)
                .sorted((m1, m2) -> Integer.compare(m2.getValue(), m1.getValue()))
                .map(me -> me.getKey())
                .collect(Collectors.toList());
    }

    public static int[] monkeyCount(final int n) {
        int[] arr = new int[n];

        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter += 1;
        }
        return arr;
    }

    public static boolean check(String sentence) {

        boolean[] checker = new boolean[26];

        char[] chArray = sentence.toLowerCase().toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            if ((int) chArray[i] - 97 >= 0 && (int) chArray[i] - 97 < 26)
                checker[(int) chArray[i] - 97] = true;
        }

        int count = 0;

        for (int i = 0; i < checker.length; i++) {
            if (checker[i] == true)
                count += 1;
        }

        if (count == 26)
            return true;

        return false;
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += Math.pow(n[i], 2);
        }
        return sum;
    }

    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < citiesVisited.length; i++)
            hs.add(citiesVisited[i]);

        for (int i = 0; i < citiesOffered.length; i++) {
            if (!hs.contains((String) citiesOffered[i]) == true) {
                return (String) citiesOffered[i];
            }
        }
        return "No worthwhile conferences this year!";
    }

    public static List<String> findChildren(List<String> santasList, List<String> children) {

        children.removeAll(santasList);
        Collections.sort(children);
        return children;
    }

    public static double[] printTribbonaci(double[] s, int n) {
        int ptr1 = 0, ptr2 = 1, ptr3 = 2;

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < s.length; i++)
            al.add((int) s[i]);

        int counter = 0;
        while (counter < n) {
            al.add(al.get(ptr1) + al.get(ptr2) + al.get(ptr3));
            ptr1 += 1;
            ptr2 += 1;
            ptr3 += 1;
            counter += 1;
        }

        double[] retArr = new double[al.size()];

        for (int i = 0; i < al.size(); i++)
            retArr[i] = al.get(i);

        return retArr;
    }

    public static String[] fixTheMeerkat(String[] arr) {

        String[] arr0 = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "head":
                    arr0[0] = arr[i];
                    break;
                case "body":
                    arr0[1] = arr[i];
                    break;
                case "tail":
                    arr0[2] = arr[i];
                    break;
            }
        }
        return arr0;
    }

    public static int expressionsMatter(int a, int b, int c) {
        // + , *, ()

        int x = a + b + c;
        int y = a * b * c;

        int max = 0, first = 0, second = 0;

        if (a > c) {
            max = a;
            first = b;
            second = c;
        } else {
            max = c;
            first = a;
            second = b;
        }

        int z = max * (first + second);

        if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else return z;
    }

    public static int Past(int h, int m, int s) {
        int sum = 0;
        sum += h * 3600000;
        sum += m * 60 * 1000;
        sum += s * 1000;

        return sum;
    }

    public static int points(String[] games) {
        int points = 0;
        for (int i = 0; i < games.length; i++) {
            String[] arr = games[i].split(":");
            int x = Integer.valueOf(arr[0]);
            int y = Integer.valueOf(arr[1]);

            if (x >= 0 && x <= 4 && y >= 0 && y <= 4)
                if (x > y)
                    points += 3;
                else if (y > x)
                    points += 0;
                else if (x == y)
                    points += 1;
        }
        return points;
    }

    public static String abbrevName(String name) {
        char[] chArray = name.toCharArray();
        char c = name.toCharArray()[0];
        String str = "";

        if (Character.isUpperCase(c))
            str = str + String.valueOf(c).toUpperCase();
        else
            str = str + String.valueOf(c).toLowerCase();


        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == ' ') {
                str = str + ".";
                if (Character.isUpperCase(chArray[i + 1]))
                    str = str + String.valueOf(chArray[i + 1]).toUpperCase();
                else
                    str = str + String.valueOf(chArray[i + 1]).toLowerCase();
                break;
            }
        }

        name = str;


        return name;
    }
}


class Cube{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}