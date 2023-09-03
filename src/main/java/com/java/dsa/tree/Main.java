package com.java.dsa.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println(myBST.insert(50));
        System.out.println(myBST.insert(45));
        System.out.println(myBST.insert(55));
        System.out.println(myBST.insert(48));
        System.out.println(myBST.insert(47));

        System.out.println(myBST.root.value);
        System.out.println(myBST.root.left.value);
        System.out.println(myBST.root.left.right.value);
        System.out.println(myBST.root.left.right.left.value);

        System.out.println(myBST.contains(42));
//        System.out.println(myBST.root.value);
    }
}
