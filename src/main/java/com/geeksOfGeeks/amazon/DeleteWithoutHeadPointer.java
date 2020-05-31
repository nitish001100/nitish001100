package com.geeksOfGeeks.amazon;

import static com.geeksOfGeeks.amazon.LinkedList.*;

class LinkedList {

    static Node headNode = null;
    static Node tailNode = null;

    static class Node {
        Node node;
        int data;

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
            tailNode.node = node;
            tailNode = node;
        }
    }

    static void printLinkedList(Node node) {

        Node currentNode = node;

        if (node == null)
            System.out.println("Linked List is empty.");

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.node;
        }
    }

    static void deleteNode(int data) {
        Node currentNode = headNode;
        Node prevNode = null;

        if (currentNode != null && currentNode.data == data)
            currentNode = currentNode.node;


        while (currentNode != null && currentNode.data != data) {
            prevNode = currentNode;
            currentNode = currentNode.node;
        }

        if (currentNode == null)
            return;

        prevNode.node = currentNode.node;

        System.out.println("\nAfter deleting node " + data + ", Below is the resultant LL.");

        printLinkedList(headNode);

    }

    static void deleteNodePract(Node deleteNode) {
        Node currentNode = headNode;
        Node prevNode = null;

        if (currentNode != null && currentNode.data == deleteNode.data)
            currentNode = currentNode.node;


        while (currentNode != null && currentNode.data != deleteNode.data) {
            prevNode = currentNode;
            currentNode = currentNode.node;
        }

        if (currentNode == null)
            return;

        prevNode.node = currentNode.node;

        System.out.println("\nAfter deleting node " + deleteNode.data + ", Below is the resultant LL.");

        printLinkedList(headNode);

    }
}

public class DeleteWithoutHeadPointer {

    public static void main(String[] args) {
        insertNode(10);
        insertNode(0);
        insertNode(5);
        insertNode(20);
        insertNode(40);
        insertNode(70);
        insertNode(100);

        printLinkedList(headNode);

      /*  System.out.println("Deleting Node thru data!!");
        deleteNode(5);
        System.out.println("Deleting Node thru Node object!!");
        Node deleteNode = new Node(0);
//        deleteNodePract(deleteNode);
*/
    }
}
