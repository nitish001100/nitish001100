package com.mediumSiteCodes.linkedListProblems;

public class InsertGivenNodeInSortedPos {
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

    private static Node insertAtProperPos(int data) {
        Node currentNode = headNode;
        Node node = new Node(data);
        Node tailNode = null;
        while (currentNode != null) {
            if (currentNode.data < data) {
                tailNode = currentNode;
                currentNode = currentNode.next;
            } else {
                node.next = currentNode;
                tailNode.next = node;
                break;
            }
        }
        return headNode;
    }

    public static void main(String[] args) {
        insert(10);
        insert(30);
        insert(40);
        insert(50);

        System.out.println("Before inserting it at proper pos.");
        printLinkedList(headNode);
        System.out.println("\n***************************************");
        System.out.println("After inserting it at proper pos.");
        Node modifiedNode = insertAtProperPos(20);
        printLinkedList(modifiedNode);
    }
}

