package com.java.dsa.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {7, 8, 9, 2, 4, 6};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i - 1;
            while (prev >= 0 && temp < arr[prev]) {
                arr[prev + 1] = arr[prev];
                arr[prev] = temp;
                prev--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
