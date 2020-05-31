package com.mediumSiteCodes.basicProblems.problemsProgrammer;


import java.util.HashSet;

public class LinkedListRelatedPrograms {

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
        insert(20);
        insert(20);
        insert(40);
        insert(50);

        printLinkedList(headNode);
        System.out.println("\nMiddle Node in Linked List is = ");
        findMiddleInLinkedList(headNode);
        System.out.println("Print linked List reversely is = ");
        reverseALinkedList(headNode);
        System.out.println("\nAdd two Linked List is = ");
        addTwoLinkedList(headNode, headNode);
        System.out.println("\nLength of a Linked List is = ");
        len(headNode);
        System.out.println("\nRemove duplicate node from a linked list is = ");
        removeDuplicateNode(headNode);
        System.out.println("\nFind third node from end in linked list = ");
        findThirdNode(headNode);
        System.out.println("\nReverse A linked list is = ");
        Node reverseNode = reverse(headNode);
        printLinkedList(reverseNode);
    }


    private static void addTwoLinkedList(Node node1, Node node2) {
        int sum = 0;

        printLinkedList(node1);
        System.out.println();
        printLinkedList(node2);

        while (node1 != null && node2 != null) {
            sum += node1.data + node2.data;
            node1 = node1.next;
            node2 = node2.next;
        }

        System.out.print("\n"+sum);
    }

    private static void removeDuplicateNode(Node node) {
        Node currentNode = node, prevNode = node;
        HashSet<Integer> hs = new HashSet<>();

        hs.add(node.data);

        while (prevNode != null && currentNode != null) {
            if (!hs.contains(currentNode.data)) {
                hs.add(currentNode.data);
            } else {
                currentNode = currentNode.next;
                prevNode.next = currentNode.next;
            }
            System.out.print(prevNode.data + " ");
            currentNode = currentNode.next;
            prevNode = prevNode.next;
        }
    }

    private static void len(Node node) {
        int len = 0;
        while (node != null) {
            len += 1;
            node = node.next;
        }
        System.out.print(len);
    }

    private static void findThirdNode(Node node) {
        Node first = node, second = node, third = node;

        if (node.next != null)
            second = node.next;

        if (second.next != null)
            third = second.next;

        while (third.next != null) {
            first = first.next;
            second = second.next;
            third = third.next;
        }

        System.out.print(first.data);
    }

    private static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // print a linked list
    private static void reverseALinkedList(Node node) {
        if (node == null) {
            return;
        }
        reverseALinkedList(node.next);
        System.out.print(node.data + " ");
    }

    private static void findMiddleInLinkedList(Node node) {
        Node midNode = node;
        Node currentNode = node;

        while (currentNode != null) {
            currentNode = currentNode.next;
            if (currentNode != null && currentNode.next != null) {
                midNode = midNode.next;
                currentNode = currentNode.next;
            }
        }
        System.out.println(midNode.data);
    }

}
