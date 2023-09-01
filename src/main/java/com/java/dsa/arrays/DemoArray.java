package com.java.dsa.arrays;

import java.util.Arrays;

public class DemoArray {
    static int[] nums; // by default 0
    static String[] strs; // by default null

    public static void main(String[] args) {

        // int type Array
        nums = new int[]{11, 21, 36, 47, 58};
        System.out.println(Arrays.toString(nums));

        int[] doubleNums = Arrays.stream(nums).map(num -> num * 2).toArray();
        System.out.print("Multiply by Two : ");
        System.out.println(Arrays.toString(doubleNums));

        int sum = Arrays.stream(nums).sum();
        System.out.println("sum " + sum);

        long count = Arrays.stream(nums).count();

        System.out.println(count);

        // String type Array
        strs = new String[]{"Java", "Python", "JavaScript", "C", "C++"};
        System.out.println(Arrays.toString(strs));
        for (String s : strs) {
            System.out.print(s + " ");
        }
    }
}
