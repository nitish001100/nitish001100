package com.mediumSiteCodes.linkedListProblems;

import static com.mediumSiteCodes.linkedListProblems.LinkedList.printLinkedList;

public class PopInLinkedList {
    public static void main(String[] args) {

        ImplementationOfLinkedList impl = new ImplementationOfLinkedList();
        System.out.println("Before popping the head from linked list, below is the result.");
        LinkedList.Node headNode = impl.addObjectInLinkedList();
        printLinkedList(headNode);


        System.out.println("---------------------------------------------");
        headNode = pop(headNode);
        System.out.println("After popping the head from linked list, below is the result.");
        printLinkedList(headNode);


        System.out.println("---------------------------------------------");
        headNode = pop(headNode);


        System.out.println("After popping the head from linked list, below is the result.");
        printLinkedList(headNode);
        System.out.println("---------------------------------------------");
    }

    public static LinkedList.Node pop(LinkedList.Node headNode) {
        if (headNode == null)
            return null;
        if (headNode != null)
            headNode = headNode.next;
        return headNode;
    }
}
