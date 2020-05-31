package com.geeksOfGeeks.amazon;


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


public class RemoveHalfNodes {

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
        RemoveHalfNodes tree = new RemoveHalfNodes();
        tree.add(10);
        tree.add(30);
        tree.add(40);
        tree.add(5);
        tree.add(2);
    }
}
