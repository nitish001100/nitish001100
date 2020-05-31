package com.idenJava.ds.leetCode;


import java.util.LinkedList;

public class Leet2 {

    static Node headNode;
    static Node tailNode;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static void insert(int data) {
        Node node = new Node(data);

        if (headNode == null) {
            headNode = node;
            tailNode = node;
        } else {
            tailNode.next = node;
            tailNode = node;
        }
    }

    static void add(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int carry = 0;
        LinkedList<Integer> l3 = new LinkedList<>();
        for (int i = l1.size() - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if ((l1.get(i) + l2.get(j)) >= 10) {
                    int value = (l1.get(i) + l2.get(j)) % 10;
                    l3.add(value + carry);
                    carry = (l1.get(i) + l2.get(j)) / 10;
                    break;
                } else {
                    l3.add(l1.get(i) + l2.get(j) + carry);
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(3);
        l1.add(4);
        l1.add(2);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(4);
        l2.add(6);
        l2.add(5);
        //add
//        add(l1, l2);
//

        insert(1);
        insert(2);
        insert(3);

        LinkedList<Integer> l5 = new LinkedList<>();

        while (headNode!=null){
            l5.add(headNode.data);
            headNode = headNode.next;
        }

        for (int i = 0; i < l5.size(); i++) {
            System.out.println(l5.get(i));
        }



    }
}
