package com.idenJava.ds.DataStructures.LinkedListPract.LinkedListInterviewQuestions;

//How to find the middle element of a singly linked list in one pass?

class LinkedList{

    private static Node head;
    private static Node tail;

    class Node{

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

     void addNode(int data){
        Node node = new Node(data);

        if(head==null){
            head = node;
            tail = node;
        }else {

            tail.next = node;
            tail = node;
        }
    }

    void display(){
        Node current = head;
        if(current == null){
            System.out.println("List is empty!!");
            return;
        }else {
            while (current!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }

    }

    static int findMidElement(){
        Node current = head;
        Node middle = head;

        int length = 0;
        while (current.next !=null){
            length++;
            if(length%2==0){
                middle = middle.next;
            }
            current = current.next;
        }

        if(length%2 == 1){
            middle = middle.next;
        }

        return middle.data;
    }

}

public class LinkedListMiddleEle {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(10);
        linkedList.addNode(20);
        linkedList.addNode(30);
        linkedList.addNode(40);
        linkedList.addNode(50);
        linkedList.addNode(60);
        linkedList.addNode(70);
        linkedList.addNode(80);
        linkedList.addNode(90);

        linkedList.display();

        System.out.println(LinkedList.findMidElement());


    }
}
