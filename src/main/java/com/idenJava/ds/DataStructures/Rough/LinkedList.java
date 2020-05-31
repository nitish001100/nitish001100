package com.idenJava.ds.DataStructures.Rough;


// List = 1 ,2, 3, 4, 5, 6, 7
public class LinkedList {

    public Node headNode;
    public Node tailNode;

    class Node {
        public Node next;
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertNode(int data) {

        Node node = new Node(data);

        if (headNode == null) {
            headNode = node;
            tailNode = node;
        }else {
            tailNode.next = node;
            tailNode = node;
        }
    }

    static void printLinkedList(Node node){
        Node transverseLinkedList = node;
        while (transverseLinkedList.next!=null){
            System.out.print(transverseLinkedList.data+" ");
            transverseLinkedList = transverseLinkedList.next;
        }
        System.out.print(transverseLinkedList.data);
    }

    static void deleteNodeFromEnd(Node node){
        System.out.println();
        if(node == null)
            System.out.println("Empty Linked List!!");
        while (node.next.next!=null){
            node = node.next;
        }
        node.next = null;
    }

    static Node deleteNodeFromStart(Node node){
        System.out.println();
        Node deleteNodeFromStart = node;
        if(deleteNodeFromStart == null){
            System.out.println("Linked List is empty!!");
        }

        deleteNodeFromStart = deleteNodeFromStart.next;

        return deleteNodeFromStart;
    }

    public void sort() {
        Node current = headNode, index = null;
        int temp;

        if(headNode == null) {
            return;
        }
        else {
            while(current != null) {
                index = current.next;
                while(index != null) {
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode(10);
        linkedList.insertNode(30);
        linkedList.insertNode(20);
        linkedList.insertNode(-10);
        linkedList.insertNode(80);

        // print linked list
        printLinkedList(linkedList.headNode);

        // delete node from end
        deleteNodeFromEnd(linkedList.headNode);

        // print linked list and check whether end node get deleted or not.
        printLinkedList(linkedList.headNode);

        //delete node from starting.
        Node deleteNodeFromStart = linkedList.deleteNodeFromStart(linkedList.headNode);

        // print linked list and check whether start node get deleted or not.
        printLinkedList(deleteNodeFromStart);


        // sort a linked list
        linkedList.sort();
        linkedList.sortCustom();

        System.out.println();
        printLinkedList(linkedList.sortedNode);

        /**

         Input:  
         
         list1 = 5->2->3->8
         list2 = 1->7->4->5
         
         Output:  New list = 5->7->4->8
         
         */

        LinkedList l1 = new LinkedList();
        l1.insertNode(5);
        l1.insertNode(2);
        l1.insertNode(3);
        l1.insertNode(8);

        LinkedList l2 = new LinkedList();
        l2.insertNode(1);
        l2.insertNode(7);
        l2.insertNode(4);
        l2.insertNode(5);

        System.out.println("compareAndTakeLarger()");
        Node compareAndTakeLarger = compareAndTakeLarger(l1.headNode, l2.headNode);
        printLinkedList(compareAndTakeLarger);

    }

    private static Node compareAndTakeLarger(Node l1, Node l2) {
        if(l1 == null || l2 == null)
            System.out.println("Can't compare because one is empty!!");

        LinkedList l3 = new LinkedList();

        while (l1!=null){
            while (l2!=null){
                if(l1.data < l2.data){
                    l3.insertNode(l2.data);
                }else {
                    l3.insertNode(l1.data);
                }
                break;
            }
            l1 = l1.next;
            l2= l2.next;
        }
        return l3.headNode;
    }

    Node sortedNode;

    private void sortCustom() {
        sortedNode = headNode;
        if(sortedNode==null){
            return;
        }

        Node i = sortedNode , j;
        int temp;

        while (i!=null){
            j = i.next;
            while (j!=null){
                if(!(i.data < j.data)){
                    temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }
}
