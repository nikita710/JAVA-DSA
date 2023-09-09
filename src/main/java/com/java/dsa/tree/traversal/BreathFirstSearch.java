package com.java.dsa.tree.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {
    Node root;

    public static void main(String[] args) {
        BreathFirstSearch BFS = new BreathFirstSearch();
        BFS.rInsert(47);
        BFS.rInsert(21);
        BFS.rInsert(18);
        BFS.rInsert(27);
        BFS.rInsert(76);
        BFS.rInsert(52);
        BFS.rInsert(82);

        System.out.println(BFS.root.left.left.value);
        System.out.println(BFS.root.right.right.value);
        System.out.println(BFS.traversalBFS());
    }

    public Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value == currentNode.value) return currentNode;
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

    public ArrayList<Integer> traversalBFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        return results;
    }

    class Node {
        int value;
        Node right;
        Node left;

        Node(int value) {
            this.value = value;
        }
    }
}
