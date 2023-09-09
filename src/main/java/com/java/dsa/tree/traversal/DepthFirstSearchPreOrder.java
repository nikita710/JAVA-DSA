package com.java.dsa.tree.traversal;

import java.util.ArrayList;

public class DepthFirstSearchPreOrder {
    Node root;

    public static void main(String[] args) {
        DepthFirstSearchPreOrder dfsPreOrder = new DepthFirstSearchPreOrder();
        dfsPreOrder.rInsert(47);
        dfsPreOrder.rInsert(21);
        dfsPreOrder.rInsert(18);
        dfsPreOrder.rInsert(27);
        dfsPreOrder.rInsert(76);
        dfsPreOrder.rInsert(52);
        dfsPreOrder.rInsert(82);

        System.out.println(dfsPreOrder.root.left.left.value);
        System.out.println(dfsPreOrder.root.right.right.value);
        System.out.println(dfsPreOrder.traversPreOder());
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value == currentNode.value) return currentNode;
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
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

    public ArrayList<Integer> traversPreOder() {

        ArrayList<Integer> results = new ArrayList<>();

        class Traversal {
            Traversal(Node currentNode) {
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traversal(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traversal(currentNode.right);
                }
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
