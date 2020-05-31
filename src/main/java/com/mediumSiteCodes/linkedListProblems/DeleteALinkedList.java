package com.mediumSiteCodes.linkedListProblems;

import static com.mediumSiteCodes.linkedListProblems.LinkedList.printLinkedList;

public class DeleteALinkedList {
    public static void main(String[] args) {
        ImplementationOfLinkedList impl = new ImplementationOfLinkedList();
        LinkedList.Node headNode = impl.addObjectInLinkedList();
        LinkedList ll = new LinkedList();

        System.out.println("Before deleting a linked list: ");
        printLinkedList(headNode);
        System.out.println("Deleting a linked list: ");
        deleteALinkedList(headNode, 0);
        System.out.println("After deleted linked list state is: ");
    }

    public static void deleteALinkedList(LinkedList.Node headNode, int counter) {
        if (headNode == null)
            return;
        deleteALinkedList(headNode.next, counter + 1);
        System.out.println("Deleting " + counter + " node.");
    }
}
