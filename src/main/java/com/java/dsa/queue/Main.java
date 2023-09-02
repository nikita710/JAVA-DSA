package com.java.dsa.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.enqueue(6);


        System.out.println();
        System.out.println("Dequeue : " + myQueue.dequeue().value);
        System.out.println("Dequeue : " + myQueue.dequeue().value);
        System.out.println("Dequeue : " + myQueue.dequeue());
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.length();
        myQueue.printQueue();

    }
}
