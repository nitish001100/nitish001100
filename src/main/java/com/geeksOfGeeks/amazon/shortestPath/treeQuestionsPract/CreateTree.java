package com.geeksOfGeeks.amazon.shortestPath.treeQuestionsPract;


import java.util.LinkedList;
import java.util.List;

public class CreateTree {

    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }


    public void add(int value) {
        root = addRecursive(root, value);
    }

    static void smallestNode() {
        Node currentNode = root;

        if (currentNode == null)
            System.out.println("Tree is empty!!");

        while (currentNode.left != null)
            currentNode = currentNode.left;

        System.out.println("Smallest element in Tree : " + currentNode.data);
    }

    static void largestNode() {
        Node currentNode = root;
        if (currentNode == null)
            System.out.println("Tree is empty!!");
        while (currentNode.right != null)
            currentNode = currentNode.right;
        System.out.println("Largest element in tree is : " + currentNode.data);
    }

    static void printPostorder(Node node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    static int checkIdentical(Node node1, Node node2) {

        if (node1 == null && node2 == null)
            return 1;

        if ((node1.data == node2.data) && (checkIdentical(node1.left, node2.left) == 1) && (checkIdentical(node1.right, node2.right) == 1))
            return 1;
        else
            return 0;
    }


    static int checkHeightOfATree() {
        Node node = root;
        int leftTreeDepth = 0;
        int rightTreeDepth = 0;
        while (node != null) {
            leftTreeDepth = leftTreeDepth + 1;
            node = node.left;
        }

        while (node != null) {
            rightTreeDepth = rightTreeDepth + 1;
            node = node.right;
        }

        return Math.max(leftTreeDepth, rightTreeDepth) + 1;
    }


    static boolean deleteANode(int data) {

        /**

         Algorithm:

         1. Starting at root, find the deepest and rightmost node in binary tree and node which we want to delete.
         2. Replace the deepest rightmost node’s data with node to be deleted.
         3. Then delete the deepest rightmost node.

         */
        Node node = root;
        Node rightMostNode = null;
        Node elementNode = null;
        while (node.right != null) {
            if (node.data == data)
                elementNode = node;
            node = node.right;
        }
        rightMostNode = node;

        Node forLeft = root;
        if (elementNode == null) {
            while (forLeft.left != null) {
                if (forLeft.data == data) {
                    elementNode = forLeft;
                } else {
                    forLeft = forLeft.left;
                }
            }
        }

        // Replace:
        while (root.right != null) {
            if (root.data == elementNode.data)
                root.data = rightMostNode.data;
            root = root.right;
        }

        System.out.println(rightMostNode.data);
        System.out.println(elementNode.data);

        return false;
    }

    private static Node createFullBinaryTree() {
        root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);

        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.left = n5;
        n2.left = n6;

        return root;
    }

    public static void main(String[] args) {
        CreateTree tree = new CreateTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);

        smallestNode();
        largestNode();

        printPostorder(root);
        System.out.println();

        printPostorder(root);
        System.out.println();
        System.out.println("Checking BST are identical or not - 1 means 'Y' and 0 means 'N'- Ans:" + checkIdentical(root, root));


        System.out.print("Height of tree is: " + checkHeightOfATree());

        /*deleteANode(20);*/

        System.out.print("\nPre Order Transversal: ");
        preOrderTransversal(root);

        System.out.print("\nPost Order Transversal: ");
        postOrderTransversal(root);

        System.out.print("\nIn Order Transversal: ");
        inOrderTransversal(root);

        System.out.println("\nBinary Level Order Transversal: ");
        binaryLevelOrderTransversal();

        System.out.println("\nRight View of a Tree: ");
        rightViewOfATree();

        System.out.println("\nLeft View of a Tree: ");
        leftViewOfATree();

        System.out.println("\nNodes which don't have sibling: ");
        nodesWhichDoNotHaveSibling(root);

        System.out.println("\nRoot Node to Leaf Node: ");
        rootToLeaf(root);

        System.out.println("\nSum of Left leaves: ");
        int sum = 0;
        sum = sumOfLeftView(root, sum);
        System.out.print(sum);

        System.out.println("\nCheck Binary Tree, 1: ");
        System.out.print(checkBinaryTree());

        Node binaryTree = createFullBinaryTree();
        System.out.println("\nCheck Binary Tree, 2: ");
        System.out.print(checkBinaryTree());

        System.out.println("\nPlay with queue: ");
        System.out.print(playWithQueue());

        System.out.println("\nComplete Binary Tree is Identical: ");
        System.out.print(completeBinaryTreeIsIdentical(root, binaryTree));

        System.out.println("Top View of a binary tree: ");
        topViewOfABinaryTree();
    }

    //TODO
    public static void topViewOfABinaryTree(){

    }

    public static boolean completeBinaryTreeIsIdentical(Node tree1, Node tree2) {

        if (tree1 == null && tree2 == null)
            return true;

        if(tree1!=null && tree2!=null){
            if(tree1.data == tree2.data)
                return true;

            if(completeBinaryTreeIsIdentical(tree1.left, tree2.left))
                return true;

            if(completeBinaryTreeIsIdentical(tree1.right, tree2.right))
                return true;
        }

        return false;
    }

    public static boolean playWithQueue() {

        if (root == null)
            return true;

        LinkedList<Node> queue = new LinkedList<>();

        // First, Add the root node in queue.
        queue.add(root);

        // Second, Check queue is empty or not.
        while (!queue.isEmpty()) {
            Node toBeDeletedNode = queue.remove();
            if (toBeDeletedNode.left == null || toBeDeletedNode.right == null || toBeDeletedNode == null)
                return false;

            if (toBeDeletedNode.left != null && toBeDeletedNode.right != null) {
                queue.add(toBeDeletedNode.left);
                queue.add(toBeDeletedNode.right);
            }

        }
        return true;
    }

    public static boolean checkBinaryTree() {
        if (root == null)
            return true;

        LinkedList<Node> queue = new LinkedList();
        queue.add(root);

        boolean hasLeftChild, hasRightChild;


        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            hasLeftChild = (currentNode.left != null);
            hasRightChild = (currentNode.right != null);

            if ((hasLeftChild && !hasRightChild) || (!hasLeftChild && hasRightChild))
                return false;

            if (hasLeftChild && hasRightChild) {
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
        return true;
    }

    private static int sumOfLeftView(Node currentNode, int sum) {
        Node node = currentNode;

        if (node == null)
            return 0;

        if (currentNode == null && currentNode == null) {
            sum = sum + currentNode.left.data;
        }

        sumOfLeftView(node.left, sum);
        sumOfLeftView(node.right, sum);
        return sum;
    }

    private static void rootToLeaf(Node currentNode) {
        Node node = currentNode;

        if (node == null)
            return;

        if (node.left != null) {
            System.out.print(node.data + " ");
            rootToLeaf(node.left);
        }

        if (node != null) {
            System.out.print(node.data + " ");
            rootToLeaf(node.right);
        }

       /* while (node != null) {
            System.out.print(node.data + " ");
            node = node.left;
        }*/

    }

    private static void nodesWhichDoNotHaveSibling(Node currentNode) {

        if (currentNode == null)
            return;

        if (currentNode.left == null && currentNode.right != null)
            System.out.print(currentNode.right.data + " ");

        if (currentNode.right == null && currentNode.left != null)
            System.out.print(currentNode.left.data + " ");

        nodesWhichDoNotHaveSibling(currentNode.left);
        nodesWhichDoNotHaveSibling(currentNode.right);
    }

    private static void rightViewOfATree() {
        Node node = root;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

    private static void leftViewOfATree() {
        Node node = root;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.left;
        }
    }

    private static void binaryLevelOrderTransversal() {

        Node currentNode = root;

        if (currentNode == null)
            return;

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private static void postOrderTransversal(Node root) {
        Node currentNode = root;

        if (currentNode != null) {
            postOrderTransversal(currentNode.left);
            postOrderTransversal(currentNode.right);
            System.out.print(currentNode.data + " ");
        }
    }

    private static void inOrderTransversal(Node root) {
        Node currentNode = root;

        if (currentNode != null) {
            inOrderTransversal(root.left);
            System.out.print(root.data + " ");
            inOrderTransversal(root.right);
        }
    }

    static void preOrderTransversal(Node node) {
        Node currentNode = node;

        if (currentNode != null) {
            System.out.print(currentNode.data + " ");
            preOrderTransversal(node.left);
            preOrderTransversal(node.right);
        }
    }


}
