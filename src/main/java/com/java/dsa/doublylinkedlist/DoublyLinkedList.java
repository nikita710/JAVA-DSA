package com.java.dsa.doublylinkedlist;

public class DoublyLinkedList {
    private Node tail;
    private Node head;
    private int length;

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void getHead() {
        if (head != null) {
            System.out.println("Head : " + head.value);
        } else {
            System.out.println("Head : " + null);
        }
    }

    public void getTail() {
        if (tail != null) {
            System.out.println("Tail : " + tail.value);
        } else {
            System.out.println("Tail : " + null);
        }
    }

    public void getLength() {
        if (length != 0) {
            System.out.println("Length : " + length);
        } else {
            System.out.println("Length : " + 0);
        }
    }

    public void printList() {
        if (head == null) System.out.println("null");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }


    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

}
