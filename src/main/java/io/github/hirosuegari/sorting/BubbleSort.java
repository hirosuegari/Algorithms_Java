package io.github.hirosuegari.sorting;

public class BubbleSort {
    public int[] bubbleSort(int[] items) {
        for (int j = 0; j < items.length; j++) {
            for (int i = 0; i < items.length - 1; i++) {
                if (items[i] > items[i + 1]) {
                    int k = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = k;
                }
            }
        }
        return items;
    }
}
