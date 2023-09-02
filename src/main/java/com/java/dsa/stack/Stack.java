package com.java.dsa.stack;

public class Stack {
    Node top;
    int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height++;
    }

    public void getTop() {
        if (top != null) {
            System.out.println("Top : " + top.value);
        } else {
            System.out.println("Top : " + null);
        }
    }

    public void getHeight() {
        if (height != 0) {
            System.out.println("Height : " + height);
        } else {
            System.out.println("Height : " + 0);
        }
    }

    public void printStack() {
        Node temp = top;

        if (temp != null) {
            System.out.println("Stack");
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        } else {
            System.out.println("Stack : empty");
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height != 0) {
            newNode.next = top;
        }
        top = newNode;
        height++;
    }

    public Node pop() {
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
//        if (height == 1) {
//            top = null;
//        } else {
//            top = top.next;
//            temp.next = null;
//        }
        height--;
        return temp;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
