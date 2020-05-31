package com.geeksOfGeeks.amazon;

import java.util.LinkedList;

import static com.geeksOfGeeks.amazon.LinkedLis.*;
import static com.geeksOfGeeks.amazon.LinkedLis.Node.addNode;

class LinkedLis {

    static Node head;
    static Node tail;

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        static void addNode(int data) {

            Node node = new Node(data);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
    }

    static void printLinkedL() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    static void deleteANode(int data) {
        Node currentNode = head;
        Node prevNode = null;

        if (currentNode.data == data)
            currentNode = currentNode.next;

        while (currentNode != null && currentNode.data != data) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode == null)
            return;

        prevNode.next = currentNode.next;
    }

    static Node add1ToANode(int number) {
        head = null;
        tail = null;

        int counter = 2;
        LinkedList<Integer> stack = new LinkedList<>();
        while (number != 0 && counter >= 0) {
            stack.push(number%10);
            counter = counter - 1;
            number = number / 10;
        }

        for (int i = 0; i < 3; i++)
            addNode(stack.pop());


        int carry = addWithCarry(head);

        if (carry > 0)
        {
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }

        return head;
    }

    static int addWithCarry(Node head){
        if (head == null)
            return 1;

        int res = head.data + addWithCarry(head.next);

        head.data = res % 10;
        return res/10;
    }
}


public class DeleteANodeInLL {
    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);
        addNode(50);

        printLinkedL();
        deleteANode(30);
        add1ToANode(199);
    }
}
