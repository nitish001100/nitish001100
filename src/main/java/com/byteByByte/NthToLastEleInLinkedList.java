package com.byteByByte;


public class NthToLastEleInLinkedList {

    static Node headNode;
    static Node tailNode;

    static class Node {
        int data;
        Node next;

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
            tailNode.next = node;
            tailNode = node;
        }
    }

    static void printLinkedList() {
        Node currentNode = headNode;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        insertNode(1);
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);

        printLinkedList();
        nthToLastEleInLinkedList(1);
    }

    private static void nthToLastEleInLinkedList(int pos) {

        int counterPos = 1;
        Node currentNode = headNode;
        Node state = null;

        while (currentNode != null) {
            if (counterPos != pos) {
                counterPos += 1;
                currentNode = currentNode.next;
            } else {
                state = currentNode;
                break;
            }
        }

        int count = 0;
        while (state != null){
            count += 1;
            state = state.next;
        }


        System.out.println("\nFor n =" + pos + " output is: " + (count-1));
    }
}
