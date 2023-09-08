package com.java.dsa.recursion;

public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println("Factorial of 4 : " + recursion.factorial(4));
        System.out.println("Fibonacci series for 4 : " + recursion.fibonacci(4));

    }

    //    Factorial on N
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Fibonacci number
    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
