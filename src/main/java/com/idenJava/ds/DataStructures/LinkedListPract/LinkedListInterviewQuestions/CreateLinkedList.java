package com.idenJava.ds.DataStructures.LinkedListPract.LinkedListInterviewQuestions;

import java.util.ArrayList;

public class CreateLinkedList {

    Node headNode;
    Node tailNode;

    class Node {
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

    void display(Node node) {
        Node currentNode = node;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        Node currentNode = headNode;
        StringBuilder stringBuilder = new StringBuilder();
        while (currentNode != null) {
            stringBuilder.append(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        return stringBuilder.toString();
    }

    private void deleteNode(int data) {
        Node currentNode = headNode;
        Node prevNode = null;

        if (currentNode == null) {
            System.out.println("Linked List is empty!!");
        }

        while (currentNode != null) {
            if (currentNode.data == data) {

            }
            currentNode = currentNode.next;
        }
    }


    private void addNodeAtEnd(int data) {
        Node addNodeAtEnd = headNode;
        while (addNodeAtEnd.next != null) {
            addNodeAtEnd = addNodeAtEnd.next;
        }
        addNodeAtEnd.next = new Node(data);

    }

    private void insertNodeAtPos(Node headNode, int data) {
        Node insertNodeAtPos = headNode;

        if (insertNodeAtPos == null) {
            System.out.println("Linked List is empty!!");
        }

        if (insertNodeAtPos.next.data < data) {
            insertNodeAtPos(insertNodeAtPos.next, data);
        } else {
            Node newNode = new Node(data);
            newNode.next = headNode.next;
            headNode.next = newNode;
        }
    }


    private void reverseLinkedList(Node currentNode) {
        Node head = headNode;
        Node iterateNode = currentNode;
        if (iterateNode != null && iterateNode.next != null) {
            reverseLinkedList(iterateNode.next);
        } else {
            if(iterateNode == null){
                System.out.println("List is Empty || List got reversed!! ");
            }else {
                System.out.println(iterateNode.data);
                Node removeLastNode = remove(head);
                reverseLinkedList(removeLastNode);
            }
        }
    }

    Node reverse(Node node)
    {
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



    // 1 2 3 4 5
    private Node remove(Node removeLastNode) {
        Node node = removeLastNode;

        if(node == null){
            return null;
        }

        if(node.next == null){
            return null;
        }

        while (node.next.next!=null){
            node = node.next;
        }

        node.next = null;

        return node;
    }


    public static void main(String[] args) {
        CreateLinkedList linkedList = new CreateLinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        System.out.println();
        linkedList.display(linkedList.headNode);

        System.out.println();
        System.out.println(linkedList.toString());

        /*System.out.println();
        linkedList.deleteNode(20);*/

        // Add node at End.
        System.out.println();
        linkedList.addNodeAtEnd(1000);
        System.out.println(linkedList.toString());


        linkedList.insertNodeAtPos(linkedList.headNode, 25);
        linkedList.insertNodeAtPos(linkedList.headNode, 50);
        linkedList.display(linkedList.headNode);


        System.out.println();
        linkedList.insertNodeAtPos(linkedList.headNode, 60);
        linkedList.display(linkedList.headNode);


        System.out.println();
        linkedList.reverseLinkedList(linkedList.headNode);
        System.out.println();
    }
}
