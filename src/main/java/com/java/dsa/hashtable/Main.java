package com.java.dsa.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHT = new HashTable();
//        System.out.println(myHT.hash("nikita"));
        myHT.set("nails", 500);
        myHT.set("tile", 200);
        myHT.set("lumber", 250);

        myHT.set("bolts", 700);
        myHT.set("screws", 950);
        myHT.printHashTable();

        System.out.println(myHT.get("nails"));
        System.out.println(myHT.get("nail"));
    }
}
