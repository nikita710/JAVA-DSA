package com.java.dsa.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);
        myStack.push(20);

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        System.out.println();
        System.out.println("pop : " + myStack.pop().value);
        myStack.printStack();

    }
}
