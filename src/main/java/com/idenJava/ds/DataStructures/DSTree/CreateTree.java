package com.idenJava.ds.DataStructures.DSTree;


class Node {

    int value;
    Node left;
    Node right;

    public Node(int data) {
        value = data;
        left = null;
        right = null;
    }
}


public class CreateTree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public static void main(String[] args) {
        CreateTree createTree = new CreateTree();
        createTree.add(10);
        createTree.add(20);
        createTree.add(30);
        createTree.add(40);
        createTree.add(50);
    }
}
