package com.mediumSiteCodes.linkedListProblems;

public class CloneAGivenLinkedList {

    public static void main(String[] args) {
        ImplementationOfLinkedList impl = new ImplementationOfLinkedList();
        LinkedList.Node node = impl.addObjectInLinkedList();

        LinkedList.Node clonedCopy = cloning(node);

        printLinkedList(clonedCopy);
    }

    static void printLinkedList(LinkedList.Node headNode) {
        LinkedList.Node currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.empObject.toString() + "\n");
            currentNode = currentNode.next;
        }
    }

    private static LinkedList.Node cloning(LinkedList.Node node) {
        LinkedList.Node currentNode = node;
        LinkedList.Node cloneCopy = null;
        LinkedList.Node tail = null;

        while (currentNode != null) {
            if (cloneCopy == null) {
                cloneCopy = new LinkedList.Node<>(currentNode.empObject);
                tail = cloneCopy;
            } else {
                tail.next = new LinkedList.Node();
                tail = tail.next;
                tail.empObject = currentNode.empObject;
                tail.next = null;
            }
            currentNode = currentNode.next;
        }
        return cloneCopy;
    }

}
