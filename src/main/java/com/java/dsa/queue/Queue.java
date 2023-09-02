package com.java.dsa.queue;

public class Queue {
    Node first;
    Node last;
    int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }

    public void getFirst() {
        if (first != null) {
            System.out.println("Queue First : " + first.value);
        } else {
            System.out.println("Queue First : " + null);
        }
    }

    public void getLast() {
        if (last != null) {
            System.out.println("Queue Last : " + last.value);
        } else {
            System.out.println("Queue Last : " + null);
        }
    }

    public void printQueue() {
        Node temp = first;
        if (temp != null) {
            System.out.println("Queue");
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
        } else {
            System.out.println("Queue : empty");
        }
    }

    public void length() {
        if (length != 0) {
            System.out.println("Queue Length : " + length);
        } else {
            System.out.println("Queue Length : " + 0);
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        length++;
    }

    public Node dequeue() {
        Node temp = first;
        if (length == 0) return null;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
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
