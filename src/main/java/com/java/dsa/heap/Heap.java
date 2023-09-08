package com.java.dsa.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private final List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;
        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove() {
        if (heap.isEmpty()) return null;
        if (heap.size() == 1) return heap.remove(0);
        Integer temp = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        shrinkDown(0);
        return temp;
    }

    private void shrinkDown(int index) {
        int maxIndex = index;
        while (true) {
            int leftChild = leftChild(index);
            int rightChild = rightChild(index);
            if (leftChild < heap.size() && heap.get(leftChild) > heap.get(maxIndex)) {
                maxIndex = leftChild;
            }
            if (rightChild < heap.size() && heap.get(rightChild) > heap.get(maxIndex)) {
                maxIndex = rightChild;
            }
            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }


    public List<Integer> printHeap() {
        return new ArrayList<>(heap);
    }

}
