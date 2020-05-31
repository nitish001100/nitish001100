package com.treeAndGraph;

public class MergeSortedLinkedList {

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


    static void printLinkedList(Node node) {
        Node currentNode = headNode;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        Node ll1 = headNode;
        printLinkedList(ll1);

        System.out.println("\n---------------------------------------------------------");
        headNode = null;

        insert(25);
        insert(45);

        Node ll2 = headNode;
        printLinkedList(ll2);

        Node output = mergeLinkedList(ll1, ll2);
        System.out.println("\n---------------------------------------------------------");
        printLinkedList(output);

    }

    private static Node mergeLinkedList(Node headA, Node headB) {

        Node dummyNode = new Node(0);

        Node tail = dummyNode;

        while (true) {

            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }

            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }

            tail = tail.next;
        }
        return dummyNode.next;
    }

    private static Node mergeLinkedListIden(Node headA, Node headB) {

        Node dummyNode = new Node(0);
        Node tail = dummyNode;

        while (true) {
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }

            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }

            tail = tail.next;
        }

        return dummyNode.next;
    }
}
