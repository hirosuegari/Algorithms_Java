package io.github.hirosuegari.sorting;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void BubbleSortを0から100までのランダムな数字で実行() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] seed = makeSeed(100);
        int[] result = bubbleSort.bubbleSort(seed);
        for (int k = 0; k < result.length - 1; k++) {
            int l = result[k + 1];
            assertThat(result[k], lessThan(l));
        }
    }

    @Test
    public void 計測を100回行う() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] seed = makeSeed(10000);
        int cnt = 0;
        while (cnt <= 100) {
            Long start = System.nanoTime();
            bubbleSort.bubbleSort(seed);
            Long end = System.nanoTime();
            System.out.println(end - start);
            cnt++;
        }
    }

    private int[] makeSeed(int max) {
        List<Integer> items = new ArrayList<Integer>();
        int i = 0;
        while (items.size() <= max) {
            items.add(i);
            i++;
        }

        Collections.shuffle(items);
        int[] seed = new int[items.size()];
        for (int j = 0; j < items.size(); j++) {
            seed[j] = items.get(j);
        }
        return seed;
    }
}