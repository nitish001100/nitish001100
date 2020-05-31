package com.idenJava.ds.LinkedListAlgoQues;

import java.util.HashSet;

public class MiddleElement {

    /**
     * How to find middle element of a singly linked list in one pass?
     */

    static Node headNode, tailNode = null;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void insert(int data) {
        Node node = new Node(data);
        if (headNode == null) {
            headNode = node;
            tailNode = node;
        } else {
            tailNode.next = node;
            tailNode = node;
        }
    }

    static void display(Node node) {
        if (node == null)
            System.out.println("No elements to iterate!!");

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static void middleElement(Node node) {
        Node index;
        Node nodeI = node;
        index = node;
        while (nodeI != null && index.next != null && index.next.next != null) {
            index = index.next.next;
            nodeI = nodeI.next;
        }
        System.out.print("Middle Element : " + nodeI.data);
    }

    static void findLoop(Node node) {
        Node transverseNode = node;
        HashSet<Integer> hashSet = new HashSet<>();
        while (transverseNode != null) {
            if (hashSet.contains(transverseNode.data)) {
                transverseNode = transverseNode.next;
                System.out.println("Found Cyclic");
            } else {
                hashSet.add(transverseNode.data);
                transverseNode = transverseNode.next;
            }
        }
    }

    private static Node remove(Node removeLastNode) {
        Node node = removeLastNode;
        if (node == null) {
            return null;
        }
        if (node.next == null) {
            return null;
        }
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
        return node;
    }


    private static Node removeNode(Node node, int data) {

        if (node == null) {
            System.out.println("LL is empty!!");
        }

        if (node.data == data) {
            node = node.next;
        } else {
            // 10 20 30 40
            while (node != null) {
                Node indexNode = node.next;
                if (indexNode != null && indexNode.data == data) {
                    node.next = indexNode.next;
                }
                node = node.next;
            }
        }
        return node;
    }

    private static void removeDuplicateNode() {
        Node node, indexNode = null;
        node = headNode;

        if (node == null)
            System.out.println("Empty LL!!");
        while (node != null && node.next != null) {
            indexNode = node;
            while (indexNode.next != null) {
                if (node.data == indexNode.next.data) {
                    indexNode.next = indexNode.next.next;
                } else {
                    indexNode = indexNode.next;
                }
            }
            node = node.next;
        }
    }

    private static int calculateLength() {
        Node node = headNode;
        int length = 0;

        // 1 2 3 4 5
        while (node.next != null) {
            length = length + 1;
            node = node.next;
        }
        return length + 1;
    }


    static void reverse() {
        Node currentNode = headNode, prevNode = null, nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        display(prevNode);
    }

    static void deleteKNodeFromEnd(int data) {
        Node slwPtr = headNode;
        Node fastPtr = headNode;

        while (slwPtr != null && fastPtr.next != null) {
            while (fastPtr != null && fastPtr.next != null) {
                if (fastPtr.data == data)
                    break;
                else
                    fastPtr = fastPtr.next;
            }
            slwPtr = slwPtr.next;
        }
    }



    static int getKNode(int nthNode){
        Node tortoise = headNode;
        Node hare = headNode;
        int start = 0;

        while (tortoise!=null){
            start = start+1;
            tortoise = tortoise.next;
            if(start > nthNode){
                hare = hare.next;
            }
        }
        return hare.data;
    }

    private static Node deleteAlternate(){

        Node alternateDelete = headNode;

         while (alternateDelete!=null && alternateDelete.next!=null){
             Node n1 = alternateDelete;
             Node n2 = alternateDelete.next.next;
             n1.next = n2;
             alternateDelete = n2;
         }
         return headNode;
    }

    public static void main(String[] args) {

        MiddleElement middleElement = new MiddleElement();
        middleElement.insert(10);
        middleElement.insert(20);
        middleElement.insert(30);
        middleElement.insert(30);
        middleElement.insert(40);
        middleElement.insert(40);
        middleElement.insert(50);
        middleElement.insert(60);
        middleElement.insert(70);
        middleElement.insert(80);
        middleElement.insert(90);


        display(middleElement.headNode);

        System.out.println();
        middleElement(middleElement.headNode);

        System.out.println();
        findLoop(middleElement.headNode);

        System.out.println();
        display(removeNode(middleElement.headNode, 50));

        System.out.println("How to remove duplicate nodes in an unsorted linked list?");
        removeDuplicateNode();
        display(middleElement.headNode);


        System.out.println();
        System.out.println("How to find the length of a singly linked list in Java?");
        System.out.println(calculateLength());


        System.out.println("How to delete alternate nodes of a Linked List");
        display(deleteAlternate());
        System.out.println();


        System.out.println("Pairwise swap elements of a given linked list?");
        display(pairWiseSwap());
        System.out.println();

        System.out.println();
        System.out.println("Reverse a Linked List!!");
        reverse();
        System.out.println();

        System.out.println();
        System.out.println("How to delete the Kth node from the end in a singly linked list?");
        deleteKNodeFromEnd(20);
        System.out.println();

        System.out.println();
        System.out.println("How to find the Kth node from the end in a singly linked list?");
        System.out.println(getKNode(5));

        System.out.println("How to insert a node at the beginning of the list?");
        insertNodeAtBeginning(100);


        System.out.println("How do you find the sum of two linked list using Stack in Java?");
        sumOfTwoLLUsingStack();


    }

    private static Node pairWiseSwap(){

        /**
         Input : 1->2->3->4->5->6->NULL
         Output : 2->1->4->3->6->5->NULL
         */
        Node swapNode = headNode;

        while (swapNode!=null && swapNode.next!=null){
            //swap the data
            int bufferData = swapNode.data;
            swapNode.data = swapNode.next.data;
            swapNode.next.data = bufferData;
            swapNode = swapNode.next.next;
        }
        return headNode;
    }


    static void insertNodeAtBeginning(int data){
        Node node = new Node(data);
        if(headNode == null){
            headNode = node;
        }else {
            node.next = headNode;
        }
        display(node);
    }

    static void sumOfTwoLLUsingStack(){

    }



}
