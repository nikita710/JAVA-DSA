package com.java.dsa.tree.traversal;

import java.util.ArrayList;

public class DepthFirstSearchPostOrder {
    Node root;

    public static void main(String[] args) {
        DepthFirstSearchPostOrder dfsPostOrder = new DepthFirstSearchPostOrder();
        dfsPostOrder.rInsert(47);
        dfsPostOrder.rInsert(21);
        dfsPostOrder.rInsert(76);
        dfsPostOrder.rInsert(18);
        dfsPostOrder.rInsert(27);
        dfsPostOrder.rInsert(52);
        dfsPostOrder.rInsert(82);

        System.out.println(dfsPostOrder.root.left.left.value);
        System.out.println(dfsPostOrder.root.right.right.value);
        System.out.println(dfsPostOrder.dfsPostOrder());
    }

    //      47
    //  27      76
    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value == currentNode.value) return currentNode;

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value); // 27
        }
        if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    public ArrayList<Integer> dfsPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traversal {
            Traversal(Node currentNode) {
                if (currentNode.left != null) {
                    new Traversal(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traversal(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traversal(root);
        return results;
    }

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
}
