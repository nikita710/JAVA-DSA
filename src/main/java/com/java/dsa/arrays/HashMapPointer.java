package com.java.dsa.arrays;

import java.util.Map;
import java.util.TreeMap;

public class HashMapPointer {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>() {{
            put(1, "Green");
            put(2, "Yellow");
        }};
        Map<Integer, String> map3 = new TreeMap<>() {{
            put(1, "Java");
            put(2, "Python");
        }};

        Map<Integer, String> map2 = map1;
        map2 = map3;
        map1 = map3;
        map1.put(3, "Pink");

        System.out.println("map1 : " + map1);
        System.out.println("map2 : " + map2);

        map2.put(4, "Brown");


        System.out.println(map3);
        System.out.println(map2);
//        System.out.println(map3);

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
