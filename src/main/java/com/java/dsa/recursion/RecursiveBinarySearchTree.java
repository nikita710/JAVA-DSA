package com.java.dsa.recursion;

public class RecursiveBinarySearchTree {

    Node root;

    public RecursiveBinarySearchTree() {

    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;
        if (value == currentNode.value) return true;
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }


    public Node rDeleteNode(int value) {
        return rDeleteNode(root, value);
    }

    private Node rDeleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;
        if (value < currentNode.value) {
            currentNode.left = rDeleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rDeleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                System.out.println(currentNode.right.left.value);
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                System.out.println(currentNode.value);
                currentNode.right = rDeleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
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
