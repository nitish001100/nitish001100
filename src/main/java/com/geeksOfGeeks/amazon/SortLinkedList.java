package com.geeksOfGeeks.amazon;

import static com.geeksOfGeeks.amazon.LinkedL.*;

class LinkedL {

    static Node headNode;
    static Node tailNode;

    static class Node{
        Node nextNode;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    static void insertNode(int data){
        Node node = new Node(data);
        if(headNode == null){
            headNode = node;
            tailNode = node;
        }else {
            tailNode.nextNode = node;
            tailNode = node;
        }
    }

    static void printLinkedList(Node headNode){
        Node currentNode = headNode;

        while (currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.nextNode;
        }
    }

    static Node sortLinkedList(Node headNode){

        // 10 0 -5 20 40  //

        // -5 10 0 20 40
        Node currentNode = headNode;

        Node iNode = currentNode;
        while (iNode!=null){
            Node jNode = iNode.nextNode;
            while (jNode!=null){
                if(!(iNode.data<jNode.data)){
                    int temp = iNode.data;
                    iNode.data = jNode.data;
                    jNode.data = temp;
                }
                jNode = jNode.nextNode;
            }
            iNode = iNode.nextNode;
        }

        return currentNode;
    }

}
public class SortLinkedList {
    public static void main(String[] args) {
        insertNode(10);
        insertNode(0);
        insertNode(-5);
        insertNode(20);
        insertNode(40);

        printLinkedList(headNode);

        LinkedL.Node outputNode = sortLinkedList(headNode);
        System.out.println("\nAfter Sorting Linked List:");
        printLinkedList(outputNode);
    }
}
