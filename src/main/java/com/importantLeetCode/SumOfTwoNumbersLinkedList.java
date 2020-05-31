package com.importantLeetCode;

public class SumOfTwoNumbersLinkedList {

    static Node head;
    static Node tail;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    static void printLinkedList(Node node) {
        Node currentNode = node;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        add(5);
        add(6);
        add(3);

        Node ll1 = head;

        head = null;

        add(8);
        add(4);
        add(2);

        Node ll2 = head;

        printLinkedList(ll1);
        System.out.println("---------------------------------\n");
        printLinkedList(ll2);
        System.out.println("---------------------------------\n");
        Node rN = addTwoLists(ll1, ll2);

        printLinkedList(rN);
        // Logi
    }

    static Node addTwoLists(Node first, Node second) {
        Node res = null; Node prev = null; Node temp = null; int carry = 0, sum;
        while (first != null || second != null) {
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            temp = new Node(sum);
            if (res == null)
                res = temp;
             else
                prev.next = temp;
            prev = temp;
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        return res;
    }
}
