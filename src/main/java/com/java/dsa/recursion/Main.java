package com.java.dsa.recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursive Binary Search tree");
        RecursiveBinarySearchTree rBST = new RecursiveBinarySearchTree();

        rBST.rInsert(47);
        rBST.rInsert(21);
        rBST.rInsert(55);
        rBST.rInsert(40);
        rBST.rInsert(18);
        rBST.rInsert(15);
        rBST.rInsert(20);
        rBST.rInsert(38);
        rBST.rInsert(45);

        System.out.println(rBST.minValue(rBST.root));
        System.out.println(rBST.rDeleteNode(21).value);
        System.out.println(rBST.root.left.right.left);
//        rBST.rInsert(50);
//        rBST.rInsert(45);
//        rBST.rInsert(42);
//        rBST.rInsert(48);
//
//        System.out.println(rBST.root.value);
//        System.out.println(rBST.root.left.value);
//        System.out.println(rBST.root.left.left.value);
//        System.out.println(rBST.root.left.right.value);
//
//        System.out.println(rBST.rContains(48));
//        System.out.println(rBST.rContains(42));
//        System.out.println(rBST.rContains(125));


    }
}
