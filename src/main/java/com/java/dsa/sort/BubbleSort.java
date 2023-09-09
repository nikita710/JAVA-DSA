package com.java.dsa.sort;

import java.util.Arrays;

public class BubbleSort {
    //Sort the largest element to the end
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 5, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
