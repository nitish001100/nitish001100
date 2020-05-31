package com.idenJava.ds.LinkedListAlgoQues;

// How to implement a linked list using Generics in Java

class Emp{
    int empId;
    String empName;

    public Emp(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
public class LinkedListUsingGenrics {

    static Node<Emp> headNode;
    static Node<Emp> tailNode;

    static class Node<Emp>{
        Emp emp;
        Node next;
        public Node(Emp emp) {
            this.emp = emp;
        }
    }

    static void insert(Emp empObj){
        Node<Emp> empNode = new Node<>(empObj);
        if(headNode == null){
            headNode = empNode;
            tailNode = empNode;
        }else {
            tailNode.next = empNode;
            tailNode = empNode;
        }
    }

    private static void display(){
        Node displayNode = headNode;
        while (displayNode!=null){
            System.out.print(displayNode.emp.toString() +"\n");
            displayNode = displayNode.next;
        }
    }
    public static void main(String[] args) {
        insert(new Emp(001,"Manager"));
        insert(new Emp(002,"emp1"));
        insert(new Emp(003,"emp2"));
        insert(new Emp(004,"emp3"));
        insert(new Emp(005,"emp4"));

        display();

    }
}
