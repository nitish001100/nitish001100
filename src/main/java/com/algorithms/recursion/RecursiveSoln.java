package com.algorithms.recursion;

public class RecursiveSoln {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " = " + fact(num));
        System.out.println("Fibonacci of 4 = " + fib(4));
        System.out.print("Fibonacci of 4 without recursion = ");
        fibWithOutRecursion(num);

        RecursiveSoln recursiveSoln = new RecursiveSoln();

        recursiveSoln.insertNode(10);
        recursiveSoln.insertNode(20);
        recursiveSoln.insertNode(30);

        recursiveSoln.printLinkedList();
        System.out.println("Reversing the Linked List!!");
        reverseLinkedList(recursiveSoln.head);
    }

    private static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fact(num - 1);
    }

    private static int fib(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;

        return fib(num - 1) + fib(num - 2);
    }

    private static void fibWithOutRecursion(int num) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    Node head;
    Node tail;

    public static void reverseLinkedList(Node head) {
        if (head == null)
            return;
        reverseLinkedList(head.next);
        System.out.println(head.data);
    }




    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    public void insertNode(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void printLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print("\n" + currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

}