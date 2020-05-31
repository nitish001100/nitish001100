package com.idenJava.ds.DataStructures;

/**

 Algorithm-

 Create a class Node which has two attributes: data and next. Next is a pointer to the next node.
 Create another class which has two attributes: head and tail.

 addNode() will add a new node to the list:

 Create a new node.

 1: It first checks, whether the head is equal to null which means the list is empty.
 2: If the list is empty, both head and tail will point to the newly added node.
 3: If the list is not empty, the new node will be added to end of the list such that tail's next will point to the newly added node. This new node will become the new tail of the list.

 */
public class LinkedList {

    Node head, tail = null;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }

    void delete(int data){
        Node forDeleteClone = head;

        if(forDeleteClone == null){
            System.out.println("Linked List is empty!!");
        }else {
            while (forDeleteClone!=null){
                if(forDeleteClone.data == data){
                    //delete code
                }
                forDeleteClone = forDeleteClone.next;
            }
        }
    }
    void display() {
        Node current = head;
        if(current == null){
            System.out.println("List is empty!!");
            return;
        }else {
            while (current!=null){
                System.out.println(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(3);
        linkedList.insert(100);
        linkedList.insert(105);
        linkedList.insert(5);
        linkedList.insert(1);

        linkedList.display();

    }
}
