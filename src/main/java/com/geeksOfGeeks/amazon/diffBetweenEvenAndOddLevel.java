package com.geeksOfGeeks.amazon;

import static com.geeksOfGeeks.amazon.Tree.*;

class Tree {

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

    public static Node insertNode(Node node, int data) {

        if (node == null)
            return new Node(data);
        else {
            if (node.data < data) {
                node.left = insertNode(node.left, data);
            } else if (node.data > data) {
                node.right = insertNode(node.right, data);
            }
        }
        return node;
    }

    public static void addNode(int data) {
        root = insertNode(root, data);
    }
}

public class diffBetweenEvenAndOddLevel {

    static int even = 0;
    static int odd = 0;
    static int counterLevel = 1;

    private static void iterative(Tree.Node node) {

        if (node == null)
            return;

        if (counterLevel % 2 == 0)
            even += node.data;
        else
            odd += node.data;

        counterLevel += 1;

        iterative(node.left);
        iterative(node.right);
    }

    static int sum(Tree.Node node)
    {
        if (node == null)
            return 0;
        return sum(node.left) + node.data + sum(node.right);
    }


    static int isSumTree(Tree.Node node)
    {
        int ls, rs;
        if ((node == null) || (node.left == null && node.right == null))
            return 1;
        ls = sum(node.left);
        rs = sum(node.right);
        if ((node.data == ls + rs) && (isSumTree(node.left) != 0)
                && (isSumTree(node.right)) != 0)
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);
        addNode(50);
        addNode(60);
        addNode(70);

        iterative(root);
        System.out.println("Difference between even & odd levels data: " + (Math.max(even, odd) - Math.min(even, odd)));
        System.out.println("Sum even & odd levels data: " + (even + odd));
        System.out.println("Check Sum Tree: 0 for No and 1 for Yes: ");
        System.out.println(isSumTree(root));

    }
}
