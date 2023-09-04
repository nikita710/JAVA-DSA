package com.java.dsa.hashtable;

public class HashTable {
    private final int size = 7;
    private final Node[] dataMap;

    HashTable() {
        dataMap = new Node[7];
    }

    public void printHashTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + " :");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("    {" + temp.key + " : " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    int hash(String key) {
        int hash = 0;
        char[] keyChar = key.toCharArray();
        for (int asciiValue : keyChar) {
            hash = (hash + asciiValue * 23) % dataMap.length; // always return number between dataMap.length
        }

        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key.equals(key)) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    class Node {
        int value;
        String key;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
