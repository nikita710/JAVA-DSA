package com.java.dsa.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
//        myDLL.prepend(0);

        // Remove Items From First
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst());

        // Remove Items From Last
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast());

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.printList();
    }
}
