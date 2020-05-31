package com.mediumSiteCodes.linkedListProblems;

public class SortALinkedList {
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
        if (headNode == null)
            headNode = node;
        else
            tailNode.next = node;
        tailNode = node;
    }

    static void printLinkedList(Node node) {
        Node currentNode = node;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(50);
        insert(20);
        insert(40);
        insert(30);


        printLinkedList(headNode);
    }
}
