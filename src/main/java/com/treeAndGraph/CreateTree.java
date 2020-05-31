package com.treeAndGraph;

public class CreateTree {

    Node rootNode;

    class Node {
        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
            leftChild = null;
            rightChild = null;
        }
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.leftChild = addRecursive(current.leftChild, value);
        } else if (value > current.value) {
            current.rightChild = addRecursive(current.rightChild, value);
        } else {
            return current;
        }

        return current;
    }

    public void add(int value) {
        rootNode = addRecursive(rootNode, value);
    }

    private static void postOrderTransversal(Node root) {
        Node currentNode = root;

        if (currentNode != null) {
            postOrderTransversal(currentNode.leftChild);
            postOrderTransversal(currentNode.rightChild);
            System.out.print(currentNode.value + " ");
        }
    }

    private static void inOrderTransversal(Node root) {
        Node currentNode = root;

        if (currentNode != null) {
            inOrderTransversal(root.leftChild);
            System.out.print(root.value + " ");
            inOrderTransversal(root.rightChild);
        }
    }

    static void preOrderTransversal(Node node) {
        Node currentNode = node;

        if (currentNode != null) {
            System.out.print(currentNode.value + " ");
            preOrderTransversal(node.leftChild);
            preOrderTransversal(node.rightChild);
        }
    }


    public static void main(String[] args) {
        CreateTree tree = new CreateTree();
        tree.add(10);
        tree.add(40);
        tree.add(50);
        tree.add(60);
        tree.add(0);
        tree.add(100);

        preOrderTransversal(tree.rootNode);
        System.out.println();
        postOrderTransversal(tree.rootNode);
        System.out.println();
        inOrderTransversal(tree.rootNode);
        System.out.println();

    }
}
