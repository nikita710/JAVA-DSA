package com.java.dsa.recursion;

public class CallStack {
    private static void methodThree() {
        System.out.println("THREE");
    }

    private static void methodTwo() {
        methodThree();
        System.out.println("TWO");
    }

    public static void methodOne() {
        methodTwo();
        System.out.println("ONE");
    }


    public static void main(String[] args) {
        methodOne();
    }
}
