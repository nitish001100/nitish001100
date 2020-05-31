package com.treeAndGraph;

public class CreateLinkedList {

    static Node headNode;
    static Node tailNode;

    static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
        }
    }

    static void insertNode(int data) {

        Node node = new Node(data);

        if (headNode == null) {
            headNode = node;
            tailNode = node;
        } else {
            tailNode.nextNode = node;
            tailNode = node;
        }
    }

    static void printLinkedList() {
        Node currentNode = headNode;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
    }

    public static void main(String[] args) {
        insertNode(10);
        insertNode(20);
        insertNode(30);
        insertNode(40);
        insertNode(50);
        insertNode(60);

        printLinkedList();
    }
}
