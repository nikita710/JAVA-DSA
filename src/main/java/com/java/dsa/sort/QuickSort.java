package com.java.dsa.sort;

import java.util.Arrays;

public class QuickSort {
    // Pivot assume starting index of array = 0 arrange smallest element to the left of Pivot and largest element to the right
    // ex = {2,1,3,4,6,7,5} Pivot is 4
    public static void main(String[] args) {
        int[] array = {4, 6, 1, 7, 3, 2, 5};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                if (swapIndex != i) {
                    swap(array, swapIndex, i);
                }
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


}
