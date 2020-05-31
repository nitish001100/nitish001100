package com.algorithms.recursion;

public class RecursionPractice {
    static int sum = 0;
    static Node node1 = null, node2 = null;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        if (recursionSum(arr, 0) == true)
            System.out.println("Sum of an array is: " + sum);

        System.out.println("Printing data recursively!!");
        printArrayRecursively(arr, 0);

        System.out.println("\nFinding max number in an array!!");
        int max = Integer.MIN_VALUE;
        System.out.println(findMax(arr, max, 0));


        addElementsInLinkedList();
        printLinkedList();
        System.out.println("\nPrint alternate nodes in Linked List using Head Recursion!!");
        Node printAlternateNodeHeadRecursion = head;
        int k0 = 1;
        printAlternateNodesUsingHeadRecursion(printAlternateNodeHeadRecursion, k0);

        System.out.println("\nPrint alternate nodes in Linked List using Tail Recursion!!");
        Node printAlternateNodeTailRecursion = head;
        int k1 = 1;
        printAlternateNodesUsingTailRecursion(printAlternateNodeTailRecursion, k1);


        System.out.println("\nIterative splitting Linked List!!");
        Node node0 = head;
        int k = 0;
        iterativeSplittingLinkedList(node0, k);
        print(node1, node2);

        System.out.println("\nFind Mid element!!");
        Node n1 = head;
        findMidElement(n1, 0, 0);


        System.out.println("\nDelete Linked List!!");
        Node delCurrentNode = head;
        deleteLinkedList(delCurrentNode);
        System.out.println("\nLinked List got deleted!!");

        System.out.println("Before deleting Kth Node in Linked List:- ");
        printLinkedList();
        Node currentNode = head;
        System.out.println("\nAfter deleting Kth Node in Linked List:- ");
        deleteKNode(currentNode, 2);
        printLinkedList();

    }

    //@Appreciation:- Nice Work Iden

    private static void findMidElement(Node node, int slowPtr, int fastPtr) {
        if (node == null) {
            int k = 0;
            Node itrNode = head;
            while (itrNode != null) {
                if (k == slowPtr/2)
                    System.out.println(itrNode.data);
                k += 1;
                itrNode = itrNode.next;
            }
            return;
        } else {
                findMidElement(node.next, slowPtr + 1, fastPtr + 2);
        }
    }

    private static void iterativeSplittingLinkedList(Node node0, int k) {
        if (node0 == null) {
            return;
        } else {
            Node node = new Node(node0.data);
            if (k % 2 != 0) {
                if (node1 == null) {
                    node1 = node;
                    node1.next = null;
                } else {
                    Node last = node1;
                    while (last.next != null) {
                        last = last.next;
                    }
                    last.next = node;
                }
            } else {
                if (node2 == null) {
                    node2 = node;
                    node2.next = null;
                } else {
                    Node last = node2;
                    while (last.next != null) {
                        last = last.next;
                    }
                    last.next = node;
                }
            }
            iterativeSplittingLinkedList(node0.next, k + 1);
        }
    }

    private static void print(Node node1, Node node2) {
        System.out.println("\nIterating node1 for even k's");
        while (node1 != null) {
            System.out.print(node1.data + " ");
            node1 = node1.next;
        }

        System.out.println("\nIterating node2 for odd k's");
        while (node2 != null) {
            System.out.print(node2.data + " ");
            node2 = node2.next;
        }
    }

    private static void printAlternateNodesUsingHeadRecursion(Node printAlternateNode, int k) {
        if (printAlternateNode == null) {
            return;
        } else {

            // Head Recursion
            printAlternateNodesUsingHeadRecursion(printAlternateNode.next, k + 1);
            if (k % 2 != 0)
                System.out.print(printAlternateNode.data + " ");
        }
    }

    private static void printAlternateNodesUsingTailRecursion(Node printAlternateNode, int k) {
        if (printAlternateNode == null) {
            return;
        } else {
            // Tail Recursion
            if (k % 2 != 0)
                System.out.print(printAlternateNode.data + " ");
            printAlternateNodesUsingTailRecursion(printAlternateNode.next, k + 1);
        }
    }

    private static void addElementsInLinkedList() {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        insert(7);
        insert(8);
        insert(9);
        insert(10);
    }

    private static boolean recursionSum(int[] arr, int ptr) {
        if (ptr == arr.length - 1) {
            return true;
        } else {
            sum = sum + arr[ptr];
            ptr += 1;
            if (recursionSum(arr, ptr) == true)
                return true;
        }
        return false;
    }

    private static void printArrayRecursively(int[] arr, int ptr) {
        if (ptr != arr.length - 1) {
            printArrayRecursively(arr, ptr + 1);
        }
        System.out.print(arr[ptr] + " ");
    }

    private static int findMax(int[] arr, int max, int ptr) {
        if (ptr == arr.length - 1) {
            return max;
        } else {
            ptr += 1;

            /**Thru recursion, reaches to last index, and then compare the last index with the Integer.MIN_VALUE
             * and found that last index value is greater than MIN_VALUE and then recursively in stack, it comes to 4th index to 3rd index,
             * then same comparision occurs and so on...... */

            max = findMax(arr, max, ptr);
            if (arr[ptr] > max) {
                int temp;
                temp = max;
                max = arr[ptr];
                arr[ptr] = temp;
            }
        }
        return max;
    }


    private static void deleteLinkedList(Node delCurrentNode) {
        if (delCurrentNode == null)
            return;

        deleteLinkedList(delCurrentNode.next);
        System.gc();
    }

    private static Node deleteKNode(Node start, int k) {
        if (k < 1)
            return start;
        if (start == null)
            return null;

        if (k == 1) {
            Node res = start.next;
            return res;
        }

        start.next = deleteKNode(start.next, k - 1);
        return start;
    }

    static Node head;
    static Node tail;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static void insert(int data) {
        Node node = new Node(data);

        if (head == null)
            head = node;
        else
            tail.next = node;
        tail = node;
    }

    static void printLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }


}
