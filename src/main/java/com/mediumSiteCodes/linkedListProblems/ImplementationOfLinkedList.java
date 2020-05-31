package com.mediumSiteCodes.linkedListProblems;


class Employee {
    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}

class LinkedList {
    Node headNode;
    Node tailNode;

    static class Node<Employee> {
        Employee empObject;
        Node next;

        public Node() {
        }

        public Node(Employee empObject) {
            this.empObject = empObject;
        }
    }

    void insert(Employee empObject) {
        Node node = new Node(empObject);
        if (headNode == null)
            headNode = node;
        else
            tailNode.next = node;
        tailNode = node;
    }

    static void printLinkedList(Node headNode) {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.empObject.toString() + "\n");
            currentNode = currentNode.next;
        }
    }
}

public class ImplementationOfLinkedList {
    public LinkedList.Node addObjectInLinkedList() {
        LinkedList ll = new LinkedList();
        ll.insert(new Employee(100, "A"));
        ll.insert(new Employee(101, "B"));
        ll.insert(new Employee(102, "C"));
        ll.insert(new Employee(103, "D"));
        ll.insert(new Employee(104, "E"));
        return ll.headNode;
    }
}
