package com.java.dsa.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.prepend(0);

//        System.out.println(myDLL.insert(0, 25));

        System.out.println(myDLL.remove(1));

        // Get Item
//        System.out.println(myDLL.get(2).value);

        // Set Item
//        System.out.println(myDLL.set(0, 13));


        // Remove Items From First
//        System.out.println(myDLL.removeFirst().value);
//        System.out.println(myDLL.removeFirst().value);
//        System.out.println(myDLL.removeFirst());

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
