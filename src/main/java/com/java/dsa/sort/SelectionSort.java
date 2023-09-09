package com.java.dsa.sort;

import java.util.Arrays;

public class SelectionSort {
    // find min index and swap arr[i] to arr[min] once in every iteration
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 5, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            if (i != minindex) {
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
