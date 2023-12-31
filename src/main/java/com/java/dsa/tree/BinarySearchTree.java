package com.java.dsa.tree;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node temp = root;
            while (true) {
                if (newNode.value == temp.value) return false;

                if (newNode.value < temp.value) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        return true;
                    }
                    temp = temp.left;
                } else {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return true;
                    }
                    temp = temp.right;
                }
            }
        }
    }


    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    //Recursion Solution
    private boolean rContains(Node current, int value) {
        if (current == null) return false;
        if (value == current.value) return true;
        if (value < current.value) {
            return rContains(current.left, value);
        } else {
            return rContains(current.right, value);
        }
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private boolean rInsert(int value) {
        return true;
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
