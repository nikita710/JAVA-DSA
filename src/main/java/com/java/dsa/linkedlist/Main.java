package com.java.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList(2);

        linkedList1.prepend(1);
        linkedList1.append(4);
        linkedList1.append(5);
        System.out.println("Print Item");
        linkedList1.printList();

        System.out.println("Insert 3 at Third Position");
        System.out.println(linkedList1.insert(2, 3));
        linkedList1.reverse();
        linkedList1.printList();

        linkedList1.getHead();
        linkedList1.getTail();
        linkedList1.getLength();

        System.out.println("Get Third Item");
        System.out.println(linkedList1.get(2).value);

        System.out.println("Remove Third Item");
        System.out.println(linkedList1.remove(2).value);

        System.out.println("Remove item from start");
        System.out.println(linkedList1.removeFirst().value);

        System.out.println("Remove item last");
        System.out.println(linkedList1.removeLast().value);
        System.out.println(linkedList1.removeLast().value);

        System.out.println("Print Exists Item");
        linkedList1.printList();

        linkedList1.getHead();
        linkedList1.getTail();
        linkedList1.getLength();
    }
}
